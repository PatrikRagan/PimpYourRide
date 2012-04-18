package aspects;

import pimpYourRide.Main;
import pimpYourRide.SerializeCar;
import components.Car;
import components.IComponent;

public aspect PersistenceAspect {
	long timeAmount;
	long timeLast;
	long timeEnd;
	public int calledCount = 0;

	// TODO: pocitadlo volani a cas ktory uplinie medzi volaniami
	// TODO: pred volanim metodz zmeny Car zavola serializeNow
	pointcut control(IComponent component) : call(* instalComponent(..)) && args(component);

	before(IComponent component) : control(component){
		System.out.println("Ukladam do suboru");
		SerializeCar sc = new SerializeCar();
		sc.serializeNow();
	}

	after(IComponent component) : execution(* instalComponent(..)) && args(component){
		timeEnd = System.currentTimeMillis() / 1000;
		timeAmount = timeEnd - Main.startTimeOfProgram ;
		System.out.println("Komponent ulozeny do suboru po "+((int)timeAmount)+" sekundach od posledneho.");
		Main.startTimeOfProgram = timeEnd;
	}
	// after(Car car): (execution(Car.new(..)) && target(car)) ||
	// (execution(void Car.*(..)) && target(car)){
}
