import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.geli.auto.PorscheBoxster;
import com.geli.auto.Prius;


public class CarTest {

	/**
	 * THIS IS NOT A TEST. It runs the expected scenarios of the assignment.
	 * Could have done the same in main() method but chose to do it in test class
	 */
	@Test
	public void runExcepectedScenarios() {
		Prius prs = new Prius();
		PorscheBoxster bxtr = new PorscheBoxster();
		
		//lower roof of boxster
		bxtr.moveRoofDown();
		
		//start acceleration and keep increasing by 20% until one of the car reaches speed of 200
		double prsCurrentSpeed = 0;
		double bxtrCurrentSpeed = 0;
		double accelerationFactor = -1.0;
		while (prsCurrentSpeed<200 && bxtrCurrentSpeed<200) {
			prsCurrentSpeed = prs.accelerate(accelerationFactor);
			System.out.printf("Prius current speed:%.2f %n",prsCurrentSpeed);
			
			bxtrCurrentSpeed = bxtr.accelerate(accelerationFactor);
			System.out.printf("PorscheBoxster current speed:%.2f %n",bxtrCurrentSpeed);
			
			accelerationFactor += 0.4; //20% of range -1.0 to 1.0 would be 0.4, hence increasing the acceleration by 0.4
		}
	}
	
	@Test
	@DisplayName("test invalid acceleration factor must throw IllegalArgumentException")
	@Disabled("No Implementation")
	public void testInvalidAcceleartionFactor() {
		
	}
	
	@Test
	@Disabled("No Implementation")
	public void testRoofUp() {
		
	}
	
	//leaving out other test cases
}
