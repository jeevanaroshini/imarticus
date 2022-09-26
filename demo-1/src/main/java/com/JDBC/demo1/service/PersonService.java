package com.JDBC.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JDBC.demo1.dto.Person;
import com.JDBC.demo1.repo.PersonRepo;
@Service
public class PersonService {
	@Autowired
	PersonRepo personrepo;
	
	public List<Person> fetchallpersons(){
		return personrepo.getAllPersons();
	}

	public String addPerson(Person person) {
		return personrepo.addPerson(person);
	}
}
