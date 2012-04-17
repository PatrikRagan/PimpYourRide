package components;

import enums.TireBrands;

public class Wheel {
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

	public class Disc {

		private int diameter;
		// typ disku - true = elektron/false = plechovy
		private boolean isElectron;
		// haveHubCup - puklica - moze mat, len ak to nie je elektron
		private boolean haveHubCup;

		public Disc(int diameter, boolean isElectron, boolean haveHubCup) {
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
	}

	public class Tire {

		private int diameter;
		private int tireWidth;
		private TireBrands tireBrand;

		public Tire(int diameter, int tireWidth, TireBrands tireBrand) {
			this.setDiameter(diameter);
			this.setTireBrand(tireBrand);
			this.setTireWidth(tireWidth);
		}

		public int getDiameter() {
			return diameter;
		}

		public void setDiameter(int diameter) {
			this.diameter = diameter;
		}

		public TireBrands getTireBrand() {
			return tireBrand;
		}

		public void setTireBrand(TireBrands tireBrand) {
			this.tireBrand = tireBrand;
		}

		public int getTireWidth() {
			return tireWidth;
		}

		public void setTireWidth(int tireWidth) {
			this.tireWidth = tireWidth;
		}

	}

}
