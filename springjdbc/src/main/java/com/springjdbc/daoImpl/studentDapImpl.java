package com.springjdbc.daoImpl;

import org.springframework.jdbc.core.JdbcTemplate;

public class studentDapImpl implements StudentDao {

	
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



}
