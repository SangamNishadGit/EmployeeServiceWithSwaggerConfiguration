package com.sangam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangam.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
