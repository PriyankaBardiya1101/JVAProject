package com.hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	
@Id
	private int id;
	private String name;
	private String city;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String city, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
