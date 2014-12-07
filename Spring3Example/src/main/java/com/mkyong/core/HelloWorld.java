package com.mkyong.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

	public HelloWorld() {
		System.out.println("Hello student");
	}

	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	@Autowired
	public Student student;

	String name;

	@Value("Atmik")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
