package com.techgig;


public class TestThread {

	public static void main(String[] args) {
		/* Fetching the command line arguments */
		int size = Integer.parseInt(args[0]);
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(args[i + 1]);
		}

		Array a = new Array(arr, size);

		int N = Integer.parseInt(args[size + 1]);

		/*
		 * Call to execute() method for each "Operation" object should increment
		 * the value of each array element by 1
		 */
		Operation[] o = new Operation[N];

		for (int i = 0; i < N; i++) {
			o[i] = new Operation(a);
			o[i].execute();
			System.out.println("execute:::" + i);
		}

		// Checking if all the threads are alive or not
		for (int i = 0; i < N; i++)
			if (o[i].t.isAlive() == false) {
				System.out
						.print("All threads should be active at this point in time");
				System.exit(0);
			}

		// Waiting for the threads to die
		for (int i = 0; i < N; i++)
			try {
				o[i].t.join();
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}

		a.printArray();
	}

}

/** This is a read only file **/
class Array {

	private int[] arr;
	private int size;
	public int length;

	Array(int[] arr, int size) {
		this.arr = new int[size];
		for (int i = 0; i < size; i++)
			this.arr[i] = arr[i];
		this.size = size;
	}

	public void increment() {
		int[] incArr = new int[size];
		for (int i = 0; i < size; i++)
			incArr[i] = arr[i] + 1;

		timeLapse();

		for (int i = 0; i < size; i++)
			arr[i] = incArr[i];
	}

	private void timeLapse() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

	public void printArray() {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

}

class Operation implements Runnable {
	Array a;
	Thread t;

	public Operation(Array a) {

		// ********************************
		// **Candidate's code starts here**
		this.a=a;
		// ***Candidate's code ends here***
		// ********************************
	}

	public  void execute() {

		// ********************************
		// **Candidate's code starts here**
		this.t = new Thread(new Operation(this.a));
		t.start();
		// ***Candidate's code ends here***this
		// ********************************
	}

	public void run() {
		// ********************************
		// **Candidate's code starts here**
		synchronized (a) {
			a.increment();
		}
			
		// ***Candidate's code ends here***
		// ********************************

	}
	
	

}
