package com.springcore.spel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");
		
		Myclass obj=(Myclass) context.getBean("myclass");
		
		System.out.println(obj);
	}

}
