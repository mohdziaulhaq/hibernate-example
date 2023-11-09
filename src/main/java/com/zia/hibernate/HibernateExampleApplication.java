package com.zia.hibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zia.hibernate.entities.Student;
import com.zia.hibernate.repository.StudentRepository;

@SpringBootApplication
public class HibernateExampleApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	private Logger logger = LoggerFactory.getLogger(HibernateExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HibernateExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s = new Student();

		s.setStudentId(12);
		s.setStudentName("Zia");
		s.setAbout("CSE student");
		System.out.println("Ziaaaaaaaaaaaaaa");
		Student save = studentRepository.save(s);

		logger.info("saved student :{}", save.getStudentName());

	}

}
