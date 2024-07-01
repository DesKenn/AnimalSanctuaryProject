package com.skilldistillery.sanctuary;

public class Giraffe extends Animal{
	private static String noise = " he he he";

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		super.makeNoise();
		System.out.println(noise);
	}
//	@Override
//    public String getName() {
//        return "Gerry";
//    }
	@Override
	public int eat(int amount) {
		// TODO Auto-generated method stub
		return super.eat(amount);
	}
}