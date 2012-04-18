package components;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;

import enums.CarRoof;
import enums.Chasis;
import enums.Features;

public class Car implements Serializable{

	private Wheel wheels;
	private Engine engine;
	private Brakes brakes;
	private int exhaust;
	private Chasis chasis;
	private CarRoof roof;
	private Interior interior;
	private Transmission clutch;
	private BodyKit bodyKit;
	private Color carColor;
	private int budget;
	//TODO bude budget v konstruktore? #MK> ano bude :)
	private ArrayList<Features> list = new ArrayList<Features>();

	public Car(Wheel wheels, Chasis chasis, Engine engine, int exhaust,
			Brakes brakes, CarRoof roof, Interior interior, Transmission clutch, 
			BodyKit kit, Color color, ArrayList<Features> features) {
		this.setWheels(wheels);
		this.setEngine(engine);
		this.setBrakes(brakes);
		this.setExhaust(exhaust);
		this.setChasis(chasis);
		this.setRoof(roof);
		this.setInterior(interior);
		this.setTransmission(clutch);
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

	public void setTransmission(Transmission clutch) {
		this.clutch = clutch;
	}

	public Transmission getTransmission() {
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
		double brakeEffectivity = (1.2 * brakes.getEffectivity(wheels
				.getTire()) + brakes.getEffectivity(wheels.getTire())) / 2;
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
		double accel;
		double nitro = 1;
		double gear = 1;
		
		if(list.contains(Features.NITRO1))
			nitro = 1.1;
		if(list.contains(Features.NITRO2))
			nitro = 1.25;
		if(list.contains(Features.NITRO3))
			nitro = 1.4;
		if(this.getTransmission().isManual())
			gear = 1.2;
		accel = (double)(1500/(double)topSpeed()/(double)nitro*(double)gear*
				((double)4+(double)this.getTransmission().getGears())/(double)8);
		return (double)accel;
	}
	
	public int handling(){
		int handling = (int)(brakesEffectivity()*acceleration()/(topSpeed()/100));
		if(handling>100)
			handling = 100;
		return handling;
	}

	public void setBrakes(Brakes brakes) {
		this.brakes = brakes;
	}

	public Brakes getBrakes() {
		return brakes;
	}

}
