package aspects;

import swing.MainFrame;

public aspect Security {

	@SuppressWarnings("deprecation")
	before(MainFrame frame): execution(* MainFrame.instalComponent(..)) && target(frame){
		System.out.println(frame.getNameField().getText());
		System.out.println(frame.getPassField().getText());
	}
}