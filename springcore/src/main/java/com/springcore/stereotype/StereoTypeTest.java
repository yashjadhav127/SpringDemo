package com.springcore.stereotype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/SteroType.xml");
		
		Student student=(Student) context.getBean("student");
		
		System.out.println(student);
		

	}

}
