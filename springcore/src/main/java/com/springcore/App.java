package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
        
        ApplicationContext context =new ClassPathXmlApplicationContext("Config.xml");
        
        
         Student st=    (Student)context.getBean("student3");
         
         
         
         System.out.print(st);
         
         
        
        
        
        
        
    }
}
