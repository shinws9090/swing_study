package swing_study.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;


public class JPanelEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnSet;
	private JButton btnGet;
	private DeptPanel pDept;
	private JPanel panel;
	private JButton btnClear;


	/**
	 * Create the frame.
	 */
	public JPanelEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pDept = new DeptPanel();
		contentPane.add(pDept, BorderLayout.CENTER);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnGet = new JButton("GET");
		btnGet.addActionListener(this);
		panel.add(btnGet);
		
		btnSet = new JButton("SET");
		btnSet.addActionListener(this);
		panel.add(btnSet);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(this);
		panel.add(btnClear);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClear) {
			actionPerformedBtnClear(e);
		}
		if (e.getSource() == btnGet) {
			actionPerformedBtnGet(e);
		}
		if (e.getSource() == btnSet) {
			actionPerformedBtnSet(e);
		}
	}
	
	protected void actionPerformedBtnSet(ActionEvent e) {
		Department dept = new Department(1,"기획",9);
		pDept.setDepartment(dept);
	}
	protected void actionPerformedBtnGet(ActionEvent e) {
		Department dept =pDept.getDepartment();
		JOptionPane.showMessageDialog(null, dept);
	}
	protected void actionPerformedBtnClear(ActionEvent e) {
		Department dept = new Department();
		pDept.clearTf();
	}
}
