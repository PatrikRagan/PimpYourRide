package aspects;

import components.Brakes;
import components.Engine;
import components.IComponent;
import components.Transmission;
import components.Wheel;

import employees.Employee;
import employees.Employees;
import enums.Jobs;
import swing.MainFrame;

public aspect Security {
	/*
	 * PREMISSIONS> MECHANIK: Brakes, Engine, Transmission, Wheel 
	 * INTERIORER: Interior 
	 * BODYWORKER: BodyKit
	 */

	@SuppressWarnings("deprecation")
	void around (MainFrame frame, IComponent component): execution(* MainFrame.instalComponent(..)) && target(frame) && args(component){
		
		Employee emp = Employees.getEmployee(frame.getNameField().getText());
		if (emp != null){
			if(frame.getPassField().getText().equals(emp.getPass())) {
				if((emp.getJob().equals(Jobs.MECHANIC) && component instanceof Brakes
														|| component instanceof Engine
														|| component instanceof Transmission
														|| component instanceof Wheel)){
					System.out.println(component);
					proceed(frame, component);
				}
				
			}
		}
		
	}
	
	
}
