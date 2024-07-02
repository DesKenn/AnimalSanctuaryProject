package com.skilldistillery.sanctuary;

public class Ferret extends Animal{
		private static String noise = " hop hop hop ";

		@Override
		public void makeNoise() {
			super.makeNoise();
			System.out.println(noise);
		}

		@Override
		public int eat(int randomFoodAmount) {
			System.out.println("I love eating " + randomFoodAmount+ " treats"); ;
			return randomFoodAmount;
		}
}