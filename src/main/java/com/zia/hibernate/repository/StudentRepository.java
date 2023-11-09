package com.zia.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zia.hibernate.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	
}
