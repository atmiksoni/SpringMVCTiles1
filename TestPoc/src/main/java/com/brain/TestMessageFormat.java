package com.brain;

import java.text.MessageFormat;

public class TestMessageFormat {

	public static void main(String[] args) {
		MessageFormat format = new MessageFormat("First{2} Second{1}");
		String[] input = { "one", "two", "three" };
		System.out.println(format.format(input));

	}

}
