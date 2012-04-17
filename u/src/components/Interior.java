package components;
import java.awt.*;

import enums.Materials;
import enums.TypeOfSeats;

public class Interior {
	
	private Color interiorColor;
	private Materials interiorMaterial;
	private Seats seats;
	
	public Interior(Color col, Materials mat){
		this.setInteriorColor(col);
		this.setInteriorMaterial(mat);
		this.setSeats(seats);
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
