package employees;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class Employees {

	private SortedMap<Integer, String> map = new TreeMap<Integer, String>();

	public Employees() {
		addedEmployees();
	}

	public void addedEmployees() {
		map.put(1, "Alojz Veselý");// engine,clutch
		map.put(2, "Adam Moravèík");// wheel,brakes,chasis,body kit
		map.put(3, "František Èerný");// features,interior,carRoof
	}

	SortedMap<Integer, String> getMap() {
		return map;
	}

	void setMap(SortedMap<Integer, String> map) {
		this.map = map;
	}
}
