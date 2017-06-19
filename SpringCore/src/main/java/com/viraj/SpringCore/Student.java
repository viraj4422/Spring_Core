package com.viraj.SpringCore;

import org.springframework.stereotype.Component;

//@Component
public class Student {

	private String name;

	public Student(String name) {
		this.name = name;
	}

	public void tellName() {
		System.out.println("Hello..My name is " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
