package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CarryCargo {
private boolean canLoad;

	public CargoPlane() {
	}

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
		return getModel() + " preparing for take off ... and we are off!" + "\nThere is enough fuel in the " + getModel() + " for approximately " + Math.round(getRange()/getSpeed()) + " hours of flight.\n With a range of " + getRange() + " and a speed of " + getSpeed() + ".\n";
	}

	@Override
	public void loadCargo() {
		System.out.println("Cargo has been Loaded on " + getModel());
		
	}

	@Override
	public boolean canLoad() {
		canLoad = true;
		return canLoad;
	}


}
