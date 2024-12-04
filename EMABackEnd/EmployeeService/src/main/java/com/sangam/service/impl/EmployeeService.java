package com.sangam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangam.entity.Employee;
import com.sangam.repo.EmployeeRepository;
import com.sangam.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Long saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Long id = repo.save(emp).getId();
		return id;
	}

	
}
