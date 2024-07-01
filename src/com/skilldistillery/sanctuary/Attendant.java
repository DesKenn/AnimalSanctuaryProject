package com.skilldistillery.sanctuary;

public class Attendant {

	/*
	 * Method used to call the attendant to perform duties. Contains a for loop that
	 * iterates over the animals array
	 * 
	 */
	public void makeRounds(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				int randomFoodAmount = (int) (Math.random() * 12 + 4);

				System.out.print("Feeding " + animals[i].getName() + " " + randomFoodAmount + " foods");
				animals[i].makeNoise();
				animals[i].eat(randomFoodAmount);

				System.out.println();

			} else {
				System.out.println("The enclosure is empty");

			}

		}
		System.out.println();
		System.out.println("Time for a break!");

	}
}
