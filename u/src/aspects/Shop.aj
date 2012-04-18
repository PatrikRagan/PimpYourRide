package aspects;

import pimpYourRide.Budget;
import swing.MainFrame;

public aspect Shop {
	private MainFrame frame;
	pointcut control(Integer old, Integer never) : call(* recaunt(..)) && args(old,never);

	after(MainFrame frame): execution(MainFrame.new(..)) && target(frame){
		this.frame = frame;
		frame.getBudgetField().setText(Budget.getBudget()+"");
	}
	
	void around(Integer old, Integer never) : control(old,never){
		int actual = Budget.getBudget();
		if (actual < never) {
			System.out.println("Komponenet si nemozes dovolit");
		} else {
			System.out.println("Komponent zakupeny");
			proceed(old, never);
			frame.getBudgetField().setText(Budget.getBudget()+"");
		}

	}

}
