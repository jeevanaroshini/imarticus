package com.dbs.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.jpa.model.DBSEmployee;
import com.dbs.jpa.service.DBSService;

@RestController
public class DBSController {
	@Autowired
	DBSService ser;
	
	@GetMapping("/jpa/all")
	public String printAll() {
		return ser.printAll().toString();
	}
	
	@PostMapping("/jpa/add")
	public String addNewEmployee(@RequestBody DBSEmployee emp) {
		return ser.addNewEmployee(emp);
	}
}
