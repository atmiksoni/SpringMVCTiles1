package com.brain;

public class TestCount {

	public static void main(String[] args) {

		int count = 0, i = 0;
		do {
			count += i;
			i++;
			if (count > 5)
				break;
		} while (i <= 4);
System.out.println(count+"::"+i);
	}

}
