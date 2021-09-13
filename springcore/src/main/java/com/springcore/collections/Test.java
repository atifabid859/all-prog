package com.springcore.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	System.out.println("hello");
	
     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collection.config.xml");
    Emp emp1=(Emp) context.getBean("emp1");
    System.out.println(emp1.getName());
    System.out.println(emp1.getPhones());
System.out.println(emp1.getAddresses());
System.out.println(emp1.getCourses());
	}

}
