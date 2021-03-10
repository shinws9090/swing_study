package swing_study.Component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Font;

public class JSliderEx extends JFrame implements ChangeListener {

	private JPanel contentPane;
	private JSlider sliderRed;
	private JLabel lblCalar;
	private JSlider sliderBlue;
	private JSlider sliderGreen;


	public JSliderEx() {
		initialize();
		sliderRed.addChangeListener(this);
		sliderGreen.addChangeListener(this);
		sliderBlue.addChangeListener(this);
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pCenter = new JPanel();
		pCenter.setBorder(new EmptyBorder(0, 10, 0, 10));
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new GridLayout(0, 1, 0, 0));
		
		sliderRed = new JSlider();
		
		sliderRed.setForeground(Color.RED);
		sliderRed.setMaximum(255);
		sliderRed.setMajorTickSpacing(50);
		sliderRed.setMinorTickSpacing(10);
		sliderRed.setPaintTicks(true);
		sliderRed.setPaintLabels(true);
		pCenter.add(sliderRed);
		sliderRed.setValue(128);
		
		sliderGreen = new JSlider();
		sliderGreen.setForeground(Color.GREEN);
		sliderGreen.setPaintTicks(true);
		sliderGreen.setPaintLabels(true);
		sliderGreen.setMinorTickSpacing(10);
		sliderGreen.setMaximum(255);
		sliderGreen.setMajorTickSpacing(50);
		pCenter.add(sliderGreen);
		sliderGreen.setValue(128);
		
		sliderBlue = new JSlider();
		sliderBlue.setPaintLabels(true);
		sliderBlue.setPaintTicks(true);
		sliderBlue.setMinorTickSpacing(10);
		sliderBlue.setMaximum(255);
		sliderBlue.setMajorTickSpacing(50);
		sliderBlue.setForeground(Color.BLUE);
		pCenter.add(sliderBlue);
		sliderBlue.setValue(128);
		
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		pSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblCalar = new JLabel("새애애애애액깔");
		lblCalar.setFont(new Font("굴림", Font.PLAIN, 30));
		lblCalar.setForeground(Color.WHITE);
		lblCalar.setOpaque(true);
		pSouth.add(lblCalar);
	}

	public void stateChanged(ChangeEvent e) {
		
		
		int	red = sliderRed.getValue();
		int	green =sliderGreen.getValue();
		int	blue = sliderBlue.getValue();
		String message = String.format("Red(%d), green(%d), blue(%d)", red,green,blue);
		lblCalar.setText(message);
		lblCalar.setBackground(new Color(red,green,blue));
	}
	
}
