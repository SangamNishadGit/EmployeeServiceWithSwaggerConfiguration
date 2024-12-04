package com.sangam.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangam.entity.Employee;
import com.sangam.service.IEmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/employee")
@Tag(name="Employee Application")
public class EmployeeRestController {

	@Autowired
	private IEmployeeService service;
	
	@PostMapping("/save")
	@Operation(summary="Creating one employee")
	public ResponseEntity<String> createEmployee(@RequestBody Employee emp){
		Long empId = service.saveEmployee(emp);
		return new ResponseEntity<String>("Employee '"+empId+"' created..!",HttpStatus.OK);
	}
	
}
