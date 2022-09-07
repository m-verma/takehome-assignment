package com.geli.parking;

public class ParkingUnAvailableException extends Exception {

	private static final long serialVersionUID = 8816930864574959575L;

	public ParkingUnAvailableException(String message) {
		super(message);
	}
}
