package com.tieto;

public class TestFor {

	public static void main(String[] args) {
		int a[][]=new int[10][10];
		 float b[]=new float[1];
		
		int i,j=0;
		x:
		for ( i = 0; i < 2; i++) {
			
			for ( j = i; j < 3; j++) {
				continue x;
			}
		
		}
		System.out.println("i::"+i+"::j::"+j);
		
	}

}
