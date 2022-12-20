package com.human.Cafe;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;



@Controller
public class MyController {
	
	@RequestMapping("/test1")	// web browser(주소창)에서 "/"를 입력하면
//	public String test1(Model model) {
	public ModelAndView test1() { // 사용 빈도 낮은 방법 // 코드 줄이 늘어남
//		model.addAttribute("myname", "박민"); 
//		// myname(대소문자 구분)이라는 이름의 attribute에 들어가는 데이터는 "박민"이라는 문자열이 들어감
//		model.addAttribute("others", "Alan Parson's Project");
		ArrayList<String> arName = new ArrayList<String>();
		arName.add("Latte");
		arName.add("Mocca");
		arName.add("Americano");
		arName.add("Cappuccino");
//		model.addAttribute("menu", arName);
//		return "test1";		// web browser에게 "test1.jsp"를 보내준다.
		ModelAndView mv = new ModelAndView();
		mv.addObject("menu",arName);
		mv.setViewName("test1"); // test1는 JSP파일 이름
		return mv;
	}
	@RequestMapping("/login")
	public String doLogin(Model m) {
//		m.addAttribute("error","invalid user"); // 더미 코드
		return "login";
	}
	@RequestMapping("/signin")
	public String doSignin() {
		return "register";
	}
	@RequestMapping("/logout")
	public String doLogout() {
		return "logout";
	}
	@RequestMapping("/checkuser")
	
//	public String doCheckUser(HttpServletRequest req, Model m) { // 1
//		String loginid= req.getParameter("userid");
//		String pw = req.getParameter("passcode"); 아래와 같음 
	public String doCheckUser(@RequestParam("userid") String loginid,
							@RequestParam("passcode") String pw, Model m) { // 2 - 사용 빈도가 낮음(줄이 옆으로 늘어남)
		// log, debuging code
		System.out.println("loginid = " + loginid);
		System.out.println("pw = " + pw);
		
		m.addAttribute("uid",loginid);
		m.addAttribute("pwd",pw);
		if(loginid.equals("xaexal")) {
			return "userinfo";
		} else {
//			return "login"; // JSP파일만 실행 - login.jsp를 web browser로 보냄
			return "redirect:/login"; // /login으로 이동 doLogin()클래스로 이동해서 코드실행
		}
			
//		return "userinfo";
	}
	@RequestMapping("/plus")
	public String Plus() {
		return "plus";
	}
	@RequestMapping("/doplus")
	public String doPlus(HttpServletRequest req, Model m) {
		Integer A = Integer.parseInt(req.getParameter("a"));
		Integer B = Integer.parseInt(req.getParameter("b"));
		int c = A + B;
		System.out.println(A);
		System.out.println(B);
		System.out.println(c);
		m.addAttribute("result",c);
		return "doplus";
	}
	@RequestMapping("/gugu")
	public String doGugu() {
		return "gugu";
	}
	@RequestMapping("/gugudan")
	public String doGugudan(HttpServletRequest req, Model m) {
		Integer A = Integer.parseInt(req.getParameter("dan"));
		String Re = "";
		for (int i = 1; i < 10; i++) {
			Re = Re + A+" * "+ i +" = "+ A*i + "<br>";
		}
		m.addAttribute("result",Re);
		return "gugudan";
	}
	@RequestMapping("/name")
	@ResponseBody			// return의 내용을 화면을 출력함 // 단순 문자열, No more JSP // AJAX에서 사용
	public String doName() {
		return "<h1>name</h1>";
	}
}
