package pimpYourRide;

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
}
