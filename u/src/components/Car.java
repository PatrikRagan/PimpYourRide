package components;

import java.awt.Color;
import java.util.ArrayList;

import enums.CarRoof;
import enums.Chasis;
import enums.Features;

public class Car {

	private Wheel wheels;
	private Engine engine;
	private Brakes frontBrakes;
	private Brakes rearBrakes;
	private int exhaust;
	private Chasis chasis;
	private CarRoof roof;
	private Interior interior;
	private Clutch clutch;
	private BodyKit bodyKit;
	private Color carColor;
	private ArrayList<Features> list = new ArrayList<Features>();

	public Car(Wheel wheels, Chasis chasis, Engine engine, int exhaust,
			Brakes frontBrakes, Brakes rearBrakes, CarRoof roof,
			Interior interior, Clutch clutch, BodyKit kit,
			Color color, ArrayList<Features> features) {
		this.setWheels(wheels);
		this.setEngine(engine);
		this.setFrontBrakes(frontBrakes);
		this.setRearBrakes(rearBrakes);
		this.setExhaust(exhaust);
		this.setChasis(chasis);
		this.setRoof(roof);
		this.setInterior(interior);
		this.setClutch(clutch);
		this.setBodyKit(kit);
		this.setCarColor(color);
		this.list = features;
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

	public void setExhaust(int exhaust) {
		this.exhaust = exhaust;
	}

	public int getExhaust() {
		return exhaust;
	}

	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public void setRoof(CarRoof roof) {
		this.roof = roof;
	}

	public CarRoof getRoof() {
		return roof;
	}

	public void setInterior(Interior interior) {
		this.interior = interior;
	}

	public Interior getInterior() {
		return interior;
	}

	public void setClutch(Clutch clutch) {
		this.clutch = clutch;
	}

	public Clutch getClutch() {
		return clutch;
	}

	public void setBodyKit(BodyKit bodyKit) {
		this.bodyKit = bodyKit;
	}

	public BodyKit getBodyKit() {
		return bodyKit;
	}

	public void setCarColor(Color carColor) {
		this.carColor = carColor;
	}

	public Color getCarColor() {
		return carColor;
	}

	public ArrayList<Features> getList() {
		return list;
	}

	public void setList(ArrayList<Features> list) {
		this.list = list;
	}

	public void addToList(Features feature) {
		ArrayList<Features> localList = getList();
		localList.add(feature);
	}

	public void removeFromList(Features features) {
		ArrayList<Features> localList = getList();
		localList.remove(features);
	}
	
	public int brakesEffectivity() {
		double brakeEffectivity = (1.2 * frontBrakes.getEffectivity(wheels
				.getTire()) + rearBrakes.getEffectivity(wheels.getTire())) / 2;
		brakeEffectivity = (brakeEffectivity / 3300) * 100;
		return (int) brakeEffectivity;
	}
	
	public int topSpeed(){
		int topSpeed;
		topSpeed = (int)(((Math.log(this.engine.getPower())/Math.log(2.2))-4)*100);
		topSpeed = (int)(topSpeed + (this.bodyKit.getDownforce()/2000)*topSpeed);
		topSpeed = (int)(topSpeed * (this.clutch.getGears()+12)/18);
		return topSpeed;
	}
	
	public double acceleration(){
		double acceleration;
		acceleration = 5;
		return acceleration;
	}

}
