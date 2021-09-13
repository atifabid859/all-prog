package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       System.out.println("hello");
       
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");//context begger ioc container create a object
       //ioc container provide after close application and distroy this object complet manage the file cycle

      Student student1=(Student) context.getBean("student1");
    Student  student2=(Student) context.getBean("student2");
      System.out.println(student1);
      System.out.println(student2);
    }
}
