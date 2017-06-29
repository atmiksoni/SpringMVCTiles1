package com.brain.thread;

public class TestThread extends Thread {

	public void run() {
		while (true) {
			System.out.println("Hello, World!");
		}
	}

	public static void main(String[] s) {
		TestThread a = new TestThread();
		a.setDaemon(true);;
		a.start();
	}

}
