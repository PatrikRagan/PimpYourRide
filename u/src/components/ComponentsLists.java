package components;

import java.util.ArrayList;

public class ComponentsLists {
	public ArrayList<Integer> diameterList = new ArrayList<Integer>();
	public ArrayList<String> engineList = new ArrayList<String>();
	
	public ComponentsLists(){
		this.engineList.add("1100 3 0 GASOLINE");
		this.engineList.add("1300 4 0 GASOLINE");
	}
	
	public ArrayList<String> getEngineList(){
		return engineList;
	}
	
	public void addedTireDiameters() {
		ArrayList<Integer> locaList = diameterList;
		locaList.add(14);
		locaList.add(15);
		locaList.add(16);
		locaList.add(17);
		locaList.add(19);
	}

}
