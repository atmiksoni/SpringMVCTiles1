package com.design.facced;

/*
 * create facced class
 * 
 */
public class Shapemaker {
	private Shape circle;

	private Shape triangle;

	public Shapemaker() {

		circle = new Circle();
		triangle = new Triangle();

	}

	public void drawCircle() {

		circle.draw();
	}

	public void drawTriangle() {
		triangle.draw();
	}

}
