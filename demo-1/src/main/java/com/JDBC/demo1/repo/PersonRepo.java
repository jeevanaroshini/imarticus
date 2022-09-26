package com.JDBC.demo1.repo;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.jdbc.core.JdbcTemplate; 
import org.springframework.jdbc.core.RowMapper; 
import org.springframework.stereotype.Repository; 
import com.JDBC.demo1.dto.Person; 


@Repository 
public class PersonRepo { 
	@Autowired 
	JdbcTemplate jdbcTemplate; 
	RowMapper<Person> myRowmapper= (rs,num) ->{ 
		Person person = new Person(); 
		person.setId(rs.getInt(1)); 
		person.setLaName(rs.getString(2)); 
		person.setfName(rs.getString(3)); 
		person.setAddress(rs.getString(4)); 
		person.setCity(rs.getString(5)); 
		return person; 
	}; 
	public List<Person> getAllPersons() { 
		String sqlQuery = "select * from persons"; 
		return jdbcTemplate.query(sqlQuery, myRowmapper); 
	}
	
	public String addPerson(Person person) {
		//Person person=new Person();
		String query="insert into persons values ("+person.getId()+",'"+person.getLaName()+"','"+
		person.getfName()+"','"+person.getAddress()+"','"+person.getCity()+"');";
		int num=jdbcTemplate.update(query);
		if(num>0) return "Successful";
		else return "Failed";
	
	}
	public String deletePerson(Person person) {
		//Person person=new Person();
		String query="delete from persons where id="+person.getId()+";";
		int num=jdbcTemplate.update(query);
		if(num>0) return "Successful";
		else return "Failed";
	
	}
	
}