package com.JDBC.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JDBC.demo1.dto.Person;
import com.JDBC.demo1.service.PersonService;

@RestController
public class PersonalController {
	
	@Autowired
	PersonService personservice;
	
	@RequestMapping("/all")
	public String getAll() {
		return personservice.fetchallpersons().toString();
	}
	
	@PostMapping ("/add")
	public String addPersonDetail(@RequestBody Person person) {
		return personservice.addPerson(person);
	}
}
