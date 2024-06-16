package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.daoImpl.Student;
import com.springjdbc.daoImpl.StudentDao;
import com.springjdbc.daoImpl.studentDapImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
        
      
        StudentDao std=context.getBean("studentDaoImpl",studentDapImpl.class);
//         
//         Student stud=new Student(2,"John Doe","Computer Science","123 Main St");
//         
//         System.out.println( std.change(stud));
        
        
        //Deleting student form table of id 7
        
        
//       int result= std.delete(7);
//       
//       System.out.println("Deleted Row...."+result)

        
        //Getting a student from result set
        
//        System.out.print(std.getStudent(6));
        
       List<Student> list=std.getAllStudent();
       
       for(int i=0;i<list.size();i++) System.out.println(list.get(i));
        
        
        
    }
}
