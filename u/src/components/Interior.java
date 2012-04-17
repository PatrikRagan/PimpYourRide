package components;
import java.awt.*;

import enums.Materials;
import enums.TypeOfSeats;

public class Interior {
	
	private Color interiorColor;
	private Materials interiorMaterial;
	private Seats seats;
	private boolean haveRadio;
	private boolean haveGPS;
	private boolean haveDVD;
	private boolean haveCruise;
	private boolean haveAudioSystem;
	
	public Interior(Color col, Materials mat, boolean radio, boolean GPS, boolean DVD, boolean cruise, boolean audio){
		this.setInteriorColor(col);
		this.setInteriorMaterial(mat);
		this.setSeats(seats);
		this.setHaveRadio(radio);
		this.setHaveGPS(GPS);
		this.setHaveDVD(DVD);
		this.setHaveCruise(cruise);
		this.setHaveAudioSystem(audio);
	}
	
	public void setInteriorColor(Color interiorColor) {
		this.interiorColor = interiorColor;
	}

	public Color getInteriorColor() {
		return interiorColor;
	}

	public void setInteriorMaterial(Materials interiorMaterial) {
		this.interiorMaterial = interiorMaterial;
	}

	public Materials getInteriorMaterial() {
		return interiorMaterial;
	}

	public void setSeats(Seats seats) {
		this.seats = seats;
	}

	public Seats getSeats() {
		return seats;
	}

	public void setHaveRadio(boolean haveRadio) {
		this.haveRadio = haveRadio;
	}

	public boolean isHaveRadio() {
		return haveRadio;
	}

	public void setHaveGPS(boolean haveGPS) {
		this.haveGPS = haveGPS;
	}

	public boolean isHaveGPS() {
		return haveGPS;
	}

	public void setHaveDVD(boolean haveDVD) {
		this.haveDVD = haveDVD;
	}

	public boolean isHaveDVD() {
		return haveDVD;
	}

	public void setHaveCruise(boolean haveCruise) {
		this.haveCruise = haveCruise;
	}

	public boolean isHaveCruise() {
		return haveCruise;
	}

	public void setHaveAudioSystem(boolean haveAudioSystem) {
		this.haveAudioSystem = haveAudioSystem;
	}

	public boolean isHaveAudioSystem() {
		return haveAudioSystem;
	}

	public class Seats{
		private TypeOfSeats seats;
		private boolean haveHeatedSeats;
		private boolean haveMassageSeats;
		private Materials seatsMaterial;
		
		public Seats(TypeOfSeats seats, Materials seatMat, boolean heated, boolean massage){
			this.setSeats(seats);
			this.setSeatsMaterial(seatMat);
			this.setHaveHeatedSeats(heated);
			this.setHaveMassageSeats(massage);
		}

		public void setSeats(TypeOfSeats seats) {
			this.seats = seats;
		}

		public TypeOfSeats getSeats() {
			return seats;
		}

		public void setHaveHeatedSeats(boolean haveHeatedSeats) {
			this.haveHeatedSeats = haveHeatedSeats;
		}

		public boolean isHaveHeatedSeats() {
			return haveHeatedSeats;
		}

		public void setHaveMassageSeats(boolean haveMassageSeats) {
			this.haveMassageSeats = haveMassageSeats;
		}

		public boolean isHaveMassageSeats() {
			return haveMassageSeats;
		}

		public void setSeatsMaterial(Materials seatsMaterial) {
			this.seatsMaterial = seatsMaterial;
		}

		public Materials getSeatsMaterial() {
			return seatsMaterial;
		}
	}

}
