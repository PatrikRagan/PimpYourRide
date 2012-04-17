package employees;

import java.util.SortedMap;
import java.util.TreeMap;

import enums.Jobs;

public class Employees {

	public SortedMap<Integer, Employee> map = new TreeMap<Integer, Employee>();

	public Employees() {
		addedEmployees();
	}

	public void addedEmployees() {
		map.put(1, new Employee("Alojz", "Vesel7", Jobs.INERIORER));// engine,clutch
		map.put(2, new Employee("Adam", "Morav��k", Jobs.MECHANIC));// wheel,brakes,chasis,body kit
		map.put(3, new Employee("Franti�ek" , "�ern�", Jobs.MECHANIC));// features,interior,carRoof
	}

	SortedMap<Integer, Employee> getMap() {
		return map;
	}

	void setMap(SortedMap<Integer, Employee> map) {
		this.map = map;
	}
}
