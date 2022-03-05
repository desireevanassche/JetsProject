package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet {

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}


	@Override
	public String toString() {
		return "\nCargoPlane Model: " + getModel() + " Speed: " + getSpeed() + " Range: " + getRange() + " Price "
				+ getPrice();
	}

	@Override
	public String flyJets() {
		return "Cargo Jets are Airborn";
	}

}
