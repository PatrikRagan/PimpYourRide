package components;

public class Clutch {
	
	private int gears;
	private boolean isManual;
	
	public Clutch(int gears, boolean isManual){
		this.setGears(gears);
		this.setManual(isManual);
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public int getGears() {
		return gears;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public boolean isManual() {
		return isManual;
	}

}
