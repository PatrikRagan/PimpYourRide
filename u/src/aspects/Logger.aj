package aspects;

import swing.MainFrame;

public aspect Logger {

	after (MainFrame frame): execution(* MainFrame.setLoggerText(..)) && target(frame){
	
	}
	
}
