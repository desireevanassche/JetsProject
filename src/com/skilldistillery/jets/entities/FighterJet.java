package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {
	
	public FighterJet () { }

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price );
	}

	@Override
	public String toString() {
		return "\nFighter Jet Model: " + getModel() + " Speed: " + getSpeed() + " Range: " + getRange() + " Price " + getPrice();
	}

	@Override
	public String flyJets() {
		return "Alpha strike initiated! " + getModel() + " has launched. " +  "\nThere is enough fuel in the " + getModel() + " for approximately " + Math.round(getRange()/getSpeed()) + " hours of flight\n";
	}

	@Override
	public void readyForCombat() {
		System.out.println(getModel() + " is combat ready!");
		// TODO Auto-generated method stub
		
	}

}
