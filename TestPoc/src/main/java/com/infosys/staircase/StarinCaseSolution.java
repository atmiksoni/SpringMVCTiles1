package com.infosys.staircase;

import java.util.Scanner;

/*
 * Your teacher has given you the task to draw the structure of a staircase.
  * Being an expert programmer, you decided to make a program for the same.
  * You are given the height of the staircase.
  * You need to print a staircase as shown in the example.
 Input Format
 You are given an integer N depicting the height of the staircase.
 Constraints
 1≤N≤100
 Output Format
 Draw a staircase of height N in the format given below.
 For example:
 #
 ##
 ###
 ####
 #####
 ######
 */

public class StarinCaseSolution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Ener input Staring case Height :::");
		int n = in.nextInt();
		System.out.println("Drawing Triangle");
		drawTriangle(n);
		System.out.println("Drawing StareCase");
		drawStairCase(n);

		

	}
	
	public static void drawStairCase(int n){
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				
				if((i+j)>n){
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public  static void drawTriangle(int n){
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (2*n-1); j++) {
				
				if(((j)<=(2*n-i) && j>=i)){
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
