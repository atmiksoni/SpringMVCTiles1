package com.brain.string;

import java.util.regex.Pattern;

public class TakePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printIt("Account:20144\nJoseph M\t!");
	}

	public static void printIt(String txt) {
		Pattern wordBreakPattern = Pattern.compile("[\\s]");
		String words[] = wordBreakPattern.split(txt);
		for (String word : words) {
			System.out.println(word);
		}
	}
}
