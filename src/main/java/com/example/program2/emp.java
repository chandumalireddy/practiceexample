package com.example.program2;

import java.util.List;

public class emp {

	String name;
	int age;
	int sal;
	List<homeAddress> home;
	
	public List<homeAddress> getHome() {
		return home;
	}
	public void setHome(List<homeAddress> home) {
		this.home = home;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

}
