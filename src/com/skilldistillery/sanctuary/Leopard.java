package com.skilldistillery.sanctuary;

public class Leopard extends Animal{
	private static String noise = "meow meow";

	
	
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		super.makeNoise();
		System.out.println( noise);
	}
	@Override
    public String getName() {
        return "Leo";
    }

	@Override
	public int eat(int randomFoodAmount) {
		// TODO Auto-generated method stub
		return super.eat(randomFoodAmount);
	}

	
}
