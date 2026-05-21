package com.example.springjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springjpa.StudentRepo.StudentRepo;
import com.example.springjpa.model.Student;

@SpringBootApplication
public class SpringjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringjpaApplication.class, args);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		StudentRepo repo = context.getBean(StudentRepo.class);

		// s1.setRollNo(101);
		// s1.setName("Isha");
		// s1.setMarks(89);

		// s2.setRollNo(102);
		// s2.setName("Shan");
		// s2.setMarks(54);
		
		// s3.setRollNo(103);
		// s3.setName("Rosy");
		// s3.setMarks(78);


		// repo.save(s1);
		// repo.save(s2);
		// repo.save(s3);


		// findAll
		System.out.println(repo.findAll());

		// findOne 
		System.out.println(repo.findById(101));

		repo.findByName("Isha");
		
		}

}
