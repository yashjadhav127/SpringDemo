package com.springcore.javaconggfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new AnnotationConfigApplicationContext("JavaConfig.java");
		
		
		Books book=(Books) context.getBean("book","Books.java");
		
		
		System.out.println(book);
		
	}

}
