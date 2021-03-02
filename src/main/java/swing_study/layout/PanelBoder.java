package swing_study.layout;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelBoder extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelBoder() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(10, 10));
		
		JLabel lblNorth = new JLabel("North");
		lblNorth.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNorth.setOpaque(true); // jlabel은 투명 ->불투명
		lblNorth.setBackground(Color.GRAY);
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNorth, BorderLayout.NORTH);
		
		JLabel lblCenter = new JLabel("Center");
		lblCenter.setFont(new Font("굴림", Font.PLAIN, 20));
		lblCenter.setBackground(Color.GRAY);
		lblCenter.setOpaque(true);
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblCenter, BorderLayout.CENTER);
		
		JLabel lblSouth = new JLabel("South");
		lblSouth.setFont(new Font("굴림", Font.PLAIN, 20));
		lblSouth.setBackground(Color.LIGHT_GRAY);
		lblSouth.setOpaque(true);
		lblSouth.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSouth, BorderLayout.SOUTH);
		
		JLabel lblWest = new JLabel("West");
		lblWest.setFont(new Font("굴림", Font.PLAIN, 20));
		lblWest.setBackground(Color.DARK_GRAY);
		lblWest.setOpaque(true);
		lblWest.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblWest, BorderLayout.WEST);
		
		JLabel lblEast = new JLabel("East");
		lblEast.setFont(new Font("굴림", Font.PLAIN, 20));
		lblEast.setBackground(Color.WHITE);
		lblEast.setOpaque(true);
		lblEast.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblEast, BorderLayout.EAST);
	}

}
