package components;


public class BodyKit implements IComponent{
	

	private int style;
	private int downforce;
	private int price;

	public BodyKit(int style, int downforce, int price) {
		this.setStyle(style);
		this.setDownforce(downforce);
		this.price = price;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public int getStyle() {
		return style;
	}

	public void setDownforce(int downforce) {
		this.downforce = downforce;
	}

	public int getDownforce() {
		return downforce;
	}

	private int getPrice() {
		return price;
	}

	private void setPrice(int price) {
		this.price = price;
	}

}
