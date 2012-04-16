package swing;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.border.EtchedBorder;


public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		setResizable(false);
		setLocation(10,10);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel bcgPanel = new JPanel();
		getContentPane().add(bcgPanel, BorderLayout.CENTER);
		bcgPanel.setLayout(null);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		leftPanel.setBounds(10, 11, 210, 352);
		bcgPanel.add(leftPanel);
		leftPanel.setLayout(null);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 11, 190, 20);
		leftPanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 42, 190, 20);
		leftPanel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(10, 73, 190, 20);
		leftPanel.add(comboBox_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 104, 190, 112);
		leftPanel.add(textPane);
		
		JButton btnInstal = new JButton("Instal");
		btnInstal.setBounds(10, 289, 80, 23);
		leftPanel.add(btnInstal);
		
		textField = new JTextField();
		textField.setBounds(48, 227, 152, 20);
		leftPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 230, 46, 14);
		leftPanel.add(lblName);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(48, 258, 152, 20);
		leftPanel.add(passwordField);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(10, 261, 46, 14);
		leftPanel.add(lblPass);
		
		JPanel loggerPanel = new JPanel();
		loggerPanel.setBounds(230, 273, 350, 90);
		bcgPanel.add(loggerPanel);
		loggerPanel.setLayout(new BorderLayout(0, 0));
		
		JTextPane loggerField = new JTextPane();
		loggerPanel.add(loggerField, BorderLayout.CENTER);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		rightPanel.setBounds(590, 11, 144, 352);
		bcgPanel.add(rightPanel);
		
		JPanel carPanel = new JPanel();
		carPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		carPanel.setBounds(230, 11, 350, 254);
		bcgPanel.add(carPanel);
		
		
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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
