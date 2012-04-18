package pimpYourRide;

import swing.MainFrame;
import components.BodyKit;
import components.Brakes;
import components.Car;
import components.Engine;
import components.IComponent;
import components.Transmission;
import components.Wheel;
import components.Wheel.Disc;
import components.Wheel.Tire;
import components.Wheel.Tire;

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
		Budget.setBudget(Budget.getBudget() + (old / 2));
		Budget.setBudget(Budget.getBudget() - novy);
		System.out.println("budget : " + Budget.getBudget());
		
	}

	// TODO:budgets
	public static void actualizeBudget(IComponent component) {
		Car car = Main.getInstance();
		if (component instanceof Engine) {
			//car.setEngine((Engine) component);
			int novy = ((Engine) component).getPrice();
			int old = car.getEngine().getPrice();
			recaunt(old, novy);
		} else if (component instanceof Brakes) {
			//car.setBrakes((Brakes) component);
			int old = car.getBrakes().getPrice();
			int novy = ((Brakes) component).getPrice();
			recaunt(old, novy);
		} else if (component instanceof BodyKit) {
			//car.setBodyKit((BodyKit) component);
			int old = car.getBodyKit().getPrice();
			int novy = ((BodyKit) component).getPrice();
			recaunt(old, novy);
		} else if (component instanceof Transmission) {
			//car.setTransmission((Transmission) component);
			int old = car.getTransmission().getPrice();
			int novy = ((Transmission) component).getPrice();
			recaunt(old, novy);
		} else if (component instanceof Tire) {
			//car.getWheels().setTire((Tire) component);
			int old = car.getWheels().getTire().getPrice();
			int novy = ((Wheel.Tire) component).getPrice();
			recaunt(old, novy);
		} else if (component instanceof Disc) {
			//car.getWheels().setDisc((Disc) component);
			int old = car.getWheels().getDisc().getPrice();
			int novy = ((Wheel.Disc) component).getPrice();
			recaunt(old, novy);
		}
	}

}
