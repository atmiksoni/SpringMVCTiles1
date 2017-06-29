package com.brain.string;

public class Fizz {
	int x = 5;

	public static void main(String[] args) {
		final Fizz fizz = new Fizz();
		Fizz f3 = getFizz(fizz);
		System.out.println("f3::" + f3.x + ":::fizz::" + fizz.x);
		System.out.println(f3== fizz);
		System.out.println(f3.x == fizz.x);
	}

	static Fizz getFizz(Fizz fizz) {
		final Fizz fi = fizz;
		fi.x = 8;
		return fi;

	}

}
