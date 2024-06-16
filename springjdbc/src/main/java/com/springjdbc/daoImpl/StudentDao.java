package com.springjdbc.daoImpl;

import java.util.List;

public interface StudentDao {

	
	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(int id);
	
	public Student getStudent(int StudentId);
	
	public List<Student> getAllStudent();
	
}
