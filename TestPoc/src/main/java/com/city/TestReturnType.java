package com.city;

public class TestReturnType {

	public static void main(String[] args) {
		new TestReturnType().getData();

	}
	
	public int getData(){
		return (true?null:0);
	}

}
