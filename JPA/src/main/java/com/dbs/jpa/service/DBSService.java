package com.dbs.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.jpa.model.DBSEmployee;
import com.dbs.jpa.repo.DBSEmployeeRepo;
@Service
public class DBSService {
	@Autowired
	DBSEmployeeRepo repo;
	public String addNewEmployee (DBSEmployee emp) {
		try
		{
			if(repo.findById(emp.getId()).get().getId()== emp.getId())
				return "Record already exists";
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		repo.save(emp);
		return "Added Successfully";
	}
	public List printAll() {
		// TODO Auto-generated method stub
		
	}
}
