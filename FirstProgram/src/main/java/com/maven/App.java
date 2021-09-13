package com.maven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println("Start the project");
    	
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        Student student=new Student();
        student.setId(102);
        student.setName("Aatif");
        student.setCityString("khalilabad");
        System.out.println(student);
        //create object Address of class
       
        Address address=new Address();
        address.setStreet("Street 3");
        address.setCity("lucknow");
        address.setOpen(true);
        address.setX(1237.7987);
        address.setAddeDate(new Date());
      //Reading Image
        FileInputStream fil=new FileInputStream("src/main/java/passport.jpg");
        byte[] date=new byte[fil.available()];
        fil.read(date);
       address.setImage(date);
        
      Session session= factory.openSession();
      Transaction tx=session.beginTransaction();
      session.save(student);
      session.save(address);

		tx.commit(); 

      session.close();
        
       
        
    }
}
