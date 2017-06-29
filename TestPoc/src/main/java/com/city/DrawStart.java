package com.city;

public class DrawStart {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <=(2 * n )- 1; j++) {
				if (j >=i && j <= (2 * n) - i) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
