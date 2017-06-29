package com.junit;

import static org.junit.Assert.*;


import java.util.Arrays;

import org.junit.Test;

public class TestArray {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		int [] inputArr={1,5,2,6,4};
		Arrays.sort(inputArr);
		int expectedArr[]={1,2,4,3,6};
		assertArrayEquals(expectedArr, inputArr);
	}

}
