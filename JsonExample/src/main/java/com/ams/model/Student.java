package com.ams.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	private String stdId;
	@Value("Atmik")
	private String stdName;
	private int age;
	private String colleageName;
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColleageName() {
		return colleageName;
	}
	public void setColleageName(String colleageName) {
		this.colleageName = colleageName;
	}
	

}
