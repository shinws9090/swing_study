package swing_study.layout;

import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelAbsolute extends JPanel {

	
	public PanelAbsolute() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		JButton button = new JButton("1");
		button.setBounds(44, 30, 97, 41);
		add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(93, 57, 97, 41);
		add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(142, 85, 97, 41);
		add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(194, 112, 97, 41);
		add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(245, 139, 97, 41);
		add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(296, 167, 97, 41);
		add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBounds(245, 190, 97, 41);
		add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBounds(194, 212, 97, 41);
		add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setBounds(142, 235, 97, 41);
		add(button_8);
	}
}
