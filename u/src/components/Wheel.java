package components;


public class Wheel implements IComponent{
	private Disc disc;
	private Tire tire;

	public void setDisc(Wheel.Disc disc) {
		this.disc = disc;
	}

	public void setTire(Wheel.Tire tire) {
		this.tire = tire;
	}

	public Disc getDisc() {
		return this.disc;
	}

	public Tire getTire() {
		return this.tire;
	}


	public class Disc implements IComponent{

		private int diameter;
		protected int price;
		// typ disku - true = elektron/false = plechovy
		private boolean isElectron;
		// haveHubCup - puklica - moze mat, len ak to nie je elektron
		private boolean haveHubCup;

		public Disc(int diameter, boolean isElectron, boolean haveHubCup,
				int price) {
			this.setDiameter(diameter);
			this.setElectron(isElectron);
			this.setHaveHubCup(haveHubCup);
		}

		public int getDiameter() {
			return diameter;
		}

		public void setDiameter(int diameter) {
			this.diameter = diameter;
		}

		public boolean isHaveHubCup() {
			return haveHubCup;
		}

		public void setHaveHubCup(boolean haveHubCup) {
			this.haveHubCup = haveHubCup;
		}

		public boolean isElectron() {
			return isElectron;
		}

		public void setElectron(boolean isElectron) {
			this.isElectron = isElectron;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
	}


	public class Tire implements IComponent{

		private int diameter;
		private int tireWidth;
		protected int price;

		public Tire(int diameter, int tireWidth, int price) {
			this.setDiameter(diameter);
			this.setTireWidth(tireWidth);
			this.price = price;
		}

		public int getDiameter() {
			return diameter;
		}

		public void setDiameter(int diameter) {
			this.diameter = diameter;
		}

		public int getTireWidth() {
			return tireWidth;
		}

		public void setTireWidth(int tireWidth) {
			this.tireWidth = tireWidth;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

	}

}
