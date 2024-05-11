package com.springcore.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	
	
	
	@Bean("myCourse")
	public  Course getCourse() {
		
		Course course=new Course("java","3 month");
		
		return course;
	}
	
	
	
	
	@Bean("student1")
	public Student getStudent() {

         
		Student stud=new Student(getCourse());
		
		
		return stud;
		
		
	}

}
