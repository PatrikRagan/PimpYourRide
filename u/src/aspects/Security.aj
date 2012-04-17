package aspects;

import employees.Employee;
import employees.Employees;
import swing.MainFrame;

public aspect Security {
	/*
	 * PREMISSIONS> MECHANIK: Brakes, Engine, Transmission, Wheel INTERIORER:
	 * Interior BODYWORKER: BodyKit
	 */

	@SuppressWarnings("deprecation")
	void around (MainFrame frame): execution(* MainFrame.instalComponent(..)) && target(frame){
		
		Employee emp = Employees.getEmployee(frame.getNameField().getText());
		if (emp != null){
			if(frame.getPassField().getText().equals(emp.getPass())) {
				if(true){
					proceed(frame);	
				}
				
			}
		}
		
	}
}
