package com.JDBC.demo1.dto;

public class Person {
	int Id;
	String LaName,fName,Address,City;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getLaName() {
		return LaName;
	}
	public void setLaName(String laName) {
		LaName = laName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Person Id=" + Id + ", LaName=" + LaName + ", fName=" + fName + ", Address=" + Address + ", City="
				+ City +"\n";
	}
	
}
