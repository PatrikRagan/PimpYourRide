package employees;

import java.awt.List;
import java.util.ArrayList;

import enums.Jobs;

public class Employees {

	public static final ArrayList<Employee> employees = new ArrayList<Employee>();

	
	
	public static void makeEmployees(){
		employees.add(new Employee("Alojz", "Vesely", Jobs.INTERIORER));
		employees.add(new Employee("Adam", "Moravèík", Jobs.MECHANIC));
		employees.add(new Employee("František", "Cerný", Jobs.MECHANIC));
		
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public static Employee getEmployee(String nick) {
		for (Employee emp : employees) {
			if (emp.getNick().equals(nick)) {
				return emp;
			}
		}
		return null;
	}

}
