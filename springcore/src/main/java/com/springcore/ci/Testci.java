package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/AddConfig.xml");
		 
		 
		 
		 Addition obj=(Addition) context.getBean("add");
		 
		 
		 obj.dosum();
		  
		 
		 
		

	}

}
