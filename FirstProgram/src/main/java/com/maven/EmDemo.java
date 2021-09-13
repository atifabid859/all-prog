package com.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        Student student1=new Student();
        student1.setId(1);
        student1.setName("sakib");
        student1.setCityString("luck");
        
 Certifcate certifcate1=new Certifcate();
        
        certifcate1.setCourse("java");
        certifcate1.setDuration("2.month");
        student1.setCerti(certifcate1);
        
        
        Student student2=new Student();
        student2.setId(2);
        student2.setName("Atif");
        student2.setCityString("Kanpur");
       
        Certifcate certifcate2=new Certifcate();
        certifcate2.setCourse("python");
        certifcate2.setDuration("12.month");
        student2.setCerti(certifcate2);
       Session s=factory.openSession();
       Transaction tr = s.beginTransaction();
       s.save(student1);
       s.save(student2);
       tr.commit();
       s.close();
       
        

	}

}
