package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {
	
	Airfield af;
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		
		JetsApplication jetsApp = new JetsApplication();
				
		
	jetsApp.launch();

	}

	public void launch() {
	af = new Airfield();
		menu();
	}

	private void menu() {

		System.out.println("MENU OPTIONS EDIT ME ****");
		System.out.println();
		System.out.println("1. List fleet ");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest Jet");
		System.out.print("4. View jet with longest range ");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a Jet from the Fleet ");
		System.out.println("9. Quit");
		boolean menuLoop = true;
		while (menuLoop) {

			int menuChoice = kb.nextInt();

			switch (menuChoice) {

			case 1:
				System.out.println("Here is our Fleet:  ");
				 System.out.println(af.list());

				break;

			case 2:
				System.out.println("Flying all jets!");
				System.out.println();

				break;

			case 3:
				System.out.println("Here is our fastest Jet: ");
				System.out.println();

				break;

			case 4:

				System.out.println("Our jet with the longest range is: ");
				System.out.println();

				break;

			case 5:

				System.out.println("Loading All Cargo Jets! ");
				System.out.println();

				break;

			case 6:

				System.out.println("Dogfight!  ");
				System.out.println();

				break;

			case 7:

				System.out.println("What Jet would you like to add to the Fleet? ");
				System.out.println();
				break;

			case 8:

				System.out.println("Which jet would you like to remove? ");
				System.out.println();

				break;

			case 9:

				System.out.println("Good bye! ");

				menuLoop = false;
				break;

			default:
				System.out.println("Invalid entry, pleaase try again. ");
				break;

			}

		}

	}
}
