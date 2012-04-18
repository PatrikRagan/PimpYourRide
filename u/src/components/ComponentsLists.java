package components;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

import components.Wheel.Disc;
import components.Wheel.Tire;

import employees.Employee;
import enums.Fuel;

public class ComponentsLists {
	// deprecated diameterList
	// public ArrayList<Integer> diameterList = new ArrayList<Integer>();
	// public ArrayList<String> engineList = new ArrayList<String>();
	// public ArrayList<String> brakeList = new ArrayList<String>();
	// public ArrayList<String> bodyKitList = new ArrayList<String>();
	// public ArrayList<String> discList = new ArrayList<String>();
	public SortedMap<String, Engine> engineComponentMap = new TreeMap<String, Engine>();
	public SortedMap<String, Brakes> brakesComponentMap = new TreeMap<String, Brakes>();
	public SortedMap<String, BodyKit> bodyKitComponentMap = new TreeMap<String, BodyKit>();
	public SortedMap<String, Disc> discComponentMap = new TreeMap<String, Disc>();
	public SortedMap<String, Tire> tireComponentMap = new TreeMap<String, Tire>();
	public SortedMap<String, Transmission> transmissionComponentMap = new TreeMap<String, Transmission>();

	// public ArrayList<Engine> engineComponentList = new ArrayList<Engine>();

