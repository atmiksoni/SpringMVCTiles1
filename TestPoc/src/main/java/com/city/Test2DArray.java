package com.city;

public class Test2DArray {

	public static void main(String[] args) {

		/*
		 * String[][] str = new String[][] { { "00", "01", "02" }, { "10", "11",
		 * "12" }, { "20", "21", "22" } };
		 */
		// String[0] schoolbag2 = { "Books", "Pens"};

		String str = new String();
		str = "A#A#D#B,B#B#C#A,D#C#C#D,C#D#A#D";
		String input2[] = str.split(",");
		int count = word_count(4, input2, "ABDC");
		System.out.println("ABDC::::" + count);

	}

	public static int word_count(int input1, String[] input2, String input3) {
		int globalCount = 0;

		if (input1 > 0 || input1==input3.length()) {

			String str[][] = get2DArray(input2);

			String temp = "";
			for (int i = 0, j = input1 - 1; i < input1 && j >= 0; i++, j--) {
				temp += str[i][j];
			}
			System.out.println(temp);
			if (temp.equals(input3) || temp.equals(reversString(input3))) {
				globalCount++;
			}
			String temp1 = "";
			for (int i = 0; i < input1; i++) {
				temp1 += str[i][i];
			}
			if (temp1.equals(input3) || temp1.equals(reversString(input3))) {
				globalCount++;
			}

			for (int i = 0; i < input1; i++) {
				String temp2 = "";
				String temp3 = "";
				for (int j = 0; j < str.length; j++) {
					temp2 += str[i][j];
					temp3 += str[j][i];
				}

				if (temp2.equals(input3) || temp2.equals(reversString(input3))) {
					globalCount++;
				}
				if (temp3.equals(input3) || temp3.equals(reversString(input3))) {
					globalCount++;
				}
			}
		}
		return globalCount;
	}

	public static String[][] get2DArray(String[] str) {

		String a[][] = new String[str.length][str.length];

		for (int i = 0; i < str.length; i++) {
			a[i] = str[i].split("#");
		}
		return a;
	}

	/*
	 * Get revers string
	 */

	public static String reversString(String original) {
		String reverse = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);

		}
		return reverse;
	}
}
