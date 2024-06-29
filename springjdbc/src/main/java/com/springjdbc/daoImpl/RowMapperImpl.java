package com.springjdbc.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method s

		Student stud=new Student();
		
		stud.setId(rs.getInt(1));
		
		stud.setName(rs.getString(2));
		
		stud.setCourse(rs.getString(3));
		
		stud.setAddress(rs.getString(4));
		
		
		return stud;
	}

}
