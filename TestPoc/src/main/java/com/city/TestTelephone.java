package com.city;

public class TestTelephone {

	static char[][] phoneArr = { { 'A', 'B', 'C' }, { 'D', 'E', 'F' },
			{ 'G', 'H', 'I' }, { 'J', 'K', 'L' }, { 'M', 'N', 'O' },
			{ 'P', 'Q', 'R', 'S' }, { 'T', 'U', 'V' }, { 'W', 'X', 'Y', 'Z' } };

	static char[] getPhoneArr(int number) {
		return phoneArr[number];
	}

	public static void main(String[] args) {
		String []telePhoneNo="5,2,1,0".split(",");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < telePhoneNo.length; i++) {
			char[] combination = getPhoneArr(Integer.valueOf(telePhoneNo[i]));
			for (int j = 0; j < combination.length; j++) {
				stringBuilder.append(combination[j]);
				stringBuilder.append(",");
			}
		}

		
		System.out.println("Total combination::" + stringBuilder.toString());
	}

}
