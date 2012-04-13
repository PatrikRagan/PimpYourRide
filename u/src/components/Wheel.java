package components;

import enums.DiskBrands;
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
		private DiskBrands diskBrand;

		public Disc(int diameter, DiskBrands diskBrand, boolean isElectron,
				boolean haveHubCup) {
			this.setDiameter(diameter);
			this.setElectron(isElectron);
			this.setDiskBrand(diskBrand);
			this.setHaveHubCup(haveHubCup);
		}

		private int getDiameter() {
			return diameter;
		}

		private void setDiameter(int diameter) {
			this.diameter = diameter;
		}

		private boolean isHaveHubCup() {
			return haveHubCup;
		}

		private void setHaveHubCup(boolean haveHubCup) {
			this.haveHubCup = haveHubCup;
		}

		private DiskBrands getDiskBrand() {
			return diskBrand;
		}

		private void setDiskBrand(DiskBrands diskBrand) {
			this.diskBrand = diskBrand;
		}

		private boolean isElectron() {
			return isElectron;
		}

		private void setElectron(boolean isElectron) {
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

		private int getDiameter() {
			return diameter;
		}

		private void setDiameter(int diameter) {
			this.diameter = diameter;
		}

		private TireBrands getTireBrand() {
			return tireBrand;
		}

		private void setTireBrand(TireBrands tireBrand) {
			this.tireBrand = tireBrand;
		}

		private int getTireWidth() {
			return tireWidth;
		}

		private void setTireWidth(int tireWidth) {
			this.tireWidth = tireWidth;
		}

	}

}
