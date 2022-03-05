package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {

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

	public List<Jet> list() {
		List<Jet> output = jetFleet;
		return output;

	}

	public void setJetFleet(List<Jet> jetFleet) {
		this.jetFleet = jetFleet;

	}

}
