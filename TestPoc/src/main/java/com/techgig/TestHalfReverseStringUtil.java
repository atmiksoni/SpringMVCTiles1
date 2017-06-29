package com.techgig;

public class TestHalfReverseStringUtil {

	public static void main(String[] args) {
		String input="ATMI";
	System.out.println("Revers String:::"+reverseUtil(input));

	}

	
	public static String reverseUtil(String input){
		return input.substring(input.length()/2)+input.substring(0,(input.length()/2));
	}
}
