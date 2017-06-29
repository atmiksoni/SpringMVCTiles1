package com.city;

import java.util.Date;

public final class TestFinal {

	public String name;
	public Date date;

	public TestFinal(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	public static void main(String[] args) {
			TestFinal testFinal=new TestFinal("Atmik", new Date());
			System.out.println(testFinal.getDate());
			
	}
}
