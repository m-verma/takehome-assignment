package com.geli.parking;

public class ParkingSpot {
	private String id; //can represent spot location
	private boolean occupied;
	private Vehicle vehicle;
	private final ParkingSpotType type;

	public ParkingSpot(String id, ParkingSpotType type) {
		this.id = id;
		this.type = type;
	}

	public void parkVehicle(Vehicle vehicle) throws ParkingUnAvailableException {
		if (occupied) {
			throw new ParkingUnAvailableException("Parking spot is already occupied");
		}
		this.vehicle = vehicle;
		occupied = true;
	}

	public void removeVehicle() {
		this.vehicle = null;
		occupied = false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public ParkingSpotType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "ParkingSpot [id=" + id + ", occupied=" + occupied + ", vehicle=" + vehicle + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParkingSpot other = (ParkingSpot) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}