package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {
	
	public FighterJet () { }

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price );
	}

	@Override
	public String toString() {
		return "Fighter Jet Model: " + getModel() + " Speed: " + getSpeed() + " Range: " + getRange() + " Price " + getPrice();
	}

	@Override
	public String flyJets() {
		return "Alpha strike initiated! " + getModel() + " has launched. " +  "\nThere is enough fuel in the " + getModel() + " for approximately " + Math.round(getRange()/getSpeed()) + " hours of flight.\nWith a range of " + getRange() + " and a speed of " + getSpeed() + ".";
	}

	@Override
	public void readyForCombat() {
		System.out.println(getModel() + " is combat ready!");
		// TODO Auto-generated method stub
		
	}

}
