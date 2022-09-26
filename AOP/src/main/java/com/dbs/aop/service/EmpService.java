package com.dbs.aop.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.aop.dto.Employee;
import com.dbs.aop.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	EmpRepo empRepo;

	public List<Employee> getAllEmployees() {
	
	
		return empRepo.getEmployee();
	
	
	}

}
