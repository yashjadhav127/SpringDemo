package com.springjdbc.daoImpl;

public interface StudentDao {

	
	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(int id);
	
}
