package com.brain;

public class TestExp {

	static class Ex1 extends Exception {
	}

	static class Ex2 extends Ex1 {
	}

	static class Ex3 extends Ex2 {
	}

	static void method1() throws Ex1, Ex2, Ex3 {
		throw new Ex2();
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (Ex3 ex3) {
			System.out.println("A");
		} catch (Ex2 ex2) {
			System.out.println("B");
		} catch (Ex1 ex3) {
			System.out.println("C");
		}
		catch (Exception e) {
			System.out.println("D");
		}
		finally{
			System.out.println("E");
		}
	}

}
