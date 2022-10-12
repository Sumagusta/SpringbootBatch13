package com.app.batch13springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.batch13springboot.model.Mahasiswa;
import com.app.batch13springboot.service.IMahasiswaService;

@RestController 
@RequestMapping("/api")
public class BerandaController {
	
	@Autowired // DI
	IMahasiswaService mahasiswaService;
	
	@RequestMapping("/header")
	public String home() {
		return "/beranda";
	}
	
	// API Req : Post, Put, Get, Delete
	// REST API
	
	@PostMapping("/post")
	public Mahasiswa post(@RequestBody Mahasiswa mahasiswa) {
		
		return mahasiswaService.insert(mahasiswa);
	}
	
}
