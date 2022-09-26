package com.Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {

	private long id;
	private String name;
	private int sal;
	public Employee(long id,String name, int sal) {
		this.setId(id);
		this.setName(name);
		this.setSal(sal);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId()+" "+getName()+" "+getSal();
	}
	public long getId() {
		return id;
	}
	public void setId(long id2) {
		this.id = id2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
@FunctionalInterface
interface DBS{
	List<Employee> salMoreThan200k(List<Employee> empList);
	@Override
	String toString();
}
public class Demo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1,"ABC",500000));
		list.add(new Employee(2,"DEF",200000));
		list.add(new Employee(3,"GHI",100000));
		list.add(new Employee(4,"JKL",300000));
		list.add(new Employee(5,"LMN",450000));
		list.add(new Employee(6,"OPQ",900000));
		list.add(new Employee(7,"RST",88000));
		list.add(new Employee(8,"UVW",700000));
		list.add(new Employee(9,"XYZ",150000));
		list.add(new Employee(10,"DBS",800000));
		/*
		for(Employee s:list) {
			System.out.println(s.toString());
		}
		System.out.println();
		/*
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//System.out.println(list.toString());
		*/
		DBS dbs=(list1)->{
			List<Employee> newlist=new ArrayList<Employee>();
			for(Employee s:list1) {
				if(s.getSal()>200000) {
					newlist.add(s);
				}
			}
			return newlist;
			
		} ;
		dbs.toString();
		}
}