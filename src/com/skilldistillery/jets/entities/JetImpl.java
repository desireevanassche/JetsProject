package com.skilldistillery.jets.entities;

public class JetImpl extends Jet {

	public JetImpl(String model, double speed, int range, long price) {
	}
	

	public JetImpl() {
		super();
	}

	@Override
	public String flyJets() {
		return  null;
	}
	@Override
	public String toString() {
		return "JetImpl [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
		+ ", getPrice()=" + getPrice() + "]";
	}


}
