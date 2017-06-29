package com.city;

import java.util.HashSet;

public class Question {

	public static void main(String[] args) {
		/*
		 * int a[]={1}; new Question().increment(a);
		 * System.out.println(a[a.length-1]);
		 */

		HashSet<Name> set = new HashSet<Name>();
		Name name=new Name("PTC");
		set.add(name);
		name.setName("my Name is PTC");
		System.out.println(set.contains(name));
		
	}

	void increment(int[] b) {
		b[b.length - 1]++;
	}
}

class Name {

	private String name;

	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (int) (Math.random()*100+super.hashCode());
	}
	
	@Override
	public boolean equals(Object obj) {
		Name name=(Name)obj;
		return this.name.equals(name.getName());
	}
}