package com.skilldistillery.jets.entities;

public class FighterJet extends Jet {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price );
	}

	@Override
	public String toString() {
		return "\nFighter Jet Model: " + getModel() + " Speed: " + getSpeed() + " Range: " + getRange() + " Price " + getPrice();
	}

	@Override
	public String flyJets() {
		return "Alpha strike sucess, all Fighter Jets are in the air!";
	}

}
