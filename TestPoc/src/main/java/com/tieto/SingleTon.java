package com.tieto;

import java.io.Serializable;

public class SingleTon implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2284050348448976612L;

	private static SingleTon instance;

	private int value;

	/* Private Constructor prevents any other class from instantiating */
	private SingleTon() {
		System.out.println("called");
	}

	public static synchronized SingleTon getInstance() {

		/* Lazy initialization, creating object on first use */
		if (instance == null) {
			synchronized (SingleTon.class) {
				if (instance == null) {
					instance = new SingleTon();
				}
			}
		}

		return instance;
	}

	/* Restrict cloning of object */
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void display() {
		System.out.println("Hurray! I am display from Singleton!");
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
