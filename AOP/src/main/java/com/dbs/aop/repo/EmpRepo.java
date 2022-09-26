package com.dbs.aop.repo;

import java.util.Arrays;
import java.util.List;

import com.dbs.aop.dto.Employee;

public class EmpRepo {
	public List<Employee> getEmployee(){
		return Arrays.asList(
				new Employee(100,"Ramu",76400,988654321l),
				new Employee(200,"John",66400,937824321l),
				new Employee(300,"Abdul",87400,8643224321l)
				);
	}
}
