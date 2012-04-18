package aspects;

import javax.swing.JOptionPane;

import components.*;

public aspect CompatibilityAspect {
	private Car car;
	
	//pointcut rear(Brakes brake): execution(void Car.setRearBrakes(Brakes)) && args(brake);
	pointcut front(Brakes brake): execution(void Car.setFrontBrakes(Brakes)) && args(brake);
	
	after(Car car): execution(Car.new(..)) && target(car){
		this.car = car;
	}
	
	before(Brakes brake): front(brake){
		try{
			if(brake.getDiameter() > car.getWheels().getDisc().getDiameter()*2.54){
				JOptionPane.showMessageDialog(null, "Brake doesn't fit disc");
				brake.setDiameter(car.getFrontBrakes().getDiameter());
			}
		}catch(NullPointerException e){
			//
		}
	}
	
	before(Wheel.Disc disc): execution(void Wheel.setDisc(..)) && args(disc){
		try{
			if(disc.getDiameter()*2.54 < car.getFrontBrakes().getDiameter()){
				JOptionPane.showMessageDialog(null, "Disc too small - big brakes");
				disc.setDiameter(car.getWheels().getDisc().getDiameter());
			}
		}catch(NullPointerException e){
			//
		}
	}
	
	before(Wheel.Tire tire): execution(void Wheel.setTire(..)) && args(tire){
		try{
			if(tire.getDiameter() != car.getWheels().getDisc().getDiameter()){
				JOptionPane.showMessageDialog(null, "Tire doesn't fit disc");
				tire.setDiameter(car.getWheels().getTire().getDiameter());
			}
		}catch(NullPointerException e){
			//
		}
	}
	
	before(boolean isElectron): execution(void setElectron(boolean)) && args(isElectron){
		try{
			if(isElectron && car.getWheels().getDisc().isHaveHubCup()){
				JOptionPane.showMessageDialog(null, "Electron cannot have hubcup");
				isElectron = false;
			}
		}catch(NullPointerException e){
			//
		}
	}
	
	before(boolean haveHubCup): execution(void setHaveHubCup(boolean)) && args(haveHubCup){
		try{
			if(haveHubCup && car.getWheels().getDisc().isElectron()){
				JOptionPane.showMessageDialog(null, "Electron cannot have hubcup");
				haveHubCup = false;
			}
		}catch(NullPointerException e){
			//
		}
	}

}
