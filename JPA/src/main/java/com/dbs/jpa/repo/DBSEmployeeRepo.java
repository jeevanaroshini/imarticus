package com.dbs.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dbs.jpa.model.DBSEmployee;


public interface DBSEmployeeRepo extends JpaRepository<DBSEmployee, Integer>{
		
	}
