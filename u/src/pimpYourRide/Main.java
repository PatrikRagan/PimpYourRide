package pimpYourRide;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import components.*;
import components.Interior.Seats;
import enums.*;

import swing.MainFrame;

public class Main {
	public static Car car;
	public static long startTimeOfProgram;

	public static Car getInstance() {
		return car;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Budget(4000);
					MainFrame frame = new MainFrame();
					frame.setVisible(true);

					// Create car
					Wheel wheels = new Wheel();
					wheels.setTire(wheels.new Tire(18, 22, 100));
					wheels.setDisc(wheels.new Disc(18, true, false, 100));
					Engine engine = new Engine(2000, 4, true, Fuel.DIESEL, 100);
					Brakes brakes = new Brakes(30, true, 100);
					Interior interior = new Interior(Color.LIGHT_GRAY,
							Materials.ALCANTARA, 100);
					Seats seats = interior.new Seats(TypeOfSeats.CLASSIC,
							Materials.GENUINELEATHER, false, false);
					interior.setSeats(seats);
					Transmission clutch = new Transmission(5, false, 300);
					BodyKit body = new BodyKit(10, 30, 100);
					ArrayList<Features> features = new ArrayList<Features>();
					features.add(Features.DVD);
					features.add(Features.AUDIO);

					car = new Car(wheels, Chasis.NORMAL, engine, 50, brakes,
							CarRoof.HARDTOP, interior, clutch, body,
							Color.BLACK, features);
					// End creating car

					startTimeOfProgram = System.currentTimeMillis() / 1000;
					System.out.println(Budget.getBudget());
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		});
	}
}
