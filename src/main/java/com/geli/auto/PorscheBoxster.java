package com.geli.auto;

public class PorscheBoxster extends ConvertibleCar {

	//Any Boxster specific attributes and behavior can be added to this class, like 'trunk with translucent glass', 'smart console', etc
	
	public PorscheBoxster() {
		super("PorscheBoxster", 2, "PR123", new Engine(256,32), CarType.SEDAN);
	}
}
