package com.app.batch13springboot.service;

import java.util.List;

import com.app.batch13springboot.model.Mahasiswa;

public interface IMahasiswaService {
	public Mahasiswa insert(Mahasiswa mahasiswa);
	public String insertCount(Mahasiswa mahasiswa);
	public List<Mahasiswa> findAll();
	public Mahasiswa findById(int id);
	public void deleteById(int id);
	public Mahasiswa update(Mahasiswa mahasiswa); 
}
