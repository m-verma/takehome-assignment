package com.geli.auto;

public interface Vehicle {

	String getName();
	int getNumOfSeats();
	double getCurrentSpeed();
	String getProductionNumber();
	Engine getEngine(); //assuming that all the vehicles will have engines
}
