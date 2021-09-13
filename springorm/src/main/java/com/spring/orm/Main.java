package com.spring.orm;


	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.List;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	import com.spring.orm.dao.StudentDao;
	import com.spring.orm.entities.Student;

	public class Main{
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
					
if (parseInt==1) {
	System.out.println("Insert a new Id");
	int uId = Integer.parseInt(br.readLine());
	System.out.println("insert a new Name ");
	String uName=br.readLine();
	System.out.println("insert a new City");
	String uCity=br.readLine();
	Student st=new Student(uId,uName,uCity);
	int insert = studentDao.insert(st);
	System.out.println("added Student"+insert);
	System.out.println("**************************************************************************");
	System.out.println();
}
else if (parseInt==2) {
	List<Student> allStudents = studentDao.getAllStudents();
	for (Student student : allStudents) {
System.out.println("Id"+student.getStudentId());
System.out.println("Name"+student.getStudentName());
System.out.println("City"+student.getStudentCity());
System.out.println("**************************************************************************");
System.out.println();
	}
}
else if (parseInt==3) {
	
	System.out.println("Insert a new Id");
	int usId = Integer.parseInt(br.readLine());
	Student student = studentDao.getStudent(usId);
	System.out.println("insert a new Name "+student.getStudentName());
	
	System.out.println("insert a new City"+student.getStudentCity());
	System.out.println("**************************************************************************");
	System.out.println();

}


		else if (parseInt==4) {
			System.out.println("Enter Id");
			int userId = Integer.parseInt(br.readLine());

			studentDao.deleteStudent(userId);
			System.out.println("delete");
		}
			
else if (parseInt==5) {
	System.out.println("Insert a new Id");
	int id = Integer.parseInt(br.readLine());
	System.out.println("insert a new Name ");
	String names=br.readLine();
	System.out.println("insert a new City");
	String city=br.readLine();
	Student stud=new Student(id,names,city);
	studentDao.updateStudent(stud);
	System.out.println("update");
}
else if (parseInt==6) {
	name=false;
	System.out.println("student exit");
	
break;
		}		

}		
			 catch (Exception e) {
				System.out.println("inviled input");
				e.getMessage();
			
		}
		System.out.println("thanku for using my application");
		System.out.println("see u soon");
	
}
		}
}