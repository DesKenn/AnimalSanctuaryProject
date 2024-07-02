package com.skilldistillery.sanctuary;

import java.util.Scanner;

public class AnimalSanctuaryApp {

//FIELDS 
	private Sanctuary sanctuary; // instance of sanctuary class

// METHODS

	/*
	 * Initializes sanctuary fields. Contains a loop with menu choices for the user
	 * to select.
	 */

	public void launchApp() {
		sanctuary = new Sanctuary(); // instance of sanctuary class???
		Scanner kb = new Scanner(System.in);
		boolean keepGoing = true;

		// loop for menu options
		while (keepGoing) {

			System.out.println("Sanctuary Menu");
			System.out.println("1. List Sanctuary's animals");
			System.out.println("2. Add a new animal");
			System.out.println("3. Start Attendant's rounds ");
			System.out.println("4. Quit ");

			int userChoice = kb.nextInt();
			switch (userChoice) {
			case 1:
				sanctuary.listAnimals();
				break;
			case 2:

	
	
				System.out.println("Enter 1 to add a ferret, 2 to add a giraffe OR 3 to add a dog.");
				int animalType = kb.nextInt();

				System.out.println("What is their name?");
				String animalName = kb.next();
				Animal newAnimal;

				switch (animalType) {

				case 1:
					newAnimal = new Ferret();
					newAnimal.setName(animalName);

					sanctuary.addAnimal(newAnimal);
					break;
				case 2:
					newAnimal = new Giraffe();
					newAnimal.setName(animalName);

					sanctuary.addAnimal(newAnimal);
					break;
				case 3:
					newAnimal = new Dog();
					newAnimal.setName(animalName);
					
					sanctuary.addAnimal(newAnimal);
					break;
				default:
					System.err.println("Please pick 1, 2, or 3 to add an animal.");
					break;
				}
				break;
			case 3:
				sanctuary.listAnimals();
				System.out.println();
				sanctuary.startAttendantRounds();
				break;
			case 4:
				System.out.println("Thanks for visiting the sanctuary! :)");

				keepGoing = false;
				break;
			default:
				System.err.println("Please input a number on the menu.");
			}
		}
		kb.close();
	}

	public AnimalSanctuaryApp() {
	}

//Main method that creates an AnimalSanctuaryApp object and calls the launchApp method.
	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}

}
