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
		System.out.println("Animal's Sing");
	}
	public int eat() {
		return 0;
	}
	
}
