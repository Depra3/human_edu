package com.human.spring;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Member;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@Autowired
	private MemDAO mem;
//	HttpSession session;
	
	@RequestMapping("/")
	public String home(HttpServletRequest req, Model m) {
//		HttpSession session = req.getSession();
//		session = req.getSession();
//		String ses_info = (String) session.getAttribute("gUserid");
//		m.addAttribute("userid",ses_info);
		return "home";
	}
	@RequestMapping("/login")
	public String doLogin() {
		return "login";
	}
	@RequestMapping("/checkuser")
//	public String doCheck(Member member, Model m) {
	public String doCheck(HttpServletRequest req, Model m) {
		String uid = req.getParameter("loginid");
		String pw = req.getParameter("pw");
		int i = mem.getMemberCount(uid, pw);
//		System.out.println(uid+' '+pw+' '+' '+i);
		if (i==1) {
			HttpSession session = req.getSession(); // 세션 초기화
			session.setAttribute("gUserid", uid); // 값 설정
//			ArrayList<MemberDTO> memList = mem.list();
//			m.addAttribute("mem",memList);
			return "redirect:/";
		}else {
			m.addAttribute("error",1);
			return "login";
		}
	}
	@RequestMapping("/signin")
	public String doSignin() {
		return "signin";
	}
	@RequestMapping("/signup")
	public String doSignUp(HttpServletRequest req, Model m) {
		String uid = req.getParameter("loginid");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
//		System.out.println(uid+' '+pw+' '+name+' '+mobile);
		int i = mem.chkMemberCount(uid);
		if(i==1) {
			m.addAttribute("error", i);
			return "signin";
		}else {
			mem.memberSignUp(uid, pw, name, mobile);
			return "login";
		}
	}
	@RequestMapping("/signout")
	public String doSignout(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.invalidate();
		return "redirect:/";
	}
	@RequestMapping("/viewuser")
//	public String doView(Member member, Model m) {
	public String doView(HttpServletRequest req, Model m,Member member) {
		
		m.addAttribute("mem",member);
////		if (member.getPw().equals(member.getPwchk())) {
//			return "userinfo";
////		}else {
////			return "signin";
////		}
		HttpSession session = req.getSession();
		String ses_info = (String) session.getAttribute("gUserid");
		m.addAttribute("userid",ses_info);
		return "userinfo";
	}
}
