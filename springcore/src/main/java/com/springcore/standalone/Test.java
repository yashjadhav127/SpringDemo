package com.springcore.standalone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/stanaloneConfig.xml");
		
		 Person person=(Person) context.getBean("Person1");
		 
		 System.out.println(person);
	

	}

}
