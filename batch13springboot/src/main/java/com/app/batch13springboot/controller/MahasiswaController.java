package com.app.batch13springboot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
	
	@RequestMapping("/add")
	public String add() {
		return "/mahasiswa/add";
	}

	@RequestMapping("/edit")
	public String edit(HttpServletRequest request, Model model) {
		
		int id = Integer.valueOf(request.getParameter("id"));
		Mahasiswa mahasiswa = mahasiswaService.findById(id);
		
		model.addAttribute("bingkisanEdit", mahasiswa);
		
		return "/mahasiswa/edit";
	}
	
	@RequestMapping("/list")
	public String listMahasiswa(Model model){
		
		List<Mahasiswa> mahasiswaList = mahasiswaService.findAll();
		model.addAttribute("bungkusanData", mahasiswaList);
		return "/mahasiswa/list-mahasiswa";
	}
	
//	pop up delete
	@RequestMapping("/remove")
	public String remove(HttpServletRequest request, Model model) {
		
		int id = Integer.valueOf(request.getParameter("id"));
		
		Mahasiswa mahasiswa = mahasiswaService.findById(id);
		
		model.addAttribute("bingkisanDelete", mahasiswa);
		
		return "/mahasiswa/remove";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		
		int id = Integer.valueOf(request.getParameter("id"));
		mahasiswaService.deleteById(id);
		return "/mahasiswa/home";
	}

	@RequestMapping("/create")
	public String create(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		int age = Integer.valueOf(request.getParameter("age"));
		int semester = Integer.valueOf(request.getParameter("semester"));
		
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setName(name);
		mahasiswa.setAge(age);
		mahasiswa.setSemester(semester);
		
		mahasiswaService.insert(mahasiswa);
		
		return "/mahasiswa/home";
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request) {
		
		int id = Integer.valueOf(request.getParameter("id"));
		String name = request.getParameter("name");
		int age = Integer.valueOf(request.getParameter("age"));
		int semester = Integer.valueOf(request.getParameter("semester"));
		
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setId(id);
		mahasiswa.setName(name);
		mahasiswa.setAge(age);
		mahasiswa.setSemester(semester);
		
		mahasiswaService.update(mahasiswa);
		
		return "/mahasiswa/home";
	}
	
}
