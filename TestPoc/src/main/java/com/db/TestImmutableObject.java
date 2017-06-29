package com.db;

import java.util.Date;

public class TestImmutableObject {

	public static void main(String[] args) {
		ImmutableObject immutableObject = ImmutableObject.createNewInstance(
				100, "Atmik", new Date());
		System.out.println(immutableObject);
		tryModification(immutableObject.getImmutableField1(),
				immutableObject.getImmutableField2(),
				immutableObject.getMutableField());
		System.out.println(immutableObject);

	}

	private static void tryModification(Integer immutableField1,
			String immutableField2, Date mutableField) {
		immutableField1 = 10000;
		immutableField2 = "test changed";
		mutableField.setDate(10);
	}
}
