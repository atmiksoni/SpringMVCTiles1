package com.brain;

public class Bridge {

	public enum Suits {

		CLUBS(20), DIAMONDS(20), HEARTS(30), SPADES(30), NOTRPUS(40) {
			public int getValue(int bid) {
				return ((bid - 1) * 30) + 40;
			}
		};
		private int points;

		Suits(int point) {
			this.points = point;
		}

		public int getValue(int bid) {
			return points * bid;
		}
	}

	
	public static void main(String[] args) {
		System.out.println(Suits.NOTRPUS.getValue(3));
		System.out.println(Suits.SPADES+"::::::"+Suits.SPADES.points);
		System.out.println(Suits.values()[0].points);
	}
}
