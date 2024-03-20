package com.springcore.Lifecycle;

public class Samosa {
	
	int price ;

	public Samosa(int price) {
		
		System.out.println("This is price setting happening");
		this.price = price;
	}
	
	
	
	public void init() {
		
		
		System.out.println("This is initilization");
	}
	
	
	public void destroy() {
		
		System.out.println("Tata bye bye ");
	}



	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	

}
