package aspects;

import swing.MainFrame;

public aspect LoggerAspect {

	/*LOGGING:	- Select from combo box {2}
				- Install new component
				- bad login
				- not Enough money
				- 
	*/		
	after (MainFrame frame): execution(* MainFrame.addLog(..)) && target(frame){
		frame.getLogArea().setText(MainFrame.loggerText);
	}
	
}
