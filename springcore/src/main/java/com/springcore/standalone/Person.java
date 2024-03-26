package com.springcore.standalone;

import java.util.List;
import java.util.Map;

public class Person {

	List<String> friends;
	
	Map <String,Integer> Scores;
	
	
	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	
	
	public Map<String, Integer> getScores() {
		return Scores;
	}

	public void setScores(Map<String, Integer> scores) {
		Scores = scores;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", Scores=" + Scores + "]";
	}


	
	
	
	
}
