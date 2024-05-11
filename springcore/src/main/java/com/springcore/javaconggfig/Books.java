package com.springcore.javaconggfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("book")
public class Books {

	
	String Name;
	
	
	@Autowired
	Author author;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	

	@Override
	public String toString() {
		return "Books [Name=" + Name + ", author=" + author + "]";
	}
	
	
	
	
	
}

