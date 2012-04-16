package components;

import java.util.ArrayList;

import components.Wheel.Disc;

import enums.DiskBrands;
import enums.TireBrands;

public class Wheel {
	private ArrayList<Integer> diameterList = new ArrayList<Integer>();
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

	public ArrayList<Integer> getDiameterList() {
		return diameterList;
	}

	public void setDiameterList(ArrayList<Integer> diameterList) {
		this.diameterList = diameterList;
	}

	public void addedTireDiameters() {
		ArrayList<Integer> locaList = getDiameterList();
		locaList.add(14);
		locaList.add(15);
		locaList.add(16);
		locaList.add(17);
		locaList.add(19);
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

		public DiskBrands getDiskBrand() {
			return diskBrand;
		}

		public void setDiskBrand(DiskBrands diskBrand) {
			this.diskBrand = diskBrand;
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
