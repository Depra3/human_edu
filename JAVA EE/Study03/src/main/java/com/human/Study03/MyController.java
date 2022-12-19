package com.human.Study03;

import java.lang.reflect.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
//	@Autowired
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
		
		HttpSession session = req.getSession(); // 세션 초기화
		session.setAttribute("gUserid", uid); // 값 설정
		
		
//		m.addAttribute("mem",member);
//		return "loginok";
		return "redirect:/";
	}
	@RequestMapping("/signin")
	public String doSignin() {
		return "signin";
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
