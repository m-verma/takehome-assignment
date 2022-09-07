package com.geli.auto;

public abstract class Car implements Vehicle{
	
	protected String name;
	protected int numOfSeats;
	protected double currentSpeed;
	protected String productionNumber; //assuming this data is 'alphanumeric'
	protected Engine engine;
	protected CarType carType;
	
	public Car(String name, int numOfSeats, String productionNumber, Engine engine, CarType carType) {
		super();
		this.name = name;
		this.numOfSeats = numOfSeats;
		this.productionNumber = productionNumber;
		this.engine = engine;
		this.carType = carType;
	}

	/**
	 * accelerate and return new speed
	 * 
	 * @param factor
	 * @return new speed after applying acceleration
	 * @throws IllegalArgumentException
	 * 
	 */
	public double accelerate(double factor) throws IllegalArgumentException {
		if (factor<-1.0 || factor>1.0)
			throw new IllegalArgumentException("acceleration factor should be b/w '-1.0 to 1.0'");
		
		//TODO: find out exact calculation that needs to be applied here
		this.currentSpeed = getEngine().getHorsePower() * factor;
		
		return this.currentSpeed;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	@Override
	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	@Override
	public String getProductionNumber() {
		return productionNumber;
	}

	public void setProductionNumber(String productionNumber) {
		this.productionNumber = productionNumber;
	}

	@Override
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", productionNumber=" + productionNumber + ", engineHorsepower=" + engine.getHorsePower() 
			+ ", carType=" + carType + "]";
	}
}
