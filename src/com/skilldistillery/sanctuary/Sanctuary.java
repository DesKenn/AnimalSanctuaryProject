package com.skilldistillery.sanctuary;

public class Sanctuary {

	// FIELDS
	Animal[] animals = new Animal[5];
	Attendant attendant = new Attendant();
		
	

	
//CONSTRUCTOR
	public Sanctuary() {
			super();
			this.animals = animals;
			this.attendant = attendant;
//		
		}
// METHODS
	/*
	 * Assigns attendant object to attendant field. If called, an attendant will be
	 * added to the sanctuary.
	 */
	public void setAttendant(Attendant addAttendant) {
		this.attendant = addAttendant;
	}

	/*
	 * Method to iterate over the animals array and print the name of each animal if
	 * it exists. (not equal to null) If equal to null then enclosure is empty
	 */
	public void listAnimals() {
		



	
		
		for (Animal animal : animals) {
			if (animal != null) {
				System.out.println(animal.getName());
			} 
		
		else   {
				System.out.println("This enclosure is empty!");
			}
		}

}

	/*
	 * Method to add animals to the animals array. Iterates over the array and
	 * places a new animal in an empty spot until spots are full.
	 */
	public void addAnimal(Animal newAnimal) {
	
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) { 
				animals[i] = newAnimal;
					listAnimals();
					
			
				return;
			}
		}
		
		System.out.println("Sorry, the sanctuary is full!");
	}
		
	
	
	/*
	 * Method that calls attendant to their duties and interact with animals in the
	 * animals array
	 */
	public void startAttendantRounds() {
		attendant.makeRounds(animals);

	}

}
