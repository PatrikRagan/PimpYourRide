package aspects;

import employees.Employee;
import employees.Employees;
import swing.MainFrame;

public aspect Security {

	@SuppressWarnings("deprecation")
	before(MainFrame frame): execution(* MainFrame.instalComponent(..)) && target(frame){
		
		Employee emp = Employees.getEmployee(frame.getNameField().getText());
		if (emp != null){
			if(frame.getPassField().getText().equals(emp.getPass())) {
				frame.instalAllowed();
			}
		}
		
		System.out.println(frame.getNameField().getText());
		System.out.println(frame.getPassField().getText());
	}
}


