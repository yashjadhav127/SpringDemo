package com.springcore.Lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Lifecycle/LifeCycleConfig.xml");
		
		
		Yash yash=(Yash) context.getBean("brahma");
		
		System.out.println(yash);
		
		
//		context.registerShutdownHook();
		

	}

}
