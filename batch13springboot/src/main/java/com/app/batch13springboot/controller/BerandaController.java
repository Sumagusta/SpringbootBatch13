package com.app.batch13springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PostMapping("/post/returnmodel")
	public Mahasiswa post(@RequestBody Mahasiswa mahasiswa) {
		
		return mahasiswaService.insert(mahasiswa);
	}
	
	@PostMapping("/post/returncount")
	public String postCount(@RequestBody Mahasiswa mahasiswa) {
		
		return mahasiswaService.insertCount(mahasiswa);
	}
	
	@GetMapping("/getall")
	public List<Mahasiswa> getAll(){
		var result = mahasiswaService.findAll();
		return result;
	}
	
}
