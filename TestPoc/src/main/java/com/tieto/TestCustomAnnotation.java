package com.tieto;

import java.lang.reflect.Method;

public class TestCustomAnnotation {

	@MyAnnotation(key = "Atmik", value = "soni")
	public void testAnnotationMethod() {
		try {
			Class<? extends TestCustomAnnotation> cls = this.getClass();
			Method mth = cls.getMethod("testAnnotationMethod");
			MyAnnotation myAnno = mth.getAnnotation(MyAnnotation.class);
			System.out.println("key: " + myAnno.key());
			System.out.println("value: " + myAnno.value());
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new TestCustomAnnotation().testAnnotationMethod();
	}
}
