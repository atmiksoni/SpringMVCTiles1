package com.design.facced;

public class FacadePatternDemo {

	public static void main(String[] args) {
		Shapemaker shapemaker = new Shapemaker();
		shapemaker.drawCircle();
		shapemaker.drawTriangle();

	}

}
