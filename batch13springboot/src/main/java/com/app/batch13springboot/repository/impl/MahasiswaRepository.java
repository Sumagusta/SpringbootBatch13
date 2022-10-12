package com.app.batch13springboot.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.batch13springboot.model.Mahasiswa;
import com.app.batch13springboot.repository.IMahasiswaRepository;

@Repository
public class MahasiswaRepository implements IMahasiswaRepository {

	@Autowired
	JdbcTemplate jdbcTemplate; // one of jdbc abstraction

	@Override
	public Mahasiswa insert(Mahasiswa mahasiswa) {
		// TODO Auto-generated method stub

		String query = "insert into mahasiswa (name, age, semester) values (?,?,?)";

		// DML - jdbc method = update
		jdbcTemplate.update(query, new Object[] { mahasiswa.getName(), mahasiswa.getAge(), mahasiswa.getSemester() });

		return mahasiswa;
	}

	@Override
	public int insertCount(Mahasiswa mahasiswa) {
		// TODO Auto-generated method stub

		String query = "insert into mahasiswa (name, age, semester) values (?,?,?)";

		// DML - jdbc method = update
		int result = jdbcTemplate.update(query, new Object[] { mahasiswa.getName(), mahasiswa.getAge(), mahasiswa.getSemester() });
		return result;
	}

	@Override
	public List<Mahasiswa> findAll() {
		// TODO Auto-generated method stub
		
		String query ="select * from mahasiswa";
		var result  =  jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Mahasiswa.class));
		
		return result;
	}

}
