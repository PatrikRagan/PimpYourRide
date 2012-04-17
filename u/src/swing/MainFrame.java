package swing;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.ScrollPane;
import java.awt.TextArea;


public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;
	private String loggerText = "";

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
		bcgPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().add(bcgPanel, BorderLayout.CENTER);
		bcgPanel.setLayout(null);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		leftPanel.setBounds(10, 11, 210, 352);
		bcgPanel.add(leftPanel);
		leftPanel.setLayout(null);
		
		final JComboBox compType = new JComboBox();
		
		 final JTextArea logArea = new JTextArea(20, 20);
		JScrollPane scrollPane = new JScrollPane(logArea);
		scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane.setBounds(230, 276, 350, 70);
		bcgPanel.add(scrollPane);
//		bcgPanel.add(logArea);
       
//       scrollpane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener()
//       {
//       public void adjustmentValueChanged(AdjustmentEvent ae)
//       {
//       ae.getAdjustable().setValue(ae.getAdjustable().getMaximum());
//       }
//       });
       
		compType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loggerText += compType.getSelectedItem().toString()+" was selected" +"\n" ;
				logArea.setText(loggerText);
				
			}
		});
		compType.setModel(new DefaultComboBoxModel(new String[] {"Strecha", "Podvozok", "Motor"}));
		compType.setBounds(10, 11, 190, 20);
		leftPanel.add(compType);
		
		
		JComboBox component = new JComboBox();
		component.setBounds(10, 42, 190, 20);
		leftPanel.add(component);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 73, 190, 143);
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
		
		
		

		
		JPanel rightPanel = new JPanel();
		rightPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		rightPanel.setBounds(590, 11, 144, 352);
		bcgPanel.add(rightPanel);
		rightPanel.setLayout(null);
		
		JLabel lblCarComponents = new JLabel("CAR Components");
		lblCarComponents.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCarComponents.setBounds(10, 11, 124, 14);
		rightPanel.add(lblCarComponents);
		
		JPanel carPanel = new JPanel();
		carPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		carPanel.setBounds(230, 11, 350, 254);
		bcgPanel.add(carPanel);
		carPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CAR Info");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 94, 20);
		carPanel.add(lblNewLabel);
		

//    	compType.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				loggerText += compType.getSelectedItem().toString()+" was selected" +"\n" ;
//				logArea.setText(loggerText);
//				logArea.setText(loggerText);
//				
//			}
//		});

		
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
