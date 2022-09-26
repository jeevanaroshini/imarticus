package com.Demo;

public class Student {
	static Student stu=null;
	static int count=0;
	int id;
	String name;
	private Student (int id,String name) {
		super();
		this.id=id;
		this.name=name;
		
	}
	public static Student createObj(int id,String name) {
		if(count<=3) {
			count++;
			stu=new Student(id,name);
		}
		return stu;
	}
	public static void main(String args[]) {
		Student s1=createObj(1,"Abc");
		Student s2=createObj(2,"Def");
	}
}
