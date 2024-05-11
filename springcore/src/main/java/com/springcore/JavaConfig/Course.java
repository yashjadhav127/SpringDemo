package com.springcore.JavaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Course {

	
	
	String name;
	
	
	
	String duration;
	
	



	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Course(String name, String duration) {
		super();
		this.name = name;
		this.duration = duration;
	}





	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + "]";
	}
	
	
	
	
	
	
}
