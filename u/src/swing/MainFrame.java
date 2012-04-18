package swing;

import javax.swing.*;

import java.awt.BorderLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.tree.DefaultMutableTreeNode;

import pimpYourRide.Budget;
import pimpYourRide.Main;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

import components.*;
import components.Wheel.Disc;
import components.Wheel.Tire;
import employees.Employees;
import enums.Features;

public class MainFrame extends JFrame {
	// public static Car car;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nameField;
	private JPasswordField passField;
	private String loggerText = "";
	private DefaultMutableTreeNode node;
	private JTree treeComponents;
	private final ComponentsLists componentsList = new ComponentsLists();
	private final JTextArea logArea = new JTextArea(20, 20);
	final JComboBox componentComboBox = new JComboBox();
	final JComboBox compTypeComboBox = new JComboBox();
	private JTextField textFieldAcceleration;
	private JTextField textFieldTopSpeed;
	private JTextField textFieldTorque;
	private JTextField textFieldPower;
	private JTextField textFieldBrakes;
	private JTextField textFieldHandling;
	private JTextField textFieldStyle;
	private JTextField budgetField;

	public JTextField getTextFieldAcceleration() {
		return textFieldAcceleration;
	}

	public JTextField getTextFieldTopSpeed() {
		return textFieldTopSpeed;
	}

	public JTextField getTextFieldTorque() {
		return textFieldTorque;
	}

	public JTextField getTextFieldPower() {
		return textFieldPower;
	}

	public JTextField getTextFieldBrakes() {
		return textFieldBrakes;
	}

	public JTextField getTextFieldHandling() {
		return textFieldHandling;
	}

