package com.geli.auto;

public class Prius extends Car {

	//Any Prius specific attributes and behavior can be added to this class, like 'trunk with translucent glass', 'smart console', etc
	
	public Prius() {
		super("Prius", 5, "PR123", new Engine(121,53), CarType.SEDAN);
	}
}
