package com.dbs.demo.contoller;

import java.util.List;
import com.dbs.demo.contoller.DBSRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.demo.dto.Employee;

@Service
public class DBSService {
	
	@Autowired
	DBSRepo repo;
	
	public Employee search (int eid) {
		List<Employee> emplist=repo.fetch();
		for(Employee e:emplist) {
			if(e.id==eid)
				return e;
		}
		return null;
	}
	public List<Employee> allDetails (){
		return repo.fetch();
	}
}
