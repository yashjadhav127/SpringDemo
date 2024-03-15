package com.springcore.collectioon;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	String name;
	
	List<String> phoneNumber;
	
	Set<String> address;
	
	
	Map<String,String> courses;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Set<String> getAddress() {
		return address;
	}


	public void setAddress(Set<String> address) {
		this.address = address;
	}


	public Map<String, String> getCourses() {
		return courses;
	}


	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + ", courses="
				+ courses + "]";
	}
	
	
	
	
	
	
	
	
	
}
