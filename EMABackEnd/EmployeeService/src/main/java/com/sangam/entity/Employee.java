package com.sangam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private Long id;
	
	@Column(name="emp_name")
	private String empName;
	
}
