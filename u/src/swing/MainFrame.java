package swing;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

import components.*;
import components.Interior.Seats;
import employees.Employees;
import enums.*;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nameField;
	private JPasswordField passField;
	private String loggerText = "";
	private DefaultMutableTreeNode node;
	private JTree treeComponents;
	final ComponentsLists componentsList = new ComponentsLists();
	final JTextArea logArea = new JTextArea(20, 20);
	final JComboBox componentComboBox = new JComboBox();
	final JComboBox compTypeComboBox = new JComboBox();

	public JTree getTreeComponents() {
		return treeComponents;
	}

	public void setTreeComponents(JTree treeComponents) {
		this.treeComponents = treeComponents;
	}

	public DefaultMutableTreeNode getNode() {
		return node;
	}

	public void setNode(DefaultMutableTreeNode node) {
		this.node = node;
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		setResizable(false);
		setLocation(10, 10);
		getContentPane().setLayout(new BorderLayout(0, 0));

		Employees.makeEmployees();

		JPanel bcgPanel = new JPanel();
		bcgPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().add(bcgPanel, BorderLayout.CENTER);
		bcgPanel.setLayout(null);

		JPanel leftPanel = new JPanel();
		leftPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		leftPanel.setBounds(10, 11, 210, 352);
		bcgPanel.add(leftPanel);
		leftPanel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane(logArea);
		scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED,
				null, null));
		scrollPane.setBounds(230, 276, 350, 87);
		bcgPanel.add(scrollPane);
		componentComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				componentComboBox.getSelectedItem();
			}
		});
		// bcgPanel.add(logArea);

		// scrollpane.getVerticalScrollBar().addAdjustmentListener(new
		// AdjustmentListener()
		// {
		// public void adjustmentValueChanged(AdjustmentEvent ae)
		// {
		// ae.getAdjustable().setValue(ae.getAdjustable().getMaximum());
		// }
		// });

		componentComboBox.setBounds(10, 42, 190, 20);
		leftPanel.add(componentComboBox);

		compTypeComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (compTypeComboBox.getSelectedItem().equals("ENGINE")) {
					componentComboBox.removeAllItems();
					Iterator iterator = componentsList.engineComponentMap
							.keySet().iterator();
					while (iterator.hasNext()) {
						String key = (String) iterator.next();
						componentComboBox.addItem(key);
					}
				}else if (compTypeComboBox.getSelectedItem().equals("BRAKES")) {
					componentComboBox.removeAllItems();
					Iterator iterator = componentsList.brakesComponentMap
							.keySet().iterator();
					while (iterator.hasNext()) {
						String key = (String) iterator.next();
						componentComboBox.addItem(key);
					}
				}
				addLog(compTypeComboBox.getSelectedItem().toString() + " was selected"
						+ "\n");

			}
		});
		compTypeComboBox.setModel(new DefaultComboBoxModel(new String[] {  "ENGINE" ,"BRAKES"}));
		compTypeComboBox.setBounds(10, 11, 190, 20);
		leftPanel.add(compTypeComboBox);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 73, 190, 143);
		leftPanel.add(textPane);

		// Obskuzna funkcia tlacitka INSTALL
		JButton btnInstal = new JButton("Instal");
		btnInstal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				instalComponent(new Transmission(5, false));

			}
		});

		btnInstal.setBounds(10, 289, 80, 23);
		leftPanel.add(btnInstal);

		nameField = new JTextField();
		nameField.setBounds(48, 227, 152, 20);
		leftPanel.add(nameField);
		nameField.setColumns(10);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 230, 46, 14);
		leftPanel.add(lblName);

		passField = new JPasswordField();
		passField.setBounds(48, 258, 152, 20);
		leftPanel.add(passField);

		passField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent arg0) {
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {

					instalComponent(new Transmission(5, false));
				}
			}
		});

		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(10, 261, 46, 14);
		leftPanel.add(lblPass);

		JPanel rightPanel = new JPanel();
		rightPanel
				.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		rightPanel.setBounds(590, 11, 195, 352);
		bcgPanel.add(rightPanel);
		rightPanel.setLayout(null);

		JLabel lblCarComponents = new JLabel("CAR Components");
		lblCarComponents.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCarComponents.setBounds(10, 11, 124, 14);
		rightPanel.add(lblCarComponents);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 30, 194, 322);
		rightPanel.add(scrollPane_1);

		this.node = new DefaultMutableTreeNode("Components");

		// Engine
		DefaultMutableTreeNode engine = new DefaultMutableTreeNode("Engine");
		node.add(engine);
		DefaultMutableTreeNode cubature = new DefaultMutableTreeNode("cubature");
		DefaultMutableTreeNode cylinders = new DefaultMutableTreeNode(
				"cylinders");
		DefaultMutableTreeNode turbo = new DefaultMutableTreeNode("turbo");
		DefaultMutableTreeNode fuel = new DefaultMutableTreeNode("fuel");
		engine.add(cubature);
		engine.add(cylinders);
		engine.add(turbo);
		engine.add(fuel);

		// Wheels
		DefaultMutableTreeNode wheel = new DefaultMutableTreeNode("Wheels");
		node.add(wheel);
		DefaultMutableTreeNode tire = new DefaultMutableTreeNode("tire");
		DefaultMutableTreeNode disc = new DefaultMutableTreeNode("disc");
		DefaultMutableTreeNode chasis = new DefaultMutableTreeNode("chasis");
		wheel.add(tire);
		wheel.add(disc);
		wheel.add(chasis);

		// Brakes
		DefaultMutableTreeNode brakes = new DefaultMutableTreeNode("Brakes");
		node.add(brakes);
		DefaultMutableTreeNode fdiameter = new DefaultMutableTreeNode(
				"f-diameter");
		DefaultMutableTreeNode fisDisc = new DefaultMutableTreeNode(
				"f-brake type");
		DefaultMutableTreeNode rdiameter = new DefaultMutableTreeNode(
				"r-diameter");
		DefaultMutableTreeNode risDisc = new DefaultMutableTreeNode(
				"r-brake type");
		brakes.add(fdiameter);
		brakes.add(fisDisc);
		brakes.add(rdiameter);
		brakes.add(risDisc);

		// Clutch
		DefaultMutableTreeNode clutch = new DefaultMutableTreeNode("Clutch");
		node.add(clutch);
		DefaultMutableTreeNode gears = new DefaultMutableTreeNode("gears");
		DefaultMutableTreeNode clutchType = new DefaultMutableTreeNode("type");
		clutch.add(gears);
		clutch.add(clutchType);

		// BodyKit
		DefaultMutableTreeNode body = new DefaultMutableTreeNode("Bodyshell");
		node.add(body);
		DefaultMutableTreeNode downforce = new DefaultMutableTreeNode(
				"downforce");
		DefaultMutableTreeNode carRoof = new DefaultMutableTreeNode("roof");
		body.add(downforce);
		body.add(carRoof);

		// Interior
		DefaultMutableTreeNode interior = new DefaultMutableTreeNode("Interior");
		node.add(interior);
		DefaultMutableTreeNode interiorColor = new DefaultMutableTreeNode(
				"color");
		DefaultMutableTreeNode interiorMat = new DefaultMutableTreeNode(
				"material");
		DefaultMutableTreeNode seats = new DefaultMutableTreeNode("seat type");
		DefaultMutableTreeNode seatsMat = new DefaultMutableTreeNode(
				"seat material");
		DefaultMutableTreeNode seatsHeated = new DefaultMutableTreeNode(
				"heated seat");
		DefaultMutableTreeNode seatsMassage = new DefaultMutableTreeNode(
				"massage seat");
		interior.add(interiorColor);
		interior.add(interiorMat);
		interior.add(seats);
		interior.add(seatsMat);
		interior.add(seatsHeated);
		interior.add(seatsMassage);

		// Features
		DefaultMutableTreeNode features = new DefaultMutableTreeNode("Features");
		node.add(features);

		treeComponents = new JTree(node);
		scrollPane_1.setViewportView(treeComponents);

		JPanel carPanel = new JPanel();
		carPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		carPanel.setBounds(230, 11, 350, 254);
		bcgPanel.add(carPanel);
		carPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("CAR Info");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 94, 20);
		carPanel.add(lblNewLabel);

		// compType.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent arg0) {
		// loggerText += compType.getSelectedItem().toString()+" was selected"
		// +"\n" ;
		// logArea.setText(loggerText);
		// logArea.setText(loggerText);
		//
		// }
		// });

	}

	private void instalComponent(IComponent component) {

		addLog(compTypeComboBox.getSelectedItem().toString() + " instaled type: "+componentComboBox.getSelectedItem().toString() + "\n");

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);

					// Create car
					Wheel wheels = new Wheel();
					wheels.setTire(wheels.new Tire(18, 220, TireBrands.DUNLOP,
							100));
					wheels.setDisc(wheels.new Disc(18, true, false, 100));
					Engine engine = new Engine(2000, 4, true, Fuel.DIESEL, 100);
					Brakes front = new Brakes(30, true, 100);
					Brakes rear = new Brakes(26, false, 100);
					Interior interior = new Interior(Color.LIGHT_GRAY,
							Materials.ALCANTARA, 100);
					Seats seats = interior.new Seats(TypeOfSeats.CLASSIC,
							Materials.GENUINELEATHER, false, false);
					interior.setSeats(seats);
					Transmission clutch = new Transmission(5, false);
					BodyKit body = new BodyKit(10, 30, 100);
					ArrayList<Features> features = new ArrayList<Features>();
					features.add(Features.DVD);
					features.add(Features.AUDIO);

					Car car = new Car(wheels, Chasis.NORMAL, engine, 50, front,
							rear, CarRoof.HARDTOP, interior, clutch, body,
							Color.BLACK, features);
					// End creating car

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JTextField getNameField() {
		return nameField;
	}

	public JPasswordField getPassField() {
		return passField;
	}

	public void addLog(String text) {
		this.loggerText += text;
		logArea.setText(loggerText);

	}

}
