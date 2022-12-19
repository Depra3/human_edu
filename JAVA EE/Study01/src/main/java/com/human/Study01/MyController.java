package com.human.Study01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String doRoot() {
		return "index";
	}
	
	@RequestMapping("/addMember")
	public String doAddMember(Person p, Model m){
		m.addAttribute("person",p);
		return "showMember";
	}
}
