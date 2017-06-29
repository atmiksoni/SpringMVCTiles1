package com.city;

public class TestReversString {

	public static void main(String[] args) {
		System.out.println(reverseString("Atmik"));
	}

	   static String reverse = "";
	     
	    public static String reverseString(String str){
	         
	       /* if(str.length() == 1){
	            return str;
	        } else {*/
	            reverse =reverse+ str.charAt(str.length()-1)
	                    +reverseString(str.substring(0,str.length()-1));
	            return reverse;
	       // }
	    }

}
