package com.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore1/config.xml");

		Student student =  context.getBean("student1",Student.class);
		
		System.out.println(student);

		
		  Student student1 = (Student) context.getBean("student2");
		  
		  System.out.println(student1);
		  
		 
	}
}
