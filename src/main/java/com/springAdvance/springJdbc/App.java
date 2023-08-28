package com.springAdvance.springJdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springAdvance.springJdbc.dao.StudentDao;
import com.springAdvance.springJdbc.entites.Student;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springAdvance/springJdbc/config.xml");
		StudentDao studentDao = (StudentDao) context.getBean("dao");
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		while (true) {
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Display Student");
			System.out.println("Press 4 to Update Student");
			System.out.println("Press 5 to Check Details of Particular Id");
			System.out.println("Press 6 to Exit App");

			int a = sc.nextInt();

			if (a == 1) {
				System.out.println("Enter your Student id");
				student.setId(sc.nextInt());

				System.out.println("Enter your name");
				student.setName(sc.next());
				sc.nextLine();

				System.out.println("Enter your Address");
				student.setAddress(sc.next());
				sc.nextLine();

				System.out.println("Enter your City");
				student.setCity(sc.next());
				sc.nextLine();

				System.out.println("Enter your Selected Course");
				student.setCourse(sc.next());
				sc.nextLine();

				int save = studentDao.save(student);
				System.out.println(save + " Successfully added");
			} 
			else if (a == 2) {
				System.out.println("Enter  student id to delete:");
				int userId = sc.nextInt();

				int delete = studentDao.delete(userId);
				System.out.println(delete + " deleted succesfully");

			}
			else if (a == 3) {
				System.out.println("All Students Details are here");
				List<Student> list = studentDao.readAll();
				System.out.println(list);

			}
			else if (a == 4) {
				System.out.println("Enter id you Want to update");
				int id = sc.nextInt();
				student.setId(id);

				System.out.println("Enter your name");
				student.setName(sc.next());
				sc.nextLine();

				System.out.println("Enter your Address");
				student.setAddress(sc.next());
				sc.nextLine();

				System.out.println("Enter your City");
				student.setCity(sc.next());
				sc.nextLine();

				System.out.println("Enter your Selected Course");
				student.setCourse(sc.next());
				sc.nextLine();

				int update = studentDao.update(student);
				System.out.println("updated Result " + student);

			}
			else if (a == 5) {
				System.out.println("Enter id to check the details");
				int id = sc.nextInt();
				Student read = studentDao.read(id);
				System.out.println(read);
			}
			else if (a == 6) {
				System.out.println("You have Successfully Exit Application");
				break;
			}

//

		}
	}
}