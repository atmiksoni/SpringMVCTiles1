package com.city;

public class TestModuloOperation {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			if(i%3==0 && i%5==0){
				System.out.println("xy-->"+i);
			}
			else if(i%3==0){
				System.out.println("x-->"+i);
			}
			else if(i%5==0){
				System.out.println("Y-->"+i);
			}
			else{
				System.out.println("-->"+i);
			}
		}

	}
}
