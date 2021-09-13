package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
        Configuration cfg=new Configuration();cfg.configure("com/tut/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session = factory.getCurrentSession();
        System.out.println(session);
        
       // SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }
}
