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
		map.put(1, "Alojz Vesel�");// engine,clutch
		map.put(2, "Adam Morav��k");// wheel,brakes,chasis,body kit
		map.put(3, "Franti�ek �ern�");// features,interior,carRoof
	}

	SortedMap<Integer, String> getMap() {
		return map;
	}

	void setMap(SortedMap<Integer, String> map) {
		this.map = map;
	}
}
