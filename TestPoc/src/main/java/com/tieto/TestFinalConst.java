package com.tieto;

public class TestFinalConst {

	String name;
	
	int age;
	
	
	public  TestFinalConst(String name,int age) {
		this.name=name;
		this.age=age;
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


	@Override
	public String toString() {
		return "TestFinalConst [name=" + name + ", age=" + age + "]";
	}
	
	
	public static void main(String[] args) {
		TestFinalConst testFinalConst=new TestFinalConst("Atmik", 30);
		testFinalConst.setName("Soni");
		System.out.println(testFinalConst);
	}
}
