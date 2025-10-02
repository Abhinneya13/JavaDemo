package com.abhi.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {

	private int studendId;
	private int age;
	private String firstName;
	private String secondName;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> listOfStudents = new ArrayList<Student>();
		for(int i = 0; i < 100; i++) {
			Student s = new Student();
			s.setStudendId(new Random().nextInt());
			s.setAge(new Random().nextInt(16, 22));
			s.setFirstName("FirstName"+i);
			s.setSecondName("SecondName"+i);
			
			// save to a DB
			listOfStudents.add(s);
		}
		
		System.out.println("List of Students is " + listOfStudents);
		
		System.out.println(listOfStudents.get(50).getFirstName());
		
		System.out.println(listOfStudents.get(41).getFirstName());
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getStudendId() {
		return studendId;
	}

	public void setStudendId(int studendId) {
		this.studendId = studendId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}	
	
	
	
}
