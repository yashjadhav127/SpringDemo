package com.springcore.JavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



public class Student {
	
	
	 
     Course course;
	 
	 
	 

	public Student(Course course) {
		super();
		this.course = course;
	}




	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}


	


	
	 
	 
	
	
	 
	

}
