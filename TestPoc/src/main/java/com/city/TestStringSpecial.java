package com.city;

public class TestStringSpecial {

	public static void main(String[] args) {
		String str="abcxyzabc";
		
		System.out.println(str.substring(0,1));
		System.out.println(str.substring(str.length()-1));
		
		for(int i=1;i<(str.length()-1)/2;i++){
			
			if(str.substring(0,i).equals(str.substring(str.length()-i)))
			{
				System.out.println("string is special::"+str.substring(0,i));
				break;
			}
			System.out.println("value of i::"+i);
		}
		
	}

}
