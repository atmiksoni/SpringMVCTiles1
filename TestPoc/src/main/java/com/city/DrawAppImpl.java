package com.city;

public class DrawAppImpl implements DrawApp {

	@Override
	public int calculaor(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public static void main(String[] args) {
		System.out.println(new DrawAppImpl().calculaor(1, 0));

	}

}
