package aspects;

import javax.swing.JOptionPane;

import components.*;

public aspect CompatibilityAspect {
	private Car car;
	
	pointcut diameterSet(int diameter): execution(void setDiameter(int)) && args(diameter);
	
	after(Car car): execution(Car.new(..)) && target(car){
		this.car = car;
	}
	
	void around(int diameter): diameterSet(diameter) && within(Brakes){
		try{
			if (diameter > (car.getWheels().getDisc().getDiameter()*2.54)){
				JOptionPane.showMessageDialog(null, "Brake doesn't fit disc");
			}
			else
				proceed(diameter);
		}catch(NullPointerException e){
			//
		}
	}
	
	void around(int diameter): diameterSet(diameter) && within(Wheel.Disc){
		try{
			if((diameter < (car.getFrontBrakes().getDiameter()*2.54)) || (diameter < (car.getRearBrakes().getDiameter()*2.54))){
				JOptionPane.showMessageDialog(null, "Disc doesn't fit brake");
			}
			else
				proceed(diameter);
		}catch(NullPointerException e){
			//
		}
	}
	
	void around(int diameter): diameterSet(diameter) && within(Wheel.Tire){
		try{
			if(diameter < car.getWheels().getDisc().getDiameter()){
				JOptionPane.showMessageDialog(null, "Tire doesn't fit disc");
			}
			else
				proceed(diameter);
		}catch(NullPointerException e){
			//
		}
	}
	
	void around(): execution(void setElectron(boolean)){
		proceed();
	}

}
