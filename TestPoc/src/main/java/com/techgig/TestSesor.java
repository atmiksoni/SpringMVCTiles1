package com.techgig;

public class TestSesor {

	public static void main(String[] args) {
		int vehicleCode = Integer.parseInt(args[0]);
		try {
			AntiVehicle.sensor(vehicleCode);
			System.out.print("No fighting vehicle detected");
		} catch (Exception e) {
			System.out.print(e + " detected");
		}

	}

}

class AntiVehicle {

	public static void sensor(int vehicleCode) throws Exception {
		switch (vehicleCode) {
		case 1:
			throw new Tank();
		case 2:
			throw new Submarine();
		case 3:
			throw new AttackAircraft();

		}
	}
}

class Tank extends Exception {
}

class Submarine extends Exception {
}

class AttackAircraft extends Exception {
}
