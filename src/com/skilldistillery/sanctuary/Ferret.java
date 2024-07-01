package com.skilldistillery.sanctuary;

public class Ferret extends Animal{
		private static String noise = " hop hop hop ";

		@Override
		public void makeNoise() {
			// TODO Auto-generated method stub
			super.makeNoise();
			System.out.println(noise);
		}
//		@Override
//	    public String getName() {
//	        return "Slinky";
//	    }
		@Override
		public int eat(int amount) {
			// TODO Auto-generated method stub
			return super.eat(amount);
		}
}