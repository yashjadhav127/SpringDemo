package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
	
	
	public static void main(String args[]) {
		
		
		 ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ref/RefConfig.xml");
		
		  
		 A obja=(A)context.getBean("obja");
		 
		 
		 System.out.print(obja);
		
		
	}

}
