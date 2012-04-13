package Components;

import Enums.DiskBrands;
import Enums.TireBrands;

public class Wheel {
	
	private Disc disc;
	private Tire tire;
	
	public void setDisc(Wheel.Disc disc){
		this.disc = disc;
	}
	
	public void setTire(Wheel.Tire tire){
		this.tire = tire;
	}
	
	public class Disc{
		
		private int diameter;
		//typ disku - true = elektron/false = plechovy
		private boolean isElectron;
		//haveHubCup - puklica - moze mat, len ak to nie je elektron
		private boolean haveHubCup;
		private DiskBrands diskBrand;
		
		public Disc(int diameter, DiskBrands diskBrand, boolean isElectron, boolean haveHubCup){
			this.diameter = diameter;
			this.isElectron = isElectron;
			this.diskBrand = diskBrand;
			this.haveHubCup = haveHubCup;
		}
	}
	
	public class Tire{
		
		private int diameter;
		private int tireWidth;
		private TireBrands tireBrand;
		
		public Tire(int diameter, int tireWidth, TireBrands tireBrand){
			this.diameter = diameter;
			this.tireBrand = tireBrand;
			this.tireWidth = tireWidth;
		}
		
	}

}
