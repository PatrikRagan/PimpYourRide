package aspects;

import javax.swing.JOptionPane;
import swing.MainFrame;

import components.*;

public aspect CompatibilityAspect {
	private Car car;
	
	//pointcut rear(Brakes brake): execution(void Car.setRearBrakes(Brakes)) && args(brake);
	pointcut front(Brakes brake): call(void Car.setBrakes(Brakes)) && args(brake) && within(MainFrame);
	
	after(Car car): execution(Car.new(..)) && target(car){
		this.car = car;
	}
	
	before(Brakes brake): front(brake){
		try{
			if(brake.getDiameter() > car.getWheels().getDisc().getDiameter()*2.54){
				JOptionPane.showMessageDialog(null, "Brake doesn't fit disc");
				brake.setDiameter(car.getBrakes().getDiameter());
			}
		}catch(NullPointerException e){
			//
		}
	}
	
	before(Wheel.Disc disc): call(void Wheel.setDisc(..)) && args(disc) && within(MainFrame){
		try{
			if(disc.getDiameter()*2.54 < car.getBrakes().getDiameter()){
				JOptionPane.showMessageDialog(null, "Disc too small - big brakes");
				disc.setDiameter(car.getWheels().getDisc().getDiameter());
			}
		}catch(NullPointerException e){
			//
		}
	}
	
	before(Wheel.Tire tire): call(void Wheel.setTire(..)) && args(tire) && within(MainFrame){
		try{
			if(tire.getDiameter() != car.getWheels().getDisc().getDiameter()){
				JOptionPane.showMessageDialog(null, "Tire doesn't fit disc");
				tire.setDiameter(car.getWheels().getTire().getDiameter());
				tire.setTireWidth(car.getWheels().getTire().getTireWidth());
			}
		}catch(NullPointerException e){
			//
		}
	}

}
