package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {

	String fileName = "Jets";

	List<Jet> airFieldArr = new ArrayList<>();

	public void loadAirField(String fileName) {

		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {

				String[] jetRecord = line.split(",");

				if (line.contains("Cargo")) {

					String make = jetRecord[0];
					double speed = Double.parseDouble(jetRecord[1]);
					int range = Integer.parseInt(jetRecord[2]);
					long price = Long.parseLong(jetRecord[3]);
					CargoPlane cp = new CargoPlane(make, speed, range, price);
					airFieldArr.add(cp);
				}

				if (line.contains("Fighter")) {

					String make = jetRecord[0];
					double speed = Double.parseDouble(jetRecord[1]);
					int range = Integer.parseInt(jetRecord[2]);
					long price = Long.parseLong(jetRecord[3]);
					FighterJet fj = new FighterJet(make, speed, range, price);
					airFieldArr.add(fj);
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

		public void printAirFieldArr(List<Jet>airFieldArr) {
			for (Jet jet : airFieldArr) {
				System.out.println(jet);
				
			}

		}

	}


