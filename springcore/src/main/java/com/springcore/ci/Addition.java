package com.springcore.ci;

public class Addition {
	
	
	int a;
	
	int b;
	
	

	public Addition(int a,int b) {
		
		System.out.println("i am int");
		
		this.a=a;
		
		this.b=b;
		
		
	}
	
	
	public Addition(double a, double b) {
		
		System.out.println("i am double");
		
		this.a=(int) a;
		
		this.b=(int) b;
		
	}
	
	
	public Addition(String a,String b) {
		
		System.out.println("i am string");
		
		
		this.a=Integer.parseInt(a);
				
	    this.b=Integer.parseInt(b);
		
	}
	
	
	
	public void dosum() {
		
		
		System.out.print(a+b);
	}
	
	
}
