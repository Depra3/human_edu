package com.human.spring;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@Autowired
	private MemDAO mDAO;
	@Autowired
	private PostDAO pDAO;

	@RequestMapping("/")
	public String home(HttpServletRequest req, Model m) {
		HttpSession session = req.getSession();
		m.addAttribute("gUserid",(String) session.getAttribute("gUserid"));
		
		ArrayList<PostDTO> pdto = pDAO.pList();
		m.addAttribute("pt",pdto);
		return "home"; 
	}
	
//	@RequestMapping("/home")
//	@ResponseBody
//	public String thome(HttpServletRequest req, Model m) {
		
//		JSONArray ja = new JSONArray();
//		for (int i = 0; i < pdto.size(); i++) {
//			JSONObject jo = new JSONObject();
//			jo.put("post_id", pdto.get(i).getPost_id());
//			jo.put("title", pdto.get(i).getTitle());
//			jo.put("writer", pdto.get(i).getWriter());
//			jo.put("cDate",pdto.get(i).getCreated());
//			jo.put("uDate", pdto.get(i).getUpdated());
//			ja.add(jo);
//			System.out.println(jo);
//		}
//		return "home";
//	}
	@RequestMapping("/login")
	public String login() { return "login"; }
	@RequestMapping("/signin")
	public String signin() { return "signin"; }
	@RequestMapping("/write")
	public String write() { return "write";}
	
	@RequestMapping("/view")
	public String board(HttpServletRequest req, Model m) {
		int postid=Integer.parseInt(req.getParameter("post_id"));
		ViewDTO pdto = pDAO.boardView(postid);
		m.addAttribute("post",pdto);
		return "board";
	}
	@RequestMapping("/delete")
	public String postDel(HttpServletRequest req) {
		HttpSession s = req.getSession(); // 로그인 유무 확인
		String currUser = (String)s.getAttribute("gUserid");
		if(currUser == null) {
			return "redirect:/";
		}
		int postid=Integer.parseInt(req.getParameter("post_id"));
		pDAO.boardDel(postid);
		return "redirect:/";
	}
	@RequestMapping("/boardUp")
	public String uBoard(HttpServletRequest req, Model m) {
		
		int postid=Integer.parseInt(req.getParameter("post_id"));
		ViewDTO pdto = pDAO.boardView(postid);
		m.addAttribute("post",pdto);
		return "boardUp";
	}
	@RequestMapping("/update")
	public String postUp(HttpServletRequest req) {
		HttpSession s = req.getSession();
		String currUser = (String)s.getAttribute("gUserid");
		if(currUser == null) {
			return "redirect:/";
		}
		LocalDateTime now = LocalDateTime.now();
		String uDate = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
		int postid=Integer.parseInt(req.getParameter("post_id"));
		String title = req.getParameter("title");
		String content= req.getParameter("content");
		System.out.println(postid+' '+title+' '+content+' '+uDate);
		pDAO.boardUp(postid,title,content,uDate);
		return "redirect:/";
	}
//	@RequestMapping("/vSearch")
//	@ResponseBody
//	public String vSearch(HttpServletRequest req, Model m) {
//		
//		int a = Integer.parseInt(req.getParameter("post_id"));
//		PostDTO pdto = pDAO.boardView(a);
//		m.addAttribute("post",pdto);
//		JSONArray ja = new JSONArray();
//		JSONObject jo = new JSONObject();
//		jo.put("post_id", pdto.getPost_id());
//		jo.put("title", pdto.getTitle());
//		jo.put("content", pdto.getContent());
//		jo.put("writer", pdto.getWriter());
//		jo.put("cDate",pdto.getCreated());
//		jo.put("uDate", pdto.getUpdated());
//		ja.add(jo);
//		System.out.println(jo);
//		System.out.println(ja.toString());
//		return ja.toString();
//	}
	
	@RequestMapping("/checkDup")
	@ResponseBody
	public String doCheckDup(HttpServletRequest req) {
		int n = mDAO.checkDup(req.getParameter("loginid"));
//		return Integer.valueOf(n).toString();
		return Integer.toString(n);
	}
	@RequestMapping("/viewuser")
	@ResponseBody
	public String doViewUser(HttpServletRequest req) {
		
		String retval = "";
		try {
			String uid = req.getParameter("loginid");
			String pw = req.getParameter("pw");
			String name = req.getParameter("name");
			String mobile = req.getParameter("mobile");
			
			mDAO.memberSignUp(uid, pw, name, mobile);
			retval="ok";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			retval="fail";
		}
//		System.out.println(retval);
		return retval;
	}
	@RequestMapping("/checkuser")
	@ResponseBody
	public String doCheckUser(HttpServletRequest req) {
		String retval="";
		try {
			String uid = req.getParameter("loginid");
			String pw = req.getParameter("pw");
			
			int n = mDAO.getMemberCount(uid, pw);
			if (n==1) {
				HttpSession session = req.getSession();
				session.setAttribute("gUserid", uid);
				retval="ok";
			} else { retval="fail"; }
		} catch (Exception e) {
			retval="fail";
		}
		return retval;
	}
	@RequestMapping("/logincheck")
	@ResponseBody
	public String doLoginCheck(HttpServletRequest req) {
		String str="";
		HttpSession session = req.getSession();
		String userid = (String) session.getAttribute("gUserid");
		if (userid==null||userid.equals("")) { // 로그인되지 않은 상황
			str = "";
		} else {
			str = userid;
		}
		return str;
	}
	@RequestMapping("/signout")
	@ResponseBody
	public String doSignout(HttpServletRequest req) {
		String retval="";
		try {
			HttpSession session = req.getSession();
			session.invalidate();
			retval="ok";
		} catch (Exception e) {
			retval="fail";
		}
		return retval;
	}
	@RequestMapping("/dowrite")
	@ResponseBody
	public String doWrite(HttpServletRequest req) {
		HttpSession s = req.getSession();
		String currUser = (String)s.getAttribute("gUserid");
		if(currUser == null) {
			return "redirect:/";
		}
		HttpSession session = req.getSession();
		LocalDateTime now = LocalDateTime.now();
		String retval = "";
		try {
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			String writer = (String) session.getAttribute("gUserid");
			String cDate = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
			System.out.println(title + ' ' + content + ' ' + writer + ' ' + cDate);
			pDAO.boardWrite(title, content, writer, cDate);
			retval="ok";
		} catch (Exception e) {
			retval="fail";
		}
		System.out.println(retval);
		return retval;
	}
}
