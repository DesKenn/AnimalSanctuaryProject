package com.skilldistillery.sanctuary;

public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	public void makeNoise() {
		System.out.println();
	}
	public int eat(int randomFoodAmount) {
		
		 System.out.println("I'm eating " + randomFoodAmount +  " foods");
		return randomFoodAmount;
	}
	
}
