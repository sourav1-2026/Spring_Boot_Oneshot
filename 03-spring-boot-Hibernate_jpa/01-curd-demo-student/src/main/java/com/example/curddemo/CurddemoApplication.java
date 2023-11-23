package com.example.curddemo;

import com.example.curddemo.dao.StudentDAO;
import com.example.curddemo.entity.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CurddemoApplication
{

	public static void main(String[] args) {

		SpringApplication.run(CurddemoApplication.class, args);
	}

//	Defineing new Bean for command line Runner
//	it will run when spring create the bean
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return  runner -> {
			//createStudent(studentDAO);

//			CreateMultipleStudent(studentDAO);

			//readStudent(studentDAO);

//			queryForStudent(studentDAO);

//			queryForStudentByLastName(studentDAO);

//			updateStudent(studentDAO);

//			deleteStudent(studentDAO);

			deleteAllStudent(studentDAO);
		};

	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		studentDAO.deleteAll();
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId=3;
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		// retrive student based on the id : primary key

		int studentId=1;
		System.out.println("Getting student with id" + studentId);
		student mystudent=studentDAO.findById(studentId);

		// change first name

		System.out.println("updating the student ");
		mystudent.setFirstName("sourav");
		//update student
		studentDAO.update(mystudent);

		// display student
		System.out.println("updated student" + mystudent);
	}

	private void queryForStudentByLastName(StudentDAO studentDAO) {
		// get a list of student

		List<student> theStudents=studentDAO.findByLastName("shaw");

		// display the list of student

		for(student stu : theStudents){
			System.out.println(stu);
		}
	}

	private void queryForStudent(StudentDAO studentDAO) {
		List<student> theStudents =studentDAO.findAll();
		for(student tempstudent : theStudents){
			System.out.println(tempstudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		// create a student object
		System.out.println("creating new student object...");
		student tempStudent1=new student("akash","shaw","akash@123gmail.com");

		// save the student
		System.out.println("saved student");
		studentDAO.save(tempStudent1);
		// display id of the saved student
		int theid=tempStudent1.getId();
		System.out.println("saved student id"+ theid);
		// retriev student based on the id
		System.out.println("retriing student with id :" + theid);
		student mystudent=studentDAO.findById(theid);
		// display student
		System.out.println(mystudent);
	}

	private void CreateMultipleStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("creating new student object...");
		student tempStudent1=new student("sourav","shaw","sourav@123gmail.com");
		student tempStudent2=new student("sachin","shaw","sachin@123gmail.com");
		student tempStudent3=new student("rahul","shaw","rahul@123gmail.com");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("creating new student object...");
		student tempStudent=new student("sourav","shaw","sourav@123gmail.com");

		// save the student object
		System.out.println("saving the student");
		studentDAO.save(tempStudent);

		// display the id of saved student
		System.out.println("saved student Generated id :"+ tempStudent.getId());
	}


}
