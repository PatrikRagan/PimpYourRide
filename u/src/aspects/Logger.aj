package aspects;

import swing.MainFrame;

public aspect Logger {

	/*LOGGING:	- Select from combo box {2}
				- Install new component
				- bad login
				- not Enough money
				- 
	*/		
	after (MainFrame frame): execution(* MainFrame.setLoggerText(..)) && target(frame){
	
	}
	
}
