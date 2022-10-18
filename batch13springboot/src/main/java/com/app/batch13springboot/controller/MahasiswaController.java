package com.app.batch13springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.batch13springboot.model.Mahasiswa;
import com.app.batch13springboot.service.IMahasiswaService;

@Controller
@RequestMapping("/mahasiswa")
public class MahasiswaController {
	
	@Autowired
	IMahasiswaService mahasiswaService;
	
	@RequestMapping("/home")
	public String mahasiswa() {
		return "/mahasiswa/home";
	}
	
	@RequestMapping("/list")
	public String listMahasiswa(Model model){
		
		List<Mahasiswa> mahasiswaList = mahasiswaService.findAll();
		model.addAttribute("bungkusanData", mahasiswaList);
		return "/mahasiswa/list-mahasiswa";
	}
	
}
