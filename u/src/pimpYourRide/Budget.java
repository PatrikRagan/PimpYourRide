package pimpYourRide;

import components.Brakes;
import components.Car;
import components.Engine;
import components.IComponent;

public class Budget {
	private static int budget;

	public Budget(Integer budget) {
		this.budget = budget;
	}

	public static int getBudget() {
		return budget;
	}

	public static void setBudget(int budget) {
		Budget.budget = budget;
	}

	public static void recaunt(Integer old, Integer novy) {
		Budget.setBudget(Budget.getBudget() + (old/4));
		Budget.setBudget(Budget.getBudget() - novy);
		System.out.println("budget : "+Budget.getBudget());
	}
//TODO:budgets
	public static void actualizeBudget(IComponent component) {
		Car car = Main.getInstance();
		if (component instanceof Engine) {
			car.setEngine((Engine) component);
			int novy = ((Engine) component).getPrice();
			int old = car.getEngine().getPrice();
			recaunt(old, novy);
		} else if (component instanceof Brakes) {
			car.setBrakes((Brakes) component);
			int old = car.getBrakes().getPrice();
			int novy = ((Brakes) component).getPrice();
			recaunt(old, novy);
		}
	}

}
