package com.app.batch13springboot.repository.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.batch13springboot.model.Mahasiswa;
import com.app.batch13springboot.repository.IMahasiswaRepository;

@Repository
public class MahasiswaRepository implements IMahasiswaRepository {
	
	JdbcTemplate jdbcTemplate; // one of jdbc abstraction

	@Override
	public Mahasiswa insert(Mahasiswa mahasiswa) {
		// TODO Auto-generated method stub
		
		String query = "insert into mahasiswa (name, age, semester) values (?,?,?)";
		
		jdbcTemplate.update(query, new Object[] {mahasiswa.getName(), mahasiswa.getAge(), mahasiswa.getSemester()});
		
		return mahasiswa;
	}

	
}
