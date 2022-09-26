package com.dbs.demo.contoller;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.dbs.demo.dto.Employee;
@Repository
public class DBSRepo {
	
	public List<Employee> fetch(){
		List<Employee> emplist=Arrays.asList(
			new Employee(1001,"Emp1",65000),
			new Employee(1001,"Emp2",5000),
			new Employee(1002,"Emp3",15000),
			new Employee(1003,"Emp4",35000),
			new Employee(1004,"Emp5",45000)
		);
		return emplist;
	}
}
