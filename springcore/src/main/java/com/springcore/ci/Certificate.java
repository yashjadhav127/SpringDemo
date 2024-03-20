package com.springcore.ci;

public class Certificate {
	
	
	String name;
	
	String duration;

	public Certificate(String name, String duration) {
		super();
		this.name = name;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Certificate [name=" + name + ", duration=" + duration + "]";
	}
	
	

}
