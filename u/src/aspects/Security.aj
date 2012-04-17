package aspects;

import employees.Employee;
import employees.Employees;
import swing.MainFrame;

public aspect Security {

	@SuppressWarnings("deprecation")
	void around (MainFrame frame): execution(* MainFrame.instalComponent(..)) && target(frame){
		
		Employee emp = Employees.getEmployee(frame.getNameField().getText());
		if (emp != null){
			if(frame.getPassField().getText().equals(emp.getPass())) {
				proceed(frame);
			}
		}
		
	}
		
}


