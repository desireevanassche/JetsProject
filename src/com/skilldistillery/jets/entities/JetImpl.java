package com.skilldistillery.jets.entities;

public class JetImpl extends Jet {

	
	public JetImpl() {
		
	}

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String flyJets() {
		return  null;
	}
	@Override
	public String toString() {
		return "User Jet Model: " + getModel() + " Speed: " + getSpeed() + " Range: " + getRange()
		+ " Price: " + getPrice();
	}


}
