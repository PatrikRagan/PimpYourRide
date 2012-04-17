package components;

public class Brakes {
	
	private int diameter;
	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public boolean isDiscBrake() {
		return isDiscBrake;
	}

	public void setDiscBrake(boolean isDiscBrake) {
		this.isDiscBrake = isDiscBrake;
	}

	private boolean isDiscBrake;
	
	public Brakes(int diameter, boolean isDiscBrake){
		this.diameter = diameter;
		this.isDiscBrake = isDiscBrake;
	}
	
	public int getEffectivity(Wheel.Tire tire){
		double discBrake;
		int effectivity;
		
		if (isDiscBrake)
			discBrake = 1.2;
		else discBrake = 1.0;
		
		effectivity = (int)(discBrake*diameter*tire.getTireWidth());
		if(effectivity > 3000)
			effectivity = 3000;
		
		return effectivity;
	}

}
