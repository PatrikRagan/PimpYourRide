package employees;

import java.awt.List;
import java.util.ArrayList;

import enums.Jobs;

public class Employees {

	public static final ArrayList<Employee> employees = new ArrayList<Employee>();

	public Employees() {
		employees.add(new Employee("Alojz", "Vesel7", Jobs.INTERIORER));
		employees.add(new Employee("Adam", "Morav��k", Jobs.MECHANIC));
		employees.add(new Employee("Franti�ek", "�ern�", Jobs.MECHANIC));
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
