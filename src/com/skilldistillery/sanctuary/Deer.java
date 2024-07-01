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
    public String getName() {
        return "Thumper";
    }
	@Override
	public int eat(int amount) {
		// TODO Auto-generated method stub
		return super.eat(amount);
	}

	
}
