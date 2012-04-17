package aspects;

import javax.swing.tree.DefaultMutableTreeNode;

import components.Car;

import swing.MainFrame;

public aspect UpdateAspect {
	private MainFrame frame;
	private DefaultMutableTreeNode components;
	
	after(MainFrame frame): execution(MainFrame.new(..)) && target(frame){
		this.frame = frame;
	}
	
	after(Car car): execution(Car.new(..)) && target(car){
		System.out.println(thisJoinPoint.getClass().getName());
		this.components = this.frame.getNode();
		DefaultMutableTreeNode list;
		list = components.getFirstLeaf();
		
		for(int i=0; i<components.getLeafCount(); i++){
			String string = list.getUserObject().toString();
			UpdateTree(string, list, car);
			System.out.println(string);
			list = list.getNextLeaf();
		}	
	}
	
	public void UpdateTree(String string, DefaultMutableTreeNode list, Car car){
		if(string.equals("cubature")){
			list.setUserObject(string + "......" + car.getEngine().getCubature());
		}
		else if(string.equals("cylinders")){
			list.setUserObject(string + "......" + car.getEngine().getCylinders());
		}
		else if(string.equals("turbo")){
			list.setUserObject(string + "............." + car.getEngine().isTurbo());
		}
		else if(string.equals("fuel")){
			list.setUserObject(string + "................" + car.getEngine().getFuelType());
		}
		else if(string.equals("tire")){
			list.setUserObject(string + "......");
		}
		else if(string.equals("disc")){
			list.setUserObject(string + "......");
		}
		else if(string.equals("chasis")){
			list.setUserObject(string + ".........." + car.getChasis());
		}
		else if(string.equals("f-diameter")){
			list.setUserObject(string + "........." + car.getFrontBrakes().getDiameter());
		}
		else if(string.equals("f-brake type")){
			if(car.getFrontBrakes().isDiscBrake())
				list.setUserObject(string + ".......DISC");
			else
				list.setUserObject(string + ".......DRUM");
		}
		else if(string.equals("r-diameter")){
			list.setUserObject(string + "........." + car.getRearBrakes().getDiameter());
		}
		else if(string.equals("r-brake type")){
			if(car.getRearBrakes().isDiscBrake())
				list.setUserObject(string + ".......DISC");
			else
				list.setUserObject(string + ".......DRUM");
		}
		else if(string.equals("gears")){
			list.setUserObject(string + "........." + car.getClutch().getGears());
		}
		else if(string.equals("type")){
			if(car.getClutch().isManual())
				list.setUserObject(string + "............MANUAL");
			else
				list.setUserObject(string + "............AUTO");
		}
		else if(string.equals("downforce")){
			list.setUserObject(string + "......" + car.getBodyKit().getDownforce());
		}
		else if(string.equals("roof")){
			list.setUserObject(string + "............" + car.getRoof());
		}
		else if(string.equals("color")){
			list.setUserObject(string + "........." + car.getInterior().getInteriorColor());
		}
		else if(string.equals("material")){
			list.setUserObject(string + "........." + car.getInterior().getInteriorMaterial());
		}
		else if(string.equals("seat type")){
			list.setUserObject(string + "........." + car.getInterior().getSeats().getSeats());
		}
		else if(string.equals("seat material")){
			list.setUserObject(string + "........." + car.getInterior().getSeats().getSeatsMaterial());
		}
		else if(string.equals("heated seat")){
			if(car.getInterior().getSeats().isHaveHeatedSeats())
				list.setUserObject(string + ".........YES");
			else
				list.setUserObject(string + ".........NO");
		}
		else if(string.equals("massage seat")){
			if(car.getInterior().getSeats().isHaveMassageSeats())
				list.setUserObject(string + ".........YES");
			else
				list.setUserObject(string + ".........NO");
		}
	}

}
