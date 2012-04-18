package aspects;

import pimpYourRide.Budget;

public aspect Shop {
	pointcut control(Integer old, Integer never) : call(* recaunt(..)) && args(old,never);

	void around(Integer old, Integer never) : control(old,never){
		int actual = Budget.getBudget();
		if (actual < never) {
			System.out.println("Komponenet si nemozes dovolit");
		} else {
			System.out.println("Komponent zakupeny");
			proceed(old, never);
			
		}

	}

//	after(Integer old, Integer never) : control(old,never){
//
//	}
}
