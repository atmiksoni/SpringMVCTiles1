package com.city;

public class CandidateCode {

	public static void main(String[] args) {

		String inputStr = "1,5,9,2";
		String[] tempStr = inputStr.split(",");
		if (tempStr.length > 2) {
			String temp = inputStr;
			for (int i = 0; i < tempStr.length - 2; i++) {
				temp = sequences(temp);
				System.out.println("inputStr::" + temp);
			}
		}
	}

	public static String sequences(String input1) {
		String[] tempStr = input1.split(",");

		if (tempStr.length > 2) {
			StringBuilder strBuilder = new StringBuilder();
			for (int i = 0; i < tempStr.length - 1; i++) {
				int diff = Integer.parseInt(tempStr[i + 1])
						- Integer.parseInt(tempStr[i]);
				strBuilder.append(diff);
				if (i < tempStr.length - 2)
					strBuilder.append(",");
			}
			return strBuilder.toString();
		} else {
			return input1;
		}

	}

}
