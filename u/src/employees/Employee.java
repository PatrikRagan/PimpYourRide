package employees;

import enums.Jobs;

public class Employee {

	private final String name, surname;
	private final Jobs job;
	
	
	public Employee (String name, String surname, Jobs job){
		this.name = name;
		this.surname = surname;
		this.job = job;
	}


	public String getName() {
		return name;
	}


	public String getSurname() {
		return surname;
	}


	public Jobs getJob() {
		return job;
	}
	
	
	
	
}
