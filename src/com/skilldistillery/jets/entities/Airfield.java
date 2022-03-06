package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Airfield {

	Scanner kb = new Scanner(System.in);

	public Airfield() {
		loadAirField(fileName);

	}

	String fileName = "Jets.txt";

	List<Jet> jetFleet = new ArrayList<>();

	public void loadAirField(String fileName) {
		String fileLine;

		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {

			while ((fileLine = bufIn.readLine()) != null) {

				String[] jetRecord = fileLine.split(":");

				if (fileLine.contains("Fighter")) {
					String model = jetRecord[1];
					double speed = Double.parseDouble(jetRecord[2]);
					int range = Integer.parseInt(jetRecord[3]);
					long price = Long.parseLong(jetRecord[4]);

					FighterJet fighterJet = new FighterJet(model, speed, range, price);
					jetFleet.add(fighterJet);
				}
				if (fileLine.contains("Cargo")) {
					String model = jetRecord[1];
					double speed = Double.parseDouble(jetRecord[2]);
					int range = Integer.parseInt(jetRecord[3]);
					long price = Long.parseLong(jetRecord[4]);
					CargoPlane cargoPlane = new CargoPlane(model, speed, range, price);
					jetFleet.add(cargoPlane);
				}

			}

		} catch (IOException e) {
			System.err.println(e);
		}

	}

	public void printJetFleet() {
		for (Jet jet : jetFleet) {
			System.out.println(jet);

		}
	}

	public void flyJets() {
		System.out.println("Flying the fleet");
		int index = 1;
		for (Jet jet : jetFleet) {
			String flying = index + " ";
			flying += jet.flyJets();
			System.out.println(flying);
			index++;
		}

	}

	public void fastestJet() {
		Jet fastest = jetFleet.get(0);
		for (Jet jet : jetFleet) {
			if (jet.getSpeed() > fastest.getSpeed()) {
				fastest = jet;
			}

		}
		System.out.println("The fasted jet in our fleet is: ");
		System.out.println(fastest);

	}

	public void longestRange() {
		Jet longest = jetFleet.get(0);
		for (Jet jet : jetFleet) {
			if (jet.getRange() > longest.getRange()) {
				longest = jet;
			}

		}
		System.out.println("Our jet with the longest range is: ");
		System.out.println(longest);

	}

	public void loadCargo() {
		for (Jet jet : jetFleet) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).loadCargo();

			}
		}

	}

	public void combatReady() {
		for (Jet jet : jetFleet) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).readyForCombat();
			}
		}
	}

	public void addJet() {

		System.out.println("What is the model of the jet you want to add? ");
		String modelAdd = kb.nextLine();
		kb.next();

		System.out.println("What is the speed of this jet?");
		Double speedAdd = kb.nextDouble();

		System.out.println("What is the range of " + modelAdd + "?");
		int rangeIn = kb.nextInt();

		System.out.println("What is the price of " + modelAdd + "?");
		long priceIn = kb.nextLong();

		JetImpl userJet = new JetImpl(modelAdd, speedAdd, rangeIn, priceIn);
		jetFleet.add(userJet);

		System.out.println("The fleet with " + modelAdd + ":");
		for (Jet jet : jetFleet) {
			System.out.println(jet);
		}

	}

	public void removeJet() {

		System.out.println("Whch jet would you like to remove?");
		System.out.println("Choose a number from the list below.");

		int index = 1;
		for (int i = 1; i < jetFleet.size(); i++) {
			System.out.println(index + " " + jetFleet.get(i).getModel());
			index ++;
		}

		int deleteJet = kb.nextInt();
		jetFleet.remove(deleteJet);

	}

	public void setJetFleet(List<Jet> jetFleet) {
		this.jetFleet = jetFleet;

	}

}
