package com.springcore.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJava {
	
	
	public static void main(String args[]) {
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		
		 Student student=(Student) context.getBean("student1");
		 
		  System.out.println(student.course);
	
		 
		 
		
		
	}

}
