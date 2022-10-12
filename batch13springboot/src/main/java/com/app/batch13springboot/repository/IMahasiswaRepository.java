package com.app.batch13springboot.repository;

import java.util.List;

import com.app.batch13springboot.model.Mahasiswa;

public interface IMahasiswaRepository {
	
	public Mahasiswa insert(Mahasiswa mahasiswa);
	public int insertCount(Mahasiswa mahasiswa);
	public List<Mahasiswa> findAll();
	
	// id : 1
	// name : yoo ..
	
	
}
