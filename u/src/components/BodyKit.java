package components;

public class BodyKit implements IComponent{
	
	private int style;
	private int downforce;
	
	
	public BodyKit(int style, int downforce){
		this.setStyle(style);
		this.setDownforce(downforce);
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

}
