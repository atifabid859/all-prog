package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
public static void main(String[] args) {
	
	System.out.println("get start program");
	Configuration conf=new  Configuration();
	conf.configure("hibernate.cfg.xml");
	SessionFactory factory = conf.buildSessionFactory();
	
	Question question=new Question();
	question.setQuestionId(101);
	question.setQuestion("what is collection");

	Answer answer=new Answer();
	answer.setAnswerId(1);
	answer.setAnswer("collection is aframwork");
	answer.setQ(question);
	question.setAnswer(answer);
	
	
	Question question1=new Question();
	question1.setQuestionId(102);
	question1.setQuestion("what is collection");

	Answer answer1=new Answer();
	answer1.setAnswerId(2);
	answer1.setAnswer("collection is aframwork");
	answer1.setQ(question1);
	question.setAnswer(answer1);
	
	
	
	
	Session session = factory.openSession();
	Transaction trt = session.beginTransaction();
	session.save(question);
	session.save(question1);
	
	session.save(answer);
	session.save(answer1);
	
	trt.commit();
	//featching
	Question newQ=(Question)session.get(Question.class,101);
	System.out.println(newQ.getQuestion());
	System.out.println(newQ.getAnswer().getAnswer());
	session.close();
	
	
	
}
}
