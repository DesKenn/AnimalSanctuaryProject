package com.skilldistillery.sanctuary;

public class Dog extends Animal {
	
	private static String noise = "woof woof!";

	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println(noise);
	}
	@Override
    public String getName() {
        return "Scrappy";
    }
	@Override
	public int eat(int randomFoodAmount) {
		return super.eat(randomFoodAmount);
	}

}
