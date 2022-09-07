package com.geli.auto;

public class ConvertibleCar extends Car implements Convertible {
	
	protected boolean isRoofUp = true;

	public ConvertibleCar(String name, int numOfSeats, String productionNumber, Engine engine, CarType carType) {
		super(name, numOfSeats, productionNumber, engine, carType);
	}
	
	public ConvertibleCar(String name, int numOfSeats, String productionNumber, Engine engine, CarType carType, boolean isRoofUp) {
		super(name, numOfSeats, productionNumber, engine, carType);
		this.isRoofUp = isRoofUp;
	}

	@Override
	public void moveRoofUp() {
		if (!this.isRoofUp) {
			this.isRoofUp = true;
			System.out.println("Roof moved up");
		}
	}

	@Override
	public void moveRoofDown() {
		if (this.isRoofUp) {
			this.isRoofUp = false;
			System.out.println("Roof moved down");
		}
	}

	@Override
	public boolean isRoofUp() {
		return this.isRoofUp;
	}
}
