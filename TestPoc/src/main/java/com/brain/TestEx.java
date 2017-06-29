package com.brain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestEx {

	public static void main(String[] args) throws FileNotFoundException {

		try {
		FileReader fil=new FileReader(new File("xyz"))	;
		} catch (FileNotFoundException e) {
			System.out.println("NullePointer exceptio");
			throw e;
		} finally {
			System.out.println("in final block");
		}

	}

}
