package aspects;

import pimpYourRide.Budget;
import pimpYourRide.Main;
import pimpYourRide.SerializeCar;
import swing.MainFrame;
import components.IComponent;

public aspect PersistenceAspect {
	long timeAmount;
	long timeLast;
	long timeEnd;
	long timeStart;
	public int calledCount = 0;
	public MainFrame frame;

	pointcut control(IComponent component) : call(* instalComponent(..)) && args(component);

	before(IComponent component) : control(component){
		System.out.println("Ukladam do suboru");
		SerializeCar sc = new SerializeCar();
		sc.serializeNow();
	}

	after(IComponent component) : execution(* instalComponent(..)) && args(component){
		timeEnd = System.currentTimeMillis() / 1000;
		timeAmount = timeEnd - timeStart;
		frame.addLog("Komponent ulozeny do suboru po "+((int)timeAmount)+" sekundach.\n");
		timeStart = timeEnd;
	}
	after(MainFrame frame): execution(MainFrame.new(..)) && target(frame){
		this.frame = frame;
	timeStart = System.currentTimeMillis()/1000;
	}

}
