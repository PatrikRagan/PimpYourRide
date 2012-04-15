package components;

import enums.Fuel;

public class Engine {
	
	private int cubature;
	private int cylinders;
	private boolean isTurbo;
	private Fuel fuelType;
	
	public Engine(int cubature, int cylinders, boolean isTurbo, Fuel fuelType){
		this.cubature = cubature;
		this.cylinders = cylinders;
		this.isTurbo = isTurbo;
		this.fuelType = fuelType;
	}
	
	//funkcia na výpoèet výkonu motora
	public int getPower(){
		double turbo;
		double fuel;
		
		if(isTurbo)
			turbo = 1.1;
		else turbo = 1;
		
		switch (fuelType){
			case LPG: fuel = 0.8;
					break;
			case GASOLINE: fuel = 1.0;
					break;
			default: fuel = 1.1;
					break;
		}
			
		int power = (int)(Math.log10((cubature/100))*cylinders*turbo*fuel*30);
		return power;
	}
	
	//funkcia na výpocet toviveho momentu
	public int getTorque(){
		double fuel;
		int torque;
		
		switch (fuelType){
		case LPG: fuel = 1.1;
				break;
		case GASOLINE: fuel = 1.2;
				break;
		default: fuel = 1.4;
				break;
	}
		
		torque = (int)(getPower()*fuel);
		return torque;
	}

}
