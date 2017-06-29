package com.city;

public class TestBank {

	public static void main(String[] args) {
		Bank city=new Barc();
		new TestBank().getBankInfo(city);
	}

	
	public void getBankInfo(Bank bank){
		System.out.println("Bank class get called");
	}
	public void getBankInfo(City city){
		System.out.println("city class get called");
	}
	public void getBankInfo(Barc barc){
		System.out.println("Bank class get called");
	}
	
	
}

class Bank {
	public Bank() {
		System.out.println("Test Bank");
	}
}

class City extends Bank {
	public City() {
		System.out.println("city bank..");
	}
}

class Barc extends Bank {
	public Barc() {
		// TODO Auto-generated constructor stub
	}
}