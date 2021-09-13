package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("get start program");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/stereotype/stereotypeconfig.xml");
//
//		Student student = context.getBean("student", Student.class);
//		System.out.println(student.hashCode());
//		Student student1 = context.getBean("student", Student.class);
//		System.out.println(student1.hashCode());
		//System.out.println(student.getAddress());
		Teacher teacher=context.getBean("teacher",Teacher.class);
		System.out.println(teacher.hashCode());
		
		Teacher teacher1=context.getBean("teacher",Teacher.class);
		System.out.println(teacher1.hashCode());
	}

}
