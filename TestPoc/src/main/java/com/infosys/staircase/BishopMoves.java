package com.infosys.staircase;

import java.util.Scanner;

public class BishopMoves {

	public static void printMoves(int sourceI, int sourceJ, int targetI,
			int targetJ) {

		int tmpI, tmpJ;
		if (sourceI == targetI && sourceJ == targetJ) {
			System.out.println(targetI + " " + targetJ);
			return;
		}

		if (targetI > sourceI) {
			tmpI = targetI - 1;
		} else if (targetI < sourceI) {
			tmpI = targetI + 1;
		} else {
			if (targetI - 1 < 1) {
				tmpI = targetI + 1;
			} else {
				tmpI = targetI - 1;
			}
		}

		if (targetJ > sourceJ) {
			tmpJ = targetJ - 1;
		} else if (targetJ < sourceJ) {
			tmpJ = targetJ + 1;
		} else {
			if (targetJ - 1 < 1) {
				tmpJ = targetJ + 1;
			} else {
				tmpJ = targetJ - 1;
			}
		}

		printMoves(sourceI, sourceJ, tmpI, tmpJ);
		System.out.println(targetI + " " + targetJ);
	}

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Input space delimited coordinates of the source location. Eg: 2 1");
		int sourceI = scanner.nextInt();
		int sourceJ = scanner.nextInt();
		System.out
				.println("Input space delimited coordinates of the target location. Eg: 5 4");
		int targetI = scanner.nextInt();
		int targetJ = scanner.nextInt();

		if (1 > sourceI || sourceI > 8) {
			throw new Exception("Range of the coordinates is between 1 and 8");
		}

		if (1 > sourceJ || sourceJ > 8) {
			throw new Exception("Range of the coordinates is between 1 and 8");
		}

		if (1 > targetI || targetI > 8) {
			throw new Exception("Range of the coordinates is between 1 and 8");
		}

		if (1 > targetJ || targetJ > 8) {
			throw new Exception("Range of the coordinates is between 1 and 8");
		}

		int sourceDiff = Math.abs(sourceI - sourceJ);
		int targetDiff = Math.abs(targetI - targetJ);

		if (Math.abs(sourceDiff - targetDiff) % 2 != 0) {
			throw new Exception(
					"Invalid source and target location coordinates");
		}

		System.out.println("The path from source to target is:");
		printMoves(sourceI, sourceJ, targetI, targetJ);
	}

}
