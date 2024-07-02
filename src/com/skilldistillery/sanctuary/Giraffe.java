package com.skilldistillery.sanctuary;

public class Giraffe extends Animal{
	private static String noise = " he he he ";

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		super.makeNoise();
		System.out.println(noise);
	}

	@Override
	public int eat(int randomFoodAmount) {
		System.out.println("I love eating " + randomFoodAmount+ " greens"); ;
		return eat(randomFoodAmount);
	}
}