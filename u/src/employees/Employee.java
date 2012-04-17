package employees;

import enums.Jobs;

public class Employee {

	private final String name, surname, nick, pass;
	private final Jobs job;
	
	
	
	public Employee (String name, String surname, Jobs job){
		this.name = name;
		this.surname = surname;
		this.job = job;
		this.nick = name.substring(0, 0)+surname.substring(0,0);
		pass = "123";
		System.out.println(nick+"\n"+pass);
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
