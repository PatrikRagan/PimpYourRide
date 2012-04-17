package components;


public class Brakes implements IComponent{

	private int diameter;
	private int price;

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

	public Brakes(int diameter, boolean isDiscBrake, int price) {
		this.diameter = diameter;
		this.isDiscBrake = isDiscBrake;
		this.price = price;
	}

	public int getEffectivity(Wheel.Tire tire) {
		double discBrake;
		int effectivity;

		if (isDiscBrake)
			discBrake = 1.2;
		else
			discBrake = 1.0;

		effectivity = (int) (discBrake * diameter * tire.getTireWidth());
		if (effectivity > 3000)
			effectivity = 3000;

		return effectivity;
	}

	private int getPrice() {
		return price;
	}

	private void setPrice(int price) {
		this.price = price;
	}

}
