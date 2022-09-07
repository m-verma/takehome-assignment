import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import com.geli.parking.ParkingLot;
import com.geli.parking.ParkingSpot;
import com.geli.parking.ParkingSpotType;
import com.geli.parking.ParkingTicket;
import com.geli.parking.ParkingUnAvailableException;
import com.geli.parking.Vehicle;
import com.geli.parking.VehicleType;

public class ParkingLotTest {
	

	@Test
	public void runParkingScenarios() throws ParkingUnAvailableException {
		
		Vehicle v1 = new Vehicle("123456", VehicleType.CAR);
		Vehicle v2 = new Vehicle("123457", VehicleType.CAR);
		Vehicle v3 = new Vehicle("123458", VehicleType.CAR);
		Vehicle v4 = new Vehicle("123459", VehicleType.CAR);
		
		//create three spots and instantiate Parking lot with them
		LinkedList<ParkingSpot> spots = new LinkedList<>();
		spots.offer(new ParkingSpot("L1-D1", ParkingSpotType.REGULAR));
		spots.offer(new ParkingSpot("L1-D2", ParkingSpotType.ACCESSIBLE));
		spots.offer(new ParkingSpot("L1-D3", ParkingSpotType.REGULAR));
		
		ParkingLot parkingLot = new ParkingLot(spots);
		
		//park vehicles
		ParkingTicket t1 = parkingLot.parkVehicle(v1);
		ParkingTicket t2 = parkingLot.parkVehicle(v2);
		ParkingTicket t3 = parkingLot.parkVehicle(v3);
		
		try {
			//should throw ParkingUnAvailableException as only three spots are there and all of them are occupied
			ParkingTicket t4 = parkingLot.parkVehicle(v4); 
		} catch (ParkingUnAvailableException pe) {
			System.out.println("Exception: "+pe.getMessage());
			parkingLot.removeVehicle(t1);
			
			ParkingTicket t5 = parkingLot.parkVehicle(v4); //should not throw exception
		}
		
		parkingLot.printDirectory();
	}
}
