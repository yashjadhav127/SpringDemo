package com.springcore.ci;

public class Coder {

	
	private String name;
	
	private int age;
	
	Certificate cer;

	public Coder(String name, int age, Certificate cer) {
		super();
		this.name = name;
		this.age = age;
		this.cer = cer;
	}

	@Override
	public String toString() {
		return "Coder [name=" + name + ", age=" + age + ", cer=" + cer + "]";
	}
	
	
	
	
	
}
