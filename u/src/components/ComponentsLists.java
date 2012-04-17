package components;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

import employees.Employee;
import enums.Fuel;

public class ComponentsLists {
	// deprecated diameterList
	// public ArrayList<Integer> diameterList = new ArrayList<Integer>();
	public ArrayList<String> engineList = new ArrayList<String>();
	public ArrayList<String> brakeList = new ArrayList<String>();
	public ArrayList<String> bodyKitList = new ArrayList<String>();
	public ArrayList<String> discList = new ArrayList<String>();
	public SortedMap<String, Engine> engineComponentMap = new TreeMap<String, Engine>();
	public SortedMap<String, Brakes> brakesComponentMap = new TreeMap<String, Brakes>();
	public ArrayList<Engine> engineComponentList = new ArrayList<Engine>();

	public ComponentsLists() {
		//TODO: nahodit riadne ceny;
		// TODO:prekontrolovat vsetky hodnoty listov v spojeni so vzorcami;
		// Engine List
		this.engineComponentMap.put("1100 3 0 GASOLINE",new Engine(1100, 3, false, Fuel.GASOLINE,100));
		this.engineComponentMap.put("1300 4 0 GASOLINE",new Engine(1300, 4, false, Fuel.GASOLINE,100));
		this.engineComponentMap.put("1500 4 0 GASOLINE",new Engine(1500, 4, false, Fuel.GASOLINE,100));
		this.engineComponentMap.put("1500 6 0 GASOLINE",new Engine(1500, 6, false, Fuel.GASOLINE,100));
		this.engineComponentMap.put("1700 6 0 GASOLINE",new Engine(1700, 6, false, Fuel.GASOLINE,100));
		this.engineComponentMap.put("2000 6 0 GASOLINE",new Engine(2000, 6, false, Fuel.GASOLINE,100));
		this.engineComponentMap.put("1100 3 1 GASOLINE",new Engine(1100, 3, true, Fuel.GASOLINE,100));
		this.engineComponentMap.put("1300 4 1 GASOLINE",new Engine(1300, 4, true, Fuel.GASOLINE,100));
		this.engineComponentMap.put("1500 4 1 GASOLINE",new Engine(1500, 4, true, Fuel.GASOLINE,100));
		this.engineComponentMap.put("1700 4 1 GASOLINE",new Engine(1700, 4, true, Fuel.GASOLINE,100));
		this.engineComponentMap.put("2000 4 1 GASOLINE",new Engine(2000, 4, true, Fuel.GASOLINE,100));
//		this.engineList.add("1100 3 0 GASOLINE");
//		this.engineList.add("1300 4 0 GASOLINE");
//		this.engineList.add("1500 4 0 GASOLINE");
//		this.engineList.add("1500 6 0 GASOLINE");
//		this.engineList.add("1700 6 0 GASOLINE");
////		this.engineList.add("1900 6 0 GASOLINE");
//		this.engineList.add("2000 6 0 GASOLINE");
//		this.engineList.add("1100 3 1 GASOLINE");
//		this.engineList.add("1300 4 1 GASOLINE");
//		this.engineList.add("1500 4 1 GASOLINE");
//		this.engineList.add("1500 6 1 GASOLINE");
//		this.engineList.add("1700 6 1 GASOLINE");
////		this.engineList.add("1900 6 1 GASOLINE");
//		this.engineList.add("2000 6 1 GASOLINE");
		this.engineComponentMap.put("1100 3 0 LPG",new Engine(1100, 3, false, Fuel.LPG,100));
		this.engineComponentMap.put("1300 4 0 LPG",new Engine(1300, 4, false, Fuel.LPG,100));
		this.engineComponentMap.put("1500 4 0 LPG",new Engine(1500, 4, false, Fuel.LPG,100));
		this.engineComponentMap.put("1500 6 0 LPG",new Engine(1500, 6, false, Fuel.LPG,100));
		this.engineComponentMap.put("1700 6 0 LPG",new Engine(1700, 6, false, Fuel.LPG,100));
		this.engineComponentMap.put("2000 6 0 LPG",new Engine(2000, 6, false, Fuel.LPG,100));
//		this.engineList.add("1100 3 0 LPG");
//		this.engineList.add("1300 4 0 LPG");
//		this.engineList.add("1500 4 0 LPG");
//		this.engineList.add("1500 6 0 LPG");
//		this.engineList.add("1700 6 0 LPG");
		this.engineComponentMap.put("1500 6 0 DIESEL",new Engine(1500, 6, false, Fuel.DIESEL,100));
		this.engineComponentMap.put("1500 6 1 DIESEL",new Engine(1500, 6, true, Fuel.DIESEL,100));
		this.engineComponentMap.put("1700 6 0 DIESEL",new Engine(1700, 6, false, Fuel.DIESEL,100));
		this.engineComponentMap.put("2000 6 0 DIESEL",new Engine(2000, 6, false, Fuel.DIESEL,100));
		this.engineComponentMap.put("2500 6 0 DIESEL",new Engine(2500, 6, false, Fuel.DIESEL,100));
		this.engineComponentMap.put("3000 6 0 DIESEL",new Engine(3000, 6, false, Fuel.DIESEL,100));
		this.engineComponentMap.put("4000 6 0 DIESEL",new Engine(4000, 6, false, Fuel.DIESEL,100));
		this.engineComponentMap.put("5000 6 0 DIESEL",new Engine(5000, 6, false, Fuel.DIESEL,100));
//		this.engineList.add("1500 6 0 DIESEL");
//		this.engineList.add("1500 6 1 DIESEL");
//		this.engineList.add("1700 6 1 DIESEL");
////		this.engineList.add("1900 6 1 DIESEL");
////		this.engineList.add("2000 6 0 DIESEL");
//		this.engineList.add("2000 6 1 DIESEL");
//		this.engineList.add("2500 6 1 DIESEL");
//		this.engineList.add("3000 12 1 DIESEL");
//		this.engineList.add("4000 12 1 DIESEL");
//		this.engineList.add("5000 12 1 DIESEL");
		// Brake List 28-50
		this.brakesComponentMap.put("28 0", new Brakes(28, false,100));
		this.brakesComponentMap.put("30 0", new Brakes(30, false,100));
		this.brakesComponentMap.put("35 1", new Brakes(35, true,100));
		this.brakesComponentMap.put("40 0", new Brakes(40, false,100));
		this.brakesComponentMap.put("40 1", new Brakes(40, true,100));
		this.brakesComponentMap.put("45 0", new Brakes(45, false,100));
		this.brakesComponentMap.put("50 0", new Brakes(50, false,100));
		this.brakesComponentMap.put("50 1", new Brakes(50, true,100));
//		this.brakeList.add("28 0");
//		this.brakeList.add("30 0");
//		this.brakeList.add("30 1");
//		this.brakeList.add("35 0");
//		this.brakeList.add("40 0");
//		this.brakeList.add("40 1");
//		this.brakeList.add("45 0");
//		this.brakeList.add("50 0");
//		this.brakeList.add("50 1");
		// BODY KIT
		// V pøíruèce jsem se doèetl, že doporuèená hodnota je 990-2200 mBaru.
		// //guess this is right
		this.bodyKitList.add("1 0.9");
		this.bodyKitList.add("1 1.3");
		this.bodyKitList.add("1 1.7");
		this.bodyKitList.add("1 2.1");
		this.bodyKitList.add("2 0.9");
		this.bodyKitList.add("2 1.3");
		this.bodyKitList.add("2 1.7");
		this.bodyKitList.add("2 2.1");
		this.bodyKitList.add("3 1.8");
		this.bodyKitList.add("3 2.2");
		// Disc
		this.discList.add("14 1 0");
		this.discList.add("15 1 0");
		this.discList.add("16 1 0");
		this.discList.add("17 1 0");
		this.discList.add("19 1 0");
		this.discList.add("14 0 1");
		this.discList.add("15 0 1");
		this.discList.add("16 0 1");
		this.discList.add("17 0 1");
		this.discList.add("19 0 1");
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
