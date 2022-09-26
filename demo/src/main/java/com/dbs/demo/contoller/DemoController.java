package com.dbs.demo.contoller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.demo.dto.Employee;

@RestController
@RequestMapping("/DBS")
public class DemoController {
	@Autowired
	DBSService service;
	
	@RequestMapping("/searchFor/{id}")
	public String searchEmployee(@PathVariable int id) {
		Employee e =	service.search(id);
		if(e != null)
		return e.toString();
		return "No emp found";
	}
	@RequestMapping("/all")
	public String printAll() {
		List<Employee> list =	service.allDetails();
		return list.toString();
	}
}
