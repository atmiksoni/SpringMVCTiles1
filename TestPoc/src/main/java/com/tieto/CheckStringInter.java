package com.tieto;

public class CheckStringInter {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = new String("Hello").intern();
		String s4 = "Hello";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s1==s4);
		System.out.println("s1 eq-->s2::"+s1.equals(s2));
		System.out.println("s1 eq-->s3::"+s1.equals(s3));
		System.out.println("s2 eq-->s3::"+s2.equals(s3));
		System.out.println("s1 eq-->s4::"+s1.equals(s4));
	}

}
