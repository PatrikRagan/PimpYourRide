package aspects;

import swing.MainFrame;

import components.BodyKit;
import components.IComponent;
import components.Interior;

import employees.Employee;
import employees.Employees;
import enums.Jobs;

public aspect Security {
	/*
	 * PREMISSIONS> MECHANIK: Brakes, Engine, Transmission, Wheel INTERIORER:
	 * Interior BODYWORKER: BodyKit
	 */

	@SuppressWarnings("deprecation")
	void around(MainFrame frame, IComponent component): execution(* MainFrame.instalComponent(..)) && target(frame) && args(component){

		Employee emp = Employees.getEmployee(frame.getNameField().getText());
		if (emp != null && component != null) {
			if (frame.getPassField().getText().equals(emp.getPass())) {
				if ((emp.getJob().equals(Jobs.INTERIORER) && component instanceof Interior)
						|| (emp.getJob().equals(Jobs.BODYWORKER) && component instanceof BodyKit)
						|| (emp.getJob().equals(Jobs.MECHANIC) && (!(component instanceof Interior) && !(component instanceof BodyKit)))) {
					System.out.println("componentA: " + component);
					System.out.println("worker: " + emp.getJob());
					proceed(frame, component);
				} else {
					frame.addLog("BAD WORKER\n");
				}
			} else {
				frame.addLog("BAD LOGIN\n");
			}
		} else if (emp != null && component == null){
			
			System.out.println("componentB: " + component);
			System.out.println("worker: " + emp.getJob());
			
			proceed(frame, component);
		} else {
			frame.addLog("Wrong name or pass\n");
		}
		
	}
}
