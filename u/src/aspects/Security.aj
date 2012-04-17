package aspects;

public aspect Security {

	pointcut installing(): execution(* swing.MainFrame.instalComponent(..));

	before (): installing(){
		
	}
	
}
