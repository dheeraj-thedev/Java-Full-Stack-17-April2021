package com.carrerera.commentxexample;

public class Student {
	private String name;   //null
	private int age;  //0
	private String contact; // null

	
	public Student() {}
	public Student(String name,String contact, int age) {
		this.name=name;
		this.age=age;
		this.contact=contact;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
