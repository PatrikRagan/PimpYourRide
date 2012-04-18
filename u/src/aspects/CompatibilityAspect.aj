package aspects;

import javax.swing.JOptionPane;
import swing.MainFrame;

import components.*;
import components.Wheel.Disc;
import components.Wheel.Tire;

public aspect CompatibilityAspect {
	declare precedence: Security, CompatibilityAspect;
	
	private Car car;
	private Brakes oldbrake;
	private Disc olddisc;
	private Tire oldtire;
	
	after(Car car): execution(Car.new(..)) && target(car){
		this.car = car;
	}
	
	void around(Brakes brake): call(void Car.setBrakes(Brakes)) && args(brake) && within(MainFrame){
		oldbrake = car.getBrakes();
		try{
			if(brake.getDiameter() > (car.getWheels().getDisc().getDiameter()*2.54)){
				JOptionPane.showMessageDialog(null, "Brake doesn't fit disc");
				proceed(oldbrake);
			}else proceed(brake);
		}catch(NullPointerException e){
			//
		}
	}
	
	void around(Wheel.Disc disc): call(void Wheel.setDisc(..)) && args(disc) && within(MainFrame){
		olddisc = car.getWheels().getDisc();
		try{
			if((disc.getDiameter()*2.54) < car.getBrakes().getDiameter()){
				JOptionPane.showMessageDialog(null, "Disc too small - big brakes");
				proceed(olddisc);
			}else proceed(disc);
		}catch(NullPointerException e){
			//
		}
	}
	
	void around(Wheel.Tire tire): call(void Wheel.setTire(..)) && args(tire) && within(MainFrame){
		oldtire = car.getWheels().getTire();
		try{
			if(tire.getDiameter() != car.getWheels().getDisc().getDiameter()){
				JOptionPane.showMessageDialog(null, "Tire doesn't fit disc");
				proceed(oldtire);
			}else proceed(tire);
		}catch(NullPointerException e){
			//
		}
	}
	
	void around(MainFrame frame, IComponent component): execution(* MainFrame.instalComponent(..)) && target(frame) && args(component){
		if (component instanceof Engine && car.getEngine().equals((Engine)component)) {
			frame.addLog("This Engine already installed!\n");
			return;
		} else if (component instanceof Brakes && car.getBrakes().equals((Brakes)component)) {
			frame.addLog("This Brakes already installed!\n");
			return;
		} else if (component instanceof BodyKit && car.getBodyKit().equals((BodyKit)component)) {
			frame.addLog("This Body Kit already installed!\n");
			return;
		} else if (component instanceof Transmission && car.getTransmission().equals((Transmission)component)) {
			frame.addLog("This Transmission already installed!\n");
			return;
		} else if (component instanceof Wheel.Tire && car.getWheels().getTire().equals((Tire)component)) {
			frame.addLog("This Tire already installed!\n");
			return;
		} else if (component instanceof Wheel.Disc && car.getWheels().getDisc().equals((Disc)component)) {
			frame.addLog("This Disc already installed!\n");
			return;
		} else proceed(frame, component);
	}

}
