package com.app.batch13springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "/home";
	}

	@RequestMapping("/register")
	public String register() {
		return "/forms";
	}

	@RequestMapping("/htmlcss")
	public String htmlCSS() {
		return "/htmlCss";
	}

	@RequestMapping("/boot")
	public String htmlBoot() {
		return "/bootstrapHome";
	}
	
	@RequestMapping("/jsobject")
	public String jsObject() {
		return "/jsObject";
	}
	
	@RequestMapping("/jqueryhtml")
	public String jqueryHtml() {
		return "/jqueryHtml";
	}
	
}
