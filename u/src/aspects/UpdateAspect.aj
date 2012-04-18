package aspects;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import pimpYourRide.Main;

import components.Car;
import components.IComponent;
import swing.MainFrame;

public aspect UpdateAspect {
	private MainFrame frame;
	private DefaultMutableTreeNode components;
	
	after(MainFrame frame): execution(MainFrame.new(..)) && target(frame){
		this.frame = frame;
	}
	
	after(Car car): (execution(Car.new(..)) && target(car)){
		frame.getTextFieldPower().setText(Integer.toString(car.getEngine().getPower()));
		frame.getTextFieldTorque().setText(Integer.toString(car.getEngine().getTorque()));
		frame.getTextFieldTopSpeed().setText(Integer.toString(car.topSpeed()));
		frame.getTextFieldAcceleration().setText(Double.toString(car.acceleration()).substring(0, 4));
		frame.getTextFieldBrakes().setText(Integer.toString(car.brakesEffectivity()));
		frame.getTextFieldHandling().setText(Integer.toString(car.handling()));
		frame.getTextFieldStyle().setText(Integer.toString(car.style()));
	}
	
	
	after(Car car): (execution(Car.new(..)) && target(car)) || (execution(void Car.*(..)) && target(car)){
		//Updating Car properties (Car Info panel)
		
		this.components = this.frame.getNode();
		
		DefaultMutableTreeNode list;
		list = components.getFirstLeaf();
		
		int loops = components.getLeafCount();
		for(int i=0; i<loops; i++){
			try{
				String string = list.getUserObject().toString();
				UpdateTree(string, list, car);
//				System.out.println(string);
				list = list.getNextLeaf();
			}catch(Exception e){
//				System.out.println(e.getMessage());
			}
		}
		DefaultTreeModel model = (DefaultTreeModel)frame.getTreeComponents().getModel();
		model.reload();
	}
	
	after(): execution(void MainFrame.instalComponent(..)) || execution(void Car.setList(..)){		
		frame.getTextFieldPower().setText(Integer.toString(Main.car.getEngine().getPower()));
		frame.getTextFieldTorque().setText(Integer.toString(Main.car.getEngine().getTorque()));
		frame.getTextFieldTopSpeed().setText(Integer.toString(Main.car.topSpeed()));
		frame.getTextFieldAcceleration().setText(Double.toString(Main.car.acceleration()).substring(0, 4));
		frame.getTextFieldBrakes().setText(Integer.toString(Main.car.brakesEffectivity()));
		frame.getTextFieldHandling().setText(Integer.toString(Main.car.handling()));
		frame.getTextFieldStyle().setText(Integer.toString(Main.car.style()));
	}
	
//	after(Car car): execution(void Car.*(..)) && target(car){
//		
//	}
	
	public void UpdateTree(String string, DefaultMutableTreeNode list, Car car){
		if(string.contains("cubature")){
			list.setUserObject("cubature......" + car.getEngine().getCubature());
		}
		else if(string.contains("cylinders")){
			list.setUserObject("cylinders......" + car.getEngine().getCylinders());
		}
		else if(string.contains("turbo")){
			if(car.getEngine().isTurbo())
				list.setUserObject("turbo.............YES");
			else
				list.setUserObject("turbo.............NO");
		}
		else if(string.contains("fuel")){
			list.setUserObject("fuel................" + car.getEngine().getFuelType());
		}
		else if(string.contains("tire <->")){
			list.setUserObject("tire <->........." + car.getWheels().getTire().getDiameter());
		}
		else if(string.contains("tire width")){
			list.setUserObject("tire width......" + car.getWheels().getTire().getTireWidth());
		}
		else if(string.contains("disc <->")){
			list.setUserObject("disc <->......." + car.getWheels().getDisc().getDiameter());
		}
		else if(string.contains("disc type")){
			if(car.getWheels().getDisc().isElectron())
				list.setUserObject("disc type......ALLOY");
			else
				list.setUserObject("disc type......METAL");
		}
		else if(string.contains("hubCup")){
			if(car.getWheels().getDisc().isHaveHubCup())
				list.setUserObject("hubCup.......YES");
			else
				list.setUserObject("hubCup.......NO");
		}
		else if(string.contains("chasis")){
			list.setUserObject("chasis.........." + car.getChasis());
		}
		else if(string.contains("diameter")){
			list.setUserObject("diameter........." + car.getBrakes().getDiameter());
		}
		else if(string.contains("brake type")){
			if(car.getBrakes().isDiscBrake())
				list.setUserObject("brake type.......DISC");
			else
				list.setUserObject("brake type.......DRUM");
		}
		else if(string.contains("gears")){
			list.setUserObject("gears............." + car.getTransmission().getGears());
		}
		else if(string.contains("clutch type")){
			if(car.getTransmission().isManual())
				list.setUserObject("clutch type.....MANUAL");
			else
				list.setUserObject("clutch type.....AUTO");
		}
		else if(string.contains("downforce")){
			list.setUserObject("downforce...." + car.getBodyKit().getDownforce());
		}
		else if(string.contains("roof")){
			list.setUserObject("roof.............." + car.getRoof());
		}
		else if(string.contains("color")){
			list.setUserObject("color......................." + car.getInterior().getInteriorColor());
		}
		else if(string.contains("i-material")){
			list.setUserObject("i-material..............." + car.getInterior().getInteriorMaterial());
		}
		else if(string.contains("seat type")){
			list.setUserObject("seat type................" + car.getInterior().getSeats().getSeats());
		}
		else if(string.contains("seat material")){
			list.setUserObject("seat material........" + car.getInterior().getSeats().getSeatsMaterial());
		}
		else if(string.contains("heated seat")){
			if(car.getInterior().getSeats().isHaveHeatedSeats())
				list.setUserObject("heated seat...........YES");
			else
				list.setUserObject("heated seat...........NO");
		}
		else if(string.contains("massage seat")){
			if(car.getInterior().getSeats().isHaveMassageSeats())
				list.setUserObject("massage seat......YES");
			else
				list.setUserObject("massage seat......NO");
		}
		else UpdateFeatures(car, list);
	}
	
	private void UpdateFeatures(Car car, DefaultMutableTreeNode list){
		if (list.getParent().toString().equals("Features")){
			DefaultMutableTreeNode add = (DefaultMutableTreeNode)list.getParent();
			add.removeAllChildren();
			for(int i=0; i<car.getList().size(); i++){
				add.add(new DefaultMutableTreeNode(car.getList().get(i)));
			}
		}
		else if(list.toString().equals("Features")){
			for(int i=0; i<car.getList().size(); i++){
				list.add(new DefaultMutableTreeNode(car.getList().get(i)));
			}
		}
	}

}
