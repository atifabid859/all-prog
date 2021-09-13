package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {

		System.out.println("start the program");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		/*
		 * Student student=new Student(106,"Ehtesham","sakinaka"); int i =
		 * studentDao.insert(student); System.out.println("done"+i);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean name = true;
		while (name) {

			System.out.println("PRESS 1 For add new student");
			System.out.println("PRESS 2 For display all student");
			System.out.println("PRESS 3 For get details of single student");
			System.out.println("PRESS 4 For delete student");
			System.out.println("PRESS 5 For update student");
			System.out.println("PRESS 6 For exit student");

			try {

				int parseInt = Integer.parseInt(br.readLine());

				switch (parseInt) {
				case 1:
					System.out.println("Enter user Id");
					int uId = Integer.parseInt(br.readLine());

					System.out.println("Enter user Name");
					String uName = br.readLine();

					System.out.println("Enter user City");
					String uCity = br.readLine();
					// creating student object setting values
					Student s = new Student();
					s.setStudentId(uId);
					s.setStudentName(uName);
					s.setStudentCity(uCity);
					// saving student object to database calling insert of student dao
					int insert = studentDao.insert(s);
					System.out.println(insert + "student user added");
					System.out.println("********************************************************************");
					System.out.println();
					break;

				case 2:
					// 2 For display all student
					List<Student> allStudents = studentDao.getAllStudents();
					for (Student st : allStudents) {
						System.out.println("user Id" + st.getStudentId());
						System.out.println("user Name" + st.getStudentName());
						System.out.println("user City" + st.getStudentCity());
						System.out.println("******************************************************************");

					}
					break;
				case 3:
					// 3 For get details of single student
					System.out.println("Enter user Id");
					int userId = Integer.parseInt(br.readLine());
					Student student = studentDao.getStudent(userId);
					System.out.println("user Id" + student.getStudentId());
					System.out.println("user Name" + student.getStudentName());
					System.out.println("user City" + student.getStudentCity());
					System.out.println("******************************************************");
					break;
				case 4:
					// 4 For delete student
					System.out.println("Enter user Id");
					int id = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(id);
					System.out.println("student delete");
					break;
				case 5:
					// 5 For update student

					System.out.println("update user Id");
					int usersId = Integer.parseInt(br.readLine());
					System.out.println("update user Name");
					String userName = br.readLine();

					System.out.println("Enter user City");
					String userCity = br.readLine();

					Student student2 = new Student(usersId, userName, userCity);
					studentDao.updateStudent(student2);

					System.out.println("update Id");
					System.out.println("******************************************************");


					break;

				case 6:
					// 6 For exit student
					name = false;
					System.out.println(" For exit student");
					break;

				}

			} catch (Exception e) {
				System.out.println("inviled input");
				e.getMessage();
			}
		}
		System.out.println("thanku for using my application");
		System.out.println("see u soon");
	}
}
