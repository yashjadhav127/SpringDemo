package com.springcore.Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Gym {

	
	String Motivation;
	
	
	
    
	public Gym(String motivation) {
		super();
		Motivation = motivation;
	}




	@Override
	public String toString() {
		return "Gym [Motivation=" + Motivation + "]";
	}
	
	
	@PostConstruct
	public void init() {
		
		System.out.println("This is initilizing the data");
		
	}
	
	@PreDestroy
	public void destroy() {
		
		System.out.print("This is destroying");
		
	}
	
	
}
