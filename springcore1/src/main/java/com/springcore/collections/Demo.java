package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		System.out.println("get start program");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collections/collectionconfig.xml");
		Emp emp = (Emp) context.getBean("emp1");
		System.out.println(emp.getName());
		System.out.println(emp.getPhone());
		System.out.println(emp.getAddrsses());
		System.out.println(emp.getCourses());

	}

}
