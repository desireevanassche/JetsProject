package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {

	private Airfield af;
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
		boolean menuLoop = true;
		while (menuLoop) {

		System.out.println("MENU OPTIONS EDIT ME ****");
		System.out.println();
		System.out.println("1. List fleet ");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest Jet");
		System.out.println("4. View jet with longest range ");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a Jet from the Fleet ");
		System.out.println("9. Quit");

			int menuChoice = kb.nextInt();

			if (menuChoice > 0 || menuChoice <= 10) {
				
			switch (menuChoice) {

			case 1:
				af.printJetFleet();

				break;

			case 2:

				af.flyJets();

				break;

			case 3:

				af.fastestJet();

				break;

			case 4:

				af.longestRange();
				break;

			case 5:

				af.loadCargo();

				break;

			case 6:
				af.combatReady();

				break;

			case 7:

				af.addJet();

			case 8:

				af.removeJet();

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
}
