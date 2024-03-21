package com.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Humen {

	String body;
	
    @Autowired
    @Qualifier("nomind")
	Mind mind;
	
	
	
	
	public Humen() {
		super();
		
		System.out.println("super constructor");
		// TODO Auto-generated constructor stub
	}

	public Humen(String body, Mind mind) {
		super();
		this.body = body;
		this.mind = mind;
		System.out.println("Main constructor");
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Mind getMind() {
		return mind;
	}

	
	public void setMind(Mind mind) {
		 
		 System.out.println("setting mind ");
		this.mind = mind;
	}

	@Override
	public String toString() {
		return "Humen [body=" + body + ", mind=" + mind + "]";
	}
	
	
	
	
}
