package com.app.batch13springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api")
public class BerandaController {
	
	@RequestMapping("/header")
	public String home() {
		return "/beranda";
	}
	
	// API Req : Post, Put, Get, Delete
	
	@PostMapping("/post")
	public String post() {
		
	
		
		return null;
	}
	
}
