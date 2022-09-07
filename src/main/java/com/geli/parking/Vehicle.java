package com.geli.parking;

public class Vehicle {
	private String rego;
	private VehicleType type;
	
	public Vehicle(String rego, VehicleType type) {
		super();
		this.rego = rego;
		this.type = type;
	}

	public String getRego() {
		return rego;
	}

	public void setRego(String rego) {
		this.rego = rego;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle [rego=" + rego + ", type=" + type + "]";
	}
}