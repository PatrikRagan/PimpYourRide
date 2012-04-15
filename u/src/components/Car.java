package components;

public class Car {
	
	private Wheel wheels;
	private Engine engine;
	private Brakes frontBrakes;
	private Brakes rearBrakes;
	
	public Car(Wheel wheels, Engine engine, Brakes frontBrakes, Brakes rearBrakes){
		this.setWheels(wheels);
		this.setEngine(engine);
		this.setFrontBrakes(frontBrakes);
		this.setRearBrakes(rearBrakes);
	}

	public void setWheels(Wheel wheels) {
		this.wheels = wheels;
	}

	public Wheel getWheels() {
		return wheels;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setFrontBrakes(Brakes frontBrakes) {
		this.frontBrakes = frontBrakes;
	}

	public Brakes getFrontBrakes() {
		return frontBrakes;
	}

	public void setRearBrakes(Brakes rearBrakes) {
		this.rearBrakes = rearBrakes;
	}

	public Brakes getRearBrakes() {
		return rearBrakes;
	}
	
	public int brakesEffectivity(){
		double brakeEffectivity = (1.2*frontBrakes.getEffectivity(wheels.getTire())+rearBrakes.getEffectivity(wheels.getTire()))/2;
		brakeEffectivity = (brakeEffectivity/3300)*100;
		return (int)brakeEffectivity;
	}
	
}
