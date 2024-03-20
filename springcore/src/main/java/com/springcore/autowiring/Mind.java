package com.springcore.autowiring;

public class Mind {

	
	String condition;
	
	 int iq;
	 
	 
	 

	public Mind() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mind(String condition, int iq) {
		super();
		this.condition = condition;
		this.iq = iq;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	@Override
	public String toString() {
		return "Mind [condition=" + condition + ", iq=" + iq + "]";
	}
	
	
	
	 
	 
}
