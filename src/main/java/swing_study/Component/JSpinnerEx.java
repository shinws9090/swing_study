package swing_study.Component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class JSpinnerEx extends JFrame {

	private JPanel contentPane;


	public JSpinnerEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel pSpinner1 = new JPanel();
		contentPane.add(pSpinner1);
		
		JSpinner spinner1 = new JSpinner();
		spinner1.setModel(new SpinnerListModel(new String[] {"소설", "잡지", "전공서적", "취미"}));
		pSpinner1.add(spinner1);
		
		JPanel pSpinner2 = new JPanel();
		contentPane.add(pSpinner2);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setModel(new SpinnerNumberModel(1500000, 0, 4000000, 10));
		pSpinner2.add(spinner2);
		
		JPanel pSpinner3 = new JPanel();
		contentPane.add(pSpinner3);
		
		JSpinner spinner3 = new JSpinner();
		Calendar cal = Calendar.getInstance();
		Date value = cal.getTime();
		
		cal.add(Calendar.YEAR, -50);
		Date start = cal.getTime();
		
		cal.add(Calendar.YEAR, 50);
		Date end = cal.getTime();
		
		spinner3.setModel(new SpinnerDateModel(new Date(1362723061681L), null, null, Calendar.YEAR));
		pSpinner3.add(spinner3);
	}

}
