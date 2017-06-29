package com.brain.string;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestFile {

	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("c:\\inst.log");
		ObjectInputStream in = new ObjectInputStream(f);
		Object obj = in.readObject();
		System.out.println(obj.getClass());
	}

}
