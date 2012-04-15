package swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

//VS4E -- DO NOT REMOVE THIS LINE!
public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanelMain;
	private JPanel jPanelChoice;
	private JPanel jPanelCenter;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public MainFrame() {
		initComponents();
	}

	private void initComponents() {
		setResizable(false);
		setLayout(new GroupLayout());
		add(getJPanelMain(), new Constraints(new Leading(12, 254, 282, 282), new Bilateral(12, 12, 0)));
		add(getJPanelChoice(), new Constraints(new Trailing(12, 252, 282, 282), new Bilateral(12, 12, 0)));
		add(getJPanelCenter(), new Constraints(new Bilateral(272, 270, 0), new Bilateral(12, 12, 0)));
		setSize(900, 560);
	}

	private JPanel getJPanelCenter() {
		if (jPanelCenter == null) {
			jPanelCenter = new JPanel();
			jPanelCenter.setBorder(new LineBorder(Color.black, 1, false));
			jPanelCenter.setLayout(new GroupLayout());
		}
		return jPanelCenter;
	}

	private JPanel getJPanelChoice() {
		if (jPanelChoice == null) {
			jPanelChoice = new JPanel();
			jPanelChoice.setBorder(new LineBorder(Color.black, 1, false));
			jPanelChoice.setLayout(new GroupLayout());
		}
		return jPanelChoice;
	}

	private JPanel getJPanelMain() {
		if (jPanelMain == null) {
			jPanelMain = new JPanel();
			jPanelMain.setBorder(new LineBorder(Color.black, 1, false));
			jPanelMain.setLayout(new GroupLayout());
		}
		return jPanelMain;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainFrame frame = new MainFrame();
				frame.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
				frame.setTitle("MainFrame");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

}
