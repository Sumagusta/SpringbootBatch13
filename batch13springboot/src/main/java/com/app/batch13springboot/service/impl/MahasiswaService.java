package com.app.batch13springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.batch13springboot.model.Mahasiswa;
import com.app.batch13springboot.repository.IMahasiswaRepository;
import com.app.batch13springboot.service.IMahasiswaService;

@Service
public class MahasiswaService implements IMahasiswaService {

	@Autowired
	IMahasiswaRepository mahasiswaRepository;
	
	@Override
	public Mahasiswa insert(Mahasiswa mahasiswa) {
		// TODO Auto-generated method stub
		
		return mahasiswaRepository.insert(mahasiswa);
	}

	@Override
	public String insertCount(Mahasiswa mahasiswa) {
		// TODO Auto-generated method stub
		
		int result = mahasiswaRepository.insertCount(mahasiswa);
		return "Insert berhasil, sebanyak : "+result;
	}

	@Override
	public List<Mahasiswa> findAll() {
		// TODO Auto-generated method stub
		var result = mahasiswaRepository.findAll();
		return result;
	}

	@Override
	public Mahasiswa findById(int id) {
		// TODO Auto-generated method stub
		
		var result = mahasiswaRepository.findById(id);
		return result;
	}

	@Override
	public void deleteById(int id) {
		mahasiswaRepository.deleteById(id);
	}

	
	
}
