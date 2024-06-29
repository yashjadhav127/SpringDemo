package com.springjdbc.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("studentDaoImpl")
public class studentDapImpl implements StudentDao {

	@Autowired
	JdbcTemplate template;
	
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		
        String query="Insert into student(id,name,course,address) values(?,?,?,?)";
        
        int result=template.update(query,student.id,student.name,student.course,student.address);
		
		return result;
	}

	@Override
	public int change(Student student) {
		// TODO Auto-generated method stub
		
       String query="update student set name=? , address=? where id=?";
       
       int result=template.update(query,student.name,student.address,student.id);
		
		return result;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub

		String query="delete from student where id=?";
				
		int result =template.update(query,id);
		
		return result;
		
	
		
	}

	public Student getStudent(int StudentId) {
		// TODO Auto-generated method stub
		String query="Select * From Student where id=?";
		
		RowMapper<Student> RM=new RowMapperImpl();
		
		Student stud=this.template.queryForObject(query, RM,StudentId);
		
		return stud;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		String query="Select * From Student";
		RowMapper<Student> RM=new RowMapperImpl();
		List<Student> Li= this.template.query(query, RM);
		
		return Li;
	}



}