	public ComponentsLists() {
		// TODO: nahodit riadne ceny;
		// TODO:prekontrolovat vsetky hodnoty listov v spojeni so vzorcami;
		// Engine List
		this.engineComponentMap.put("1100 3 0 GASOLINE 100", new Engine(1100,
				3, false, Fuel.GASOLINE, 100));
		this.engineComponentMap.put("1300 4 0 GASOLINE 100", new Engine(1300,
				4, false, Fuel.GASOLINE, 100));
		this.engineComponentMap.put("1500 4 0 GASOLINE 100", new Engine(1500,
				4, false, Fuel.GASOLINE, 100));
		this.engineComponentMap.put("1500 6 0 GASOLINE 100", new Engine(1500,
				6, false, Fuel.GASOLINE, 200));
		this.engineComponentMap.put("1700 6 0 GASOLINE 100", new Engine(1700,
				6, false, Fuel.GASOLINE, 200));
		this.engineComponentMap.put("2000 6 0 GASOLINE 100", new Engine(2000,
				6, false, Fuel.GASOLINE, 200));
		this.engineComponentMap.put("1300 4 1 GASOLINE 100", new Engine(1300,
				4, true, Fuel.GASOLINE, 100));
		this.engineComponentMap.put("1500 4 1 GASOLINE 100", new Engine(1500,
				4, true, Fuel.GASOLINE, 100));
		this.engineComponentMap.put("1700 4 1 GASOLINE 100", new Engine(1700,
				4, true, Fuel.GASOLINE, 300));
		this.engineComponentMap.put("2000 4 1 GASOLINE 100", new Engine(2000,
				4, true, Fuel.GASOLINE, 500));
		// this.engineList.add("1100 3 0 GASOLINE");
		// this.engineList.add("1300 4 0 GASOLINE");
		// this.engineList.add("1500 4 0 GASOLINE");
		// this.engineList.add("1500 6 0 GASOLINE");
		// this.engineList.add("1700 6 0 GASOLINE");
		// // this.engineList.add("1900 6 0 GASOLINE");
		// this.engineList.add("2000 6 0 GASOLINE");
		// this.engineList.add("1100 3 1 GASOLINE");
		// this.engineList.add("1300 4 1 GASOLINE");
		// this.engineList.add("1500 4 1 GASOLINE");
		// this.engineList.add("1500 6 1 GASOLINE");
		// this.engineList.add("1700 6 1 GASOLINE");
		// // this.engineList.add("1900 6 1 GASOLINE");
		// this.engineList.add("2000 6 1 GASOLINE");
		this.engineComponentMap.put("1100 3 0 LPG 300", new Engine(1100, 3,
				false, Fuel.LPG, 300));
		this.engineComponentMap.put("1300 4 0 LPG 300", new Engine(1300, 4,
				false, Fuel.LPG, 300));
		this.engineComponentMap.put("1500 4 0 LPG 400", new Engine(1500, 4,
				false, Fuel.LPG, 400));
		this.engineComponentMap.put("1500 6 0 LPG 500", new Engine(1500, 6,
				false, Fuel.LPG, 500));
		this.engineComponentMap.put("1700 6 0 LPG 1000", new Engine(1700, 6,
				false, Fuel.LPG, 1000));
		this.engineComponentMap.put("2000 6 0 LPG 1000", new Engine(2000, 6,
				false, Fuel.LPG, 1000));
		// this.engineList.add("1100 3 0 LPG");
		// this.engineList.add("1300 4 0 LPG");
		// this.engineList.add("1500 4 0 LPG");
		// this.engineList.add("1500 6 0 LPG");
		// this.engineList.add("1700 6 0 LPG");
		this.engineComponentMap.put("1500 6 0 DIESEL 1000", new Engine(1500, 6,
				false, Fuel.DIESEL, 1000));
		this.engineComponentMap.put("1500 6 1 DIESEL 1000", new Engine(1500, 6,
				true, Fuel.DIESEL, 1000));
		this.engineComponentMap.put("2500 6 0 DIESEL 1000", new Engine(2500, 6,
				false, Fuel.DIESEL, 2000));
		this.engineComponentMap.put("3000 6 0 DIESEL 1000", new Engine(3000, 6,
				false, Fuel.DIESEL, 3000));
		this.engineComponentMap.put("4000 6 0 DIESEL 1000", new Engine(4000, 6,
				false, Fuel.DIESEL, 4000));
		this.engineComponentMap.put("5000 6 0 DIESEL 1000", new Engine(5000, 6,
				false, Fuel.DIESEL, 5000));
		// this.engineList.add("1500 6 0 DIESEL");
		// this.engineList.add("1500 6 1 DIESEL");
		// this.engineList.add("1700 6 1 DIESEL");
		// // this.engineList.add("1900 6 1 DIESEL");
		// // this.engineList.add("2000 6 0 DIESEL");
		// this.engineList.add("2000 6 1 DIESEL");
		// this.engineList.add("2500 6 1 DIESEL");
		// this.engineList.add("3000 12 1 DIESEL");
		// this.engineList.add("4000 12 1 DIESEL");
		// this.engineList.add("5000 12 1 DIESEL");
		// Brake List 28-50
		this.brakesComponentMap.put("28 0 100", new Brakes(28, false, 100));
		this.brakesComponentMap.put("30 0 200", new Brakes(30, false, 200));
		this.brakesComponentMap.put("35 1 300", new Brakes(35, true, 300));
		this.brakesComponentMap.put("40 0 400", new Brakes(40, false, 400));
		this.brakesComponentMap.put("40 1 500", new Brakes(40, true, 500));
		this.brakesComponentMap.put("45 0 600", new Brakes(45, false, 600));
		this.brakesComponentMap.put("50 0 700", new Brakes(50, false, 700));
		this.brakesComponentMap.put("50 1 800", new Brakes(50, true, 800));
		// this.brakeList.add("28 0");
		// this.brakeList.add("30 0");
		// this.brakeList.add("30 1");
		// this.brakeList.add("35 0");
		// this.brakeList.add("40 0");
		// this.brakeList.add("40 1");
		// this.brakeList.add("45 0");
		// this.brakeList.add("50 0");
		// this.brakeList.add("50 1");
		// BODY KIT
		// V pøíruèce jsem se doèetl, že doporuèená hodnota je 990-2200 mBaru.
		// //guess this is right
		this.bodyKitComponentMap.put("1 30 300", new BodyKit(1, 30, 300));
		this.bodyKitComponentMap.put("1 40 400", new BodyKit(1, 40, 400));
		this.bodyKitComponentMap.put("1 50 500", new BodyKit(1, 50, 500));
		this.bodyKitComponentMap.put("1 60 600", new BodyKit(1, 60, 600));
		this.bodyKitComponentMap.put("1 100 1000", new BodyKit(1, 100, 1000));
		// this.bodyKitList.add("1 0.9");
		// this.bodyKitList.add("1 1.3");
		// this.bodyKitList.add("1 1.7");
		// this.bodyKitList.add("1 2.1");
		// this.bodyKitList.add("2 0.9");
		// this.bodyKitList.add("2 1.3");
		// this.bodyKitList.add("2 1.7");
		// this.bodyKitList.add("2 2.1");
		// this.bodyKitList.add("3 1.8");
		// this.bodyKitList.add("3 2.2");
		// // Disc
		this.discComponentMap.put("15 1 0", new Wheel().new Disc(15, true,
				false, 400));
		this.discComponentMap.put("17 1 0", new Wheel().new Disc(17, true,
				false, 800));
		this.discComponentMap.put("19 1 0", new Wheel().new Disc(19, true,
				false, 1000));
		this.discComponentMap.put("15 0 0", new Wheel().new Disc(15, false,
				true, 300));
		this.discComponentMap.put("17 0 0", new Wheel().new Disc(17, false,
				true, 600));
		
		this.tireComponentMap.put("14 15 100", new Wheel().new Tire(14, 15, 100));
		this.tireComponentMap.put("14 30 100", new Wheel().new Tire(14, 30, 200));
		this.tireComponentMap.put("15 15 100", new Wheel().new Tire(15, 15, 300));
		this.tireComponentMap.put("15 30 100", new Wheel().new Tire(15, 30, 400));
		this.tireComponentMap.put("17 20 100", new Wheel().new Tire(17, 15, 500));
		this.tireComponentMap.put("17 35 100", new Wheel().new Tire(17, 30, 600));
		this.tireComponentMap.put("17 50 100", new Wheel().new Tire(17, 45, 800));
		
		this.transmissionComponentMap.put("5 1 200", new Transmission(5, true, 200));
		this.transmissionComponentMap.put("5 0 200", new Transmission(5, false, 200));
		this.transmissionComponentMap.put("6 1 300", new Transmission(6, true, 300));
		this.transmissionComponentMap.put("6 0 300", new Transmission(6, false, 300));
		this.transmissionComponentMap.put("7 1 400", new Transmission(7, true, 400));
		this.transmissionComponentMap.put("7 0 400", new Transmission(7, false, 400));
		
		// this.discList.add("14 1 0");
		// this.discList.add("15 1 0");
		// this.discList.add("16 1 0");
		// this.discList.add("17 1 0");
		// this.discList.add("19 1 0");
		// this.discList.add("14 0 1");
		// this.discList.add("15 0 1");
		// this.discList.add("16 0 1");
		// this.discList.add("17 0 1");
		// this.discList.add("19 0 1");
	}

	// public ArrayList<String> getEngineList(){
	// return engineList;
	// }
	//
	// public void addedTireDiameters() {
	// ArrayList<Integer> locaList = diameterList;
	// locaList.add(14);
	// locaList.add(15);
	// locaList.add(16);
	// locaList.add(17);
	// locaList.add(19);
	// }

}
