package com.geli.auto;
/**
 * @author mukesh
 *
 */
public class Engine {
	
	protected int horsePower;
	protected int milesPerGallon;
	
	public Engine(int horsePower, int milesPerGallon) {
		super();
		this.horsePower = horsePower;
		this.milesPerGallon = milesPerGallon;
	}
	
	public int getHorsePower() {
		return horsePower;
	}
	
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public int getMilesPerGallon() {
		return milesPerGallon;
	}
	
	public void setMilesPerGallon(int milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}
}