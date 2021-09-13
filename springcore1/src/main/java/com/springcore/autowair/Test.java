package com.springcore.autowair;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		
ApplicationContext	context=new ClassPathXmlApplicationContext("com/springcore/autowair/autowairconfig.xml");

Employe employe=(Employe) context.getBean("emp1");
System.out.println(employe);
		
	}

}
