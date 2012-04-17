package components;

import java.util.ArrayList;

public class ComponentsLists {
	// deprecated diameterList
	// public ArrayList<Integer> diameterList = new ArrayList<Integer>();
	public ArrayList<String> engineList = new ArrayList<String>();
	public ArrayList<String> brakeList = new ArrayList<String>();
	public ArrayList<String> bodyKitList = new ArrayList<String>();
	public ArrayList<String> discList = new ArrayList<String>();

	public ComponentsLists() {

		// TODO:prekontrolovat vsetky hodnoty listov v spojeni so vzorcami;
		// Engine List
		this.engineList.add("1100 3 0 GASOLINE");
		this.engineList.add("1300 4 0 GASOLINE");
		this.engineList.add("1500 4 0 GASOLINE");
		this.engineList.add("1500 6 0 GASOLINE");
		this.engineList.add("1700 6 0 GASOLINE");
		this.engineList.add("1900 6 0 GASOLINE");
		this.engineList.add("2000 6 0 GASOLINE");
		this.engineList.add("1100 3 1 GASOLINE");
		this.engineList.add("1300 4 1 GASOLINE");
		this.engineList.add("1500 4 1 GASOLINE");
		this.engineList.add("1500 6 1 GASOLINE");
		this.engineList.add("1700 6 1 GASOLINE");
		this.engineList.add("1900 6 1 GASOLINE");
		this.engineList.add("2000 6 1 GASOLINE");
		this.engineList.add("1100 3 0 LPG");
		this.engineList.add("1300 4 0 LPG");
		this.engineList.add("1500 4 0 LPG");
		this.engineList.add("1500 6 0 LPG");
		this.engineList.add("1700 6 0 LPG");
		this.engineList.add("1500 6 0 DIESEL");
		this.engineList.add("1500 6 1 DIESEL");
		this.engineList.add("1700 6 1 DIESEL");
		this.engineList.add("1900 6 1 DIESEL");
		this.engineList.add("2000 6 0 DIESEL");
		this.engineList.add("2000 6 1 DIESEL");
		this.engineList.add("2500 6 1 DIESEL");
		this.engineList.add("3000 12 1 DIESEL");
		this.engineList.add("4000 12 1 DIESEL");
		this.engineList.add("5000 12 1 DIESEL");
		// Brake List  28-50
		this.brakeList.add("28 0");
		this.brakeList.add("30 0");
		this.brakeList.add("30 1");
		this.brakeList.add("35 0");
		this.brakeList.add("40 0");
		this.brakeList.add("40 1");
		this.brakeList.add("45 0");
		this.brakeList.add("50 0");
		this.brakeList.add("50 1");
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
