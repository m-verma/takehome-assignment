package com.geli.parking;

import java.util.Date;

public class ParkingTicket {

	private String ticketNumber;
	private Vehicle vehicle;
	private Date issuedAt;
	
	public ParkingTicket(Vehicle vehicle) {
		super();
		this.ticketNumber=generateTicketNumber();
		this.vehicle = vehicle;
		issuedAt=new Date();
	}

	private String generateTicketNumber() {
		return "PT"+new Date()+Math.random()*10;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public Date getIssuedAt() {
		return issuedAt;
	}

	@Override
	public String toString() {
		return "ParkingTicket [ticketNumber=" + ticketNumber + ", vehicle=" + vehicle + ", issuedAt=" + issuedAt + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ticketNumber == null) ? 0 : ticketNumber.hashCode());
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
		ParkingTicket other = (ParkingTicket) obj;
		if (ticketNumber == null) {
			if (other.ticketNumber != null)
				return false;
		} else if (!ticketNumber.equals(other.ticketNumber))
			return false;
		return true;
	}
}
