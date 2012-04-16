package swing;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.border.EtchedBorder;

import components.ComponentsLists;

public class MainFrame extends JFrame {

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 560);
		setResizable(false);
		setLocation(10,10);
		getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 250, 543);
		mainPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		mainPanel.setPreferredSize(new Dimension(250, 560));
		getContentPane().add(mainPanel);
		
		JPanel votePanel = new JPanel();
		votePanel.setBounds(250, 0, 394, 402);
		votePanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		votePanel.setPreferredSize(new Dimension(400, 400));
		getContentPane().add(votePanel);
		votePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel choicePanel = new JPanel();
		choicePanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		choicePanel.setBounds(644, 0, 250, 543);
		getContentPane().add(choicePanel);
		choicePanel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 11, 230, 20);
		choicePanel.add(comboBox);
		ComponentsLists component = new ComponentsLists();
		for(int i=0 ; i<component.getEngineList().size(); i++){
			comboBox.addItem(component.getEngineList().get(i));
		}
		
		JScrollPane logScrollPane = new JScrollPane();
		logScrollPane.setBounds(250, 400, 394, 143);
		getContentPane().add(logScrollPane);
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
