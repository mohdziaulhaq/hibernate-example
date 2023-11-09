package com.zia.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_laptop")
public class Laptop {
	
	@Id
	private int laptopId;
	private String modelNumber;
	
	@Column(name = "brandd")
	private String brand;
	
	@OneToOne
	@JoinColumn(name = "student_id")
	private Student student;
}
