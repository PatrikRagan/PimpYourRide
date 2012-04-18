package components;

public class Transmission implements IComponent{
	
	private int gears;
	private boolean isManual;
	private int price;
	public Transmission(int gears, boolean isManual,int price){
		this.setGears(gears);
		this.setManual(isManual);
		this.setPrice(price);
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
