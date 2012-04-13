package Components;

public class Car {
	
	private Wheel wheels;
	
	public Car(Wheel wheels){
		this.setWheels(wheels);
	}

	public void setWheels(Wheel wheels) {
		this.wheels = wheels;
	}

	public Wheel getWheels() {
		return wheels;
	}
	
}
