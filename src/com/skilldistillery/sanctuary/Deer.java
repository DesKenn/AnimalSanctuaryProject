package com.skilldistillery.sanctuary;

public class Deer extends Animal{
	private static String noise = " la la la";

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		super.makeNoise();
		System.out.println(noise);
	}

	@Override
	public int eat(int randomFoodAmount) {
		System.out.println("I love eating " + randomFoodAmount+ " piece of grass"); ;
		return randomFoodAmount;
	}

	
}
