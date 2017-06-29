package com.infosys.staircase;

import java.util.Scanner;

public class JumpingChess {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			int s = in.nextInt();// square size
			int x = in.nextInt();
			int y = in.nextInt();
			int dx = in.nextInt();
			int dy = in.nextInt();
			int noOfJumps = flyOnChess(s, x, y, dx, dy);

			System.out.println("No Of jumps:" + noOfJumps);// paintChessBoard();
		}

	}

	public static int flyOnChess(int s, int x, int y, int dx, int dy) {
		int noOfJumps = 0;
		int row = 0; // Row number, from 0 to 7
		int col = 0; // Column number, from 0 to 7
		boolean isWhiteFound = false;

		while (x < (s * 8 + 1) && y < (s * 8 + 1)) {
			x = x + dx;
			y = y + dy;
			row = x / s;
			col = y / s;
			
			if (((row) % s) == (col % s)) {
				System.out.println("Black Found");
				noOfJumps++;
			} else {
				System.out.println("row::"+row+"::col::"+col);
				System.out.println("white::" + (x) + ":::col::" + (y));
				isWhiteFound = true;
				break;
			}

			
		}
		if (!isWhiteFound)
			System.out.println("No white Found");
		return noOfJumps;

	}

	public static void paintChessBoard() {

		int row = 0;
		int col = 0;
		int sq = 65;

		while (row != (sq * 8)) {
			if (row % 10 != 0 && col % 10 == 0)
				System.out.println("Black");
			if (row % 10 != 0 && col % 10 != 0)
				System.out.println("White");
			if (row % 10 == 0 && col % 10 == 0)
				System.out.println("Black");
			if (row % 10 == 0 && col % 10 != 0)
				System.out.println("Black");

			row = row + sq;
			if (row == (sq * 8)) {
				row = 0;
				col = col + sq;
				if (col == (sq * 8))
					break;
			}
		}
	}
}
