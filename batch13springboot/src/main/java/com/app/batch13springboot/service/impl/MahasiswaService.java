package com.app.batch13springboot.service.impl;

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

	
	
}