	public JTextField getTextFieldStyle() {
		return textFieldStyle;
	}

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
				} else if (compTypeComboBox.getSelectedItem().equals("BRAKES")) {
					componentComboBox.removeAllItems();
					Iterator iterator = componentsList.brakesComponentMap
							.keySet().iterator();
					while (iterator.hasNext()) {
						String key = (String) iterator.next();
						componentComboBox.addItem(key);
					}
				} else if (compTypeComboBox.getSelectedItem()
						.equals("BODY_KIT")) {
					componentComboBox.removeAllItems();
					Iterator iterator = componentsList.bodyKitComponentMap
							.keySet().iterator();
					while (iterator.hasNext()) {
						String key = (String) iterator.next();
						componentComboBox.addItem(key);
					}
				} else if (compTypeComboBox.getSelectedItem().equals(
						"TRANSMISSION")) {
					componentComboBox.removeAllItems();
					Iterator iterator = componentsList.transmissionComponentMap
							.keySet().iterator();
					while (iterator.hasNext()) {
						String key = (String) iterator.next();
						componentComboBox.addItem(key);
					}
				} else if (compTypeComboBox.getSelectedItem().equals("TIRE")) {
					componentComboBox.removeAllItems();
					Iterator iterator = componentsList.tireComponentMap
							.keySet().iterator();
					while (iterator.hasNext()) {
						String key = (String) iterator.next();
						componentComboBox.addItem(key);
					}
				} else if (compTypeComboBox.getSelectedItem().equals("DISC")) {
					componentComboBox.removeAllItems();
					Iterator iterator = componentsList.discComponentMap
							.keySet().iterator();
					while (iterator.hasNext()) {
						String key = (String) iterator.next();
						componentComboBox.addItem(key);
					}
				} else if (compTypeComboBox.getSelectedItem()
						.equals("FEATURES")) {
					componentComboBox.removeAllItems();
					for (int i = 0; i < componentsList.featuresList.size(); i++)
						componentComboBox.addItem(componentsList.featuresList
								.get(i).toString());
				}
				addLog(compTypeComboBox.getSelectedItem().toString()
						+ " was selected" + "\n");

			}
		});
		compTypeComboBox.setModel(new DefaultComboBoxModel(new String[] {
				"ENGINE", "BRAKES", "BODY_KIT", "TRANSMISSION", "TIRE", "DISC",
				"FEATURES" }));
		compTypeComboBox.setBounds(10, 11, 190, 20);
		leftPanel.add(compTypeComboBox);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 73, 190, 143);
		leftPanel.add(textPane);

		// Obskuzna funkcia tlacitka INSTALL
		JButton btnInstal = new JButton("Instal");
		btnInstal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (componentComboBox.getItemCount() > 0) {
					// code here vytahuje objekt s udajmi o instalovanom
					// komponente
					Object key = componentComboBox.getSelectedItem();
					int index = componentComboBox.getSelectedIndex();
					System.out.println(">KEY>" + key);// kontrolny vypis KEY

					if (componentsList.brakesComponentMap.containsKey(key)) {
						Brakes value = componentsList.brakesComponentMap
								.get(key);
						System.out.println(">VALUE>" + value);// kontrolny vypis
																// VALUE
						instalComponent(value);
						// Main.getInstance().setFrontBrakes(value);
						// Main.getInstance().setRearBrakes(value);
					} else if (componentsList.engineComponentMap
							.containsKey(key)) {
						Engine value = componentsList.engineComponentMap
								.get(key);
						System.out.println(">VALUE>" + value);// kontrolny vypis
																// VALUE
						// Main.getInstance().setEngine(value);
						instalComponent(value);
					} else if (componentsList.bodyKitComponentMap
							.containsKey(key)) {
						BodyKit value = componentsList.bodyKitComponentMap
								.get(key);
						System.out.println(">VALUE>" + value);// kontrolny vypis
																// VALUE
						// Main.getInstance().setEngine(value);
						instalComponent(value);
					} else if (componentsList.transmissionComponentMap
							.containsKey(key)) {
						Transmission value = componentsList.transmissionComponentMap
								.get(key);
						System.out.println(">VALUE>" + value);// kontrolny vypis
																// VALUE
						// Main.getInstance().setEngine(value);
						instalComponent(value);
					} else if (componentsList.tireComponentMap.containsKey(key)) {
						Tire value = componentsList.tireComponentMap.get(key);
						System.out.println(">VALUE>" + value);// kontrolny vypis
																// VALUE
						// Main.getInstance().setEngine(value);
						instalComponent(value);
					} else if (componentsList.discComponentMap.containsKey(key)) {
						Disc value = componentsList.discComponentMap.get(key);
						System.out.println(">VALUE>" + value);// kontrolny vypis
																// VALUE
						// Main.getInstance().setEngine(value);
						instalComponent(value);
					} else {
						instalComponent(null);
					}
				}
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
					if (componentComboBox.getItemCount() > 0) {
						// code here vytahuje objekt s udajmi o instalovanom
						// komponente
						Object key = componentComboBox.getSelectedItem();
						int index = componentComboBox.getSelectedIndex();
						System.out.println("SELECTED STRING: "
								+ componentComboBox.getSelectedItem()
										.toString());
						// System.out.println(">KEY>"+key);//kontrolny vypis KEY
						ComponentsLists komponentList = new ComponentsLists();

						System.out.println("ITEM COUNT: "
								+ componentComboBox.getItemCount());
						if (komponentList.brakesComponentMap.containsKey(key)) {
							Brakes value = komponentList.brakesComponentMap
									.get(key);
							// System.out.println(">VALUE>"+value);//kontrolny
							// vypis
							// VALUE
							// Main.getInstance().setFrontBrakes(value);
							// Main.getInstance().setRearBrakes(value);
							instalComponent(value);
						} else if (komponentList.engineComponentMap
								.containsKey(key)) {
							Engine value = komponentList.engineComponentMap
									.get(key);
							// System.out.println(">VALUE>"+value);//kontrolny
							// vypis
							// VALUE
							// Main.getInstance().setEngine(value);
							instalComponent(value);
						} else if (komponentList.bodyKitComponentMap
								.containsKey(key)) {
							BodyKit value = komponentList.bodyKitComponentMap
									.get(key);
							System.out.println(">VALUE>" + value);// kontrolny
																	// vypis
																	// VALUE
							// Main.getInstance().setEngine(value);
							instalComponent(value);
						} else if (komponentList.transmissionComponentMap
								.containsKey(key)) {
							Transmission value = komponentList.transmissionComponentMap
									.get(key);
							System.out.println(">VALUE>" + value);// kontrolny
																	// vypis
																	// VALUE
							// Main.getInstance().setEngine(value);
							instalComponent(value);
						} else if (komponentList.tireComponentMap
								.containsKey(key)) {
							Tire value = komponentList.tireComponentMap
									.get(key);
							System.out.println(">VALUE>" + value);// kontrolny
																	// vypis
																	// VALUE
							// Main.getInstance().setEngine(value);
							instalComponent(value);
						} else if (komponentList.discComponentMap
								.containsKey(key)) {
							Disc value = komponentList.discComponentMap
									.get(key);
							System.out.println(">VALUE>" + value);// kontrolny
																	// vypis
																	// VALUE
							// Main.getInstance().setEngine(value);
							instalComponent(value);
						} else {
							instalComponent(null);
						}
					}
				}
			}
		});

		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(10, 261, 46, 14);
		leftPanel.add(lblPass);

		budgetField = (new JTextField());
		budgetField.setEditable(false);
		getBudgetField().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		getBudgetField().setBounds(100, 321, 86, 20);
		leftPanel.add(getBudgetField());
		getBudgetField().setColumns(10);

		JLabel lblBudgetfield = new JLabel("Budget");
		lblBudgetfield.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBudgetfield.setBounds(20, 323, 61, 14);
		leftPanel.add(lblBudgetfield);

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
		DefaultMutableTreeNode tire = new DefaultMutableTreeNode("tire <->");
		DefaultMutableTreeNode tireWidth = new DefaultMutableTreeNode(
				"tire width");
		DefaultMutableTreeNode disc = new DefaultMutableTreeNode("disc <->");
		DefaultMutableTreeNode discElectron = new DefaultMutableTreeNode(
				"disc type");
		DefaultMutableTreeNode discHubCup = new DefaultMutableTreeNode("hubCup");
		DefaultMutableTreeNode chasis = new DefaultMutableTreeNode("chasis");
		wheel.add(tire);
		wheel.add(tireWidth);
		wheel.add(disc);
		wheel.add(discElectron);
		wheel.add(discHubCup);
		wheel.add(chasis);

		// Brakes
		DefaultMutableTreeNode brakes = new DefaultMutableTreeNode("Brakes");
		node.add(brakes);
		DefaultMutableTreeNode diameter = new DefaultMutableTreeNode("diameter");
		DefaultMutableTreeNode isDisc = new DefaultMutableTreeNode("brake type");
		brakes.add(diameter);
		brakes.add(isDisc);

		// Clutch
		DefaultMutableTreeNode clutch = new DefaultMutableTreeNode("Clutch");
		node.add(clutch);
		DefaultMutableTreeNode gears = new DefaultMutableTreeNode("gears");
		DefaultMutableTreeNode clutchType = new DefaultMutableTreeNode(
				"clutch type");
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
				"i-material");
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

		JLabel lblPower = new JLabel("Power");
		lblPower.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPower.setBounds(20, 40, 50, 14);
		carPanel.add(lblPower);

		JLabel lblTorque = new JLabel("Torque");
		lblTorque.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTorque.setBounds(20, 70, 50, 14);
		carPanel.add(lblTorque);

		JLabel lblTopSpeed = new JLabel("Top Speed");
		lblTopSpeed.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTopSpeed.setBounds(20, 100, 70, 14);
		carPanel.add(lblTopSpeed);

		JLabel lblAcceleration = new JLabel("Acceleration");
		lblAcceleration.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAcceleration.setBounds(20, 130, 80, 14);
		carPanel.add(lblAcceleration);

		JLabel lblBrakes = new JLabel("Brakes");
		lblBrakes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBrakes.setBounds(20, 160, 46, 14);
		carPanel.add(lblBrakes);

		JLabel lblHandling = new JLabel("Handling");
		lblHandling.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHandling.setBounds(20, 190, 60, 14);
		carPanel.add(lblHandling);

		JLabel lblStyle = new JLabel("Style");
		lblStyle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStyle.setBounds(20, 220, 46, 14);
		carPanel.add(lblStyle);

		textFieldAcceleration = new JTextField();
		textFieldAcceleration.setBounds(110, 128, 86, 20);
		carPanel.add(textFieldAcceleration);
		textFieldAcceleration.setColumns(10);
		textFieldAcceleration.setEditable(false);

		textFieldTopSpeed = new JTextField();
		textFieldTopSpeed.setBounds(110, 98, 86, 20);
		carPanel.add(textFieldTopSpeed);
		textFieldTopSpeed.setColumns(10);
		textFieldTopSpeed.setEditable(false);

		textFieldTorque = new JTextField();
		textFieldTorque.setBounds(110, 68, 86, 20);
		carPanel.add(textFieldTorque);
		textFieldTorque.setColumns(10);
		textFieldTorque.setEditable(false);

		textFieldPower = new JTextField();
		textFieldPower.setBounds(110, 38, 86, 20);
		carPanel.add(textFieldPower);
		textFieldPower.setColumns(10);
		textFieldPower.setEditable(false);

		textFieldBrakes = new JTextField();
		textFieldBrakes.setBounds(110, 158, 86, 20);
		carPanel.add(textFieldBrakes);
		textFieldBrakes.setColumns(10);
		textFieldBrakes.setEditable(false);

		textFieldHandling = new JTextField();
		textFieldHandling.setBounds(110, 188, 86, 20);
		carPanel.add(textFieldHandling);
		textFieldHandling.setColumns(10);
		textFieldHandling.setEditable(false);

		textFieldStyle = new JTextField();
		textFieldStyle.setBounds(110, 218, 86, 20);
		carPanel.add(textFieldStyle);
		textFieldStyle.setColumns(10);
		textFieldStyle.setEditable(false);

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
		System.out.println("TRY TO INSTAL: " + component);
		Object key = componentComboBox.getSelectedItem();

		Car car = Main.getInstance();
		if (component != null) {
			if (component instanceof Engine) {
				car.setEngine((Engine) component);

			} else if (component instanceof Brakes) {
				car.setBrakes((Brakes) component);

			} else if (component instanceof BodyKit) {
				car.setBodyKit((BodyKit) component);

			} else if (component instanceof Transmission) {
				car.setTransmission((Transmission) component);

			} else if (component instanceof Wheel.Tire) {
				car.getWheels().setTire((Tire) component);
				car.setWheels(car.getWheels());

			} else if (component instanceof Wheel.Disc) {
				car.getWheels().setDisc((Disc) component);
				car.setWheels(car.getWheels());
			}
		} else {
			for (int i = 0; i < componentsList.featuresList.size(); i++) {
				if (componentsList.featuresList.get(i).toString().equals(key)) {
					ArrayList<Features> featuresList = Main.car.getList();

					if (featuresList.contains(componentsList.featuresList
							.get(i))) {
						int reply = JOptionPane.showConfirmDialog(null,
								"Component already added, delete component ?",
								null, JOptionPane.YES_NO_OPTION);
						if (reply == JOptionPane.YES_OPTION) {
							featuresList.remove(componentsList.featuresList
									.get(i));
							Main.car.setList(featuresList);
						}
					} else {
						featuresList.add(componentsList.featuresList.get(i));
						Main.car.setList(featuresList);
					}

				}
			}

		}

		// dovolil som si to dat sem
		// MK> Dobre si dal
		Budget.actualizeBudget(component);
		addLog(compTypeComboBox.getSelectedItem().toString()
				+ " instaled type: "
				+ componentComboBox.getSelectedItem().toString() + "\n");

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

	public JTextField getBudgetField() {
		return budgetField;
	}

}
