package com.brain.string;

import java.text.Collator;

public class TestCollator {
	
	
	/*At its most basic, the Collator class compares 
	two strings, and returns the result of that comparison. 
	Similar to basic string comparisons using comparison functions
	included in the string class, specifically the "compareTo" function
	, Collator comparisons use a default definition of the value of letters in the 
	string to make comparisons, returning an integer result based on the comparison.
	So, for example, the following Collator code returns a numerical result: */

	public static void main(String[] args) {
		Collator mine = Collator.getInstance();
		if (mine.compare("AAA", "aaa") > 0){
		System.out.println("AAA is Greater than aaa");
		}
	}
		


	

}
