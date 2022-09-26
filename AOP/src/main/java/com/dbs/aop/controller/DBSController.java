package com.dbs.aop.controller;


import java.util.List;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.aop.dto.Employee;
import com.dbs.aop.service.EmpService;

@RestController
public class DBSController {
	
	@AutoConfigureOrder
	EmpService empService;

	@RequestMapping("/dbs/all")
	public List<Employee> getAllEmployees(){
		
		
		return empService.getAllEmployees();
		
	}
}