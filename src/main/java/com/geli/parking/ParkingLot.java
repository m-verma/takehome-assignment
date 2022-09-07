package com.geli.parking;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ParkingLot {

	Map<ParkingTicket, ParkingSpot> parkedVehicles;
	LinkedList<ParkingSpot> availableParkingSpots;
	
	public ParkingLot(LinkedList<ParkingSpot> availableParkingSpots) {
		super();
		parkedVehicles = new HashMap<>();
		this.availableParkingSpots = availableParkingSpots;
	}

	/**
	 * Parks the vehicle in the parking and returns the parking ticket
	 * @param vehicle
	 * @return ParkingTicket
	 * @throws ParkingUnAvailableException
	 */
	public ParkingTicket parkVehicle(Vehicle vehicle) throws ParkingUnAvailableException {
		if(isParkingFull())
			throw new ParkingUnAvailableException("Parking Full");
		
		ParkingSpot spot = this.availableParkingSpots.poll();
		spot.parkVehicle(vehicle);
		
		ParkingTicket parkingTicket = new ParkingTicket(vehicle);
		
		parkedVehicles.put(parkingTicket, spot);
		
 		return parkingTicket;
	}
	
	/**
	 * Removes the vehicle from the parking
	 * @param parkingTicket
	 */
	public void removeVehicle(ParkingTicket parkingTicket) {
		ParkingSpot spot = parkedVehicles.remove(parkingTicket);
		spot.removeVehicle();
		availableParkingSpots.offer(spot);
	}
	
	/**
	 * Returns 'true' if the parking is full
	 * @return true if parking full
	 */
	public boolean isParkingFull() {
		return availableParkingSpots.size()==0;
	}
	
	/**
	 * Add new parking spot in the parking lot
	 * @param spot
	 */
	public void addParkingSpot(ParkingSpot spot) {
		availableParkingSpots.offer(spot);
	}
	
	/**
	 * Returns the total number of parking spots in the parkint lot.
	 * @return total number of parking spots
	 */
	public int getTotalSpots() {
		return parkedVehicles.size() + availableParkingSpots.size();
	}
	
	/**
	 *  returns the number of available parking spots
	 *  
	 * @return number of available parking spots
	 */
	public int getNumberofAvailableSpots() {
		return availableParkingSpots.size();
	}
	
	public void printDirectory() {
		System.out.println("Parking Directory");
		parkedVehicles.values().forEach(System.out::println);
		availableParkingSpots.forEach(System.out::println);
	}
}
