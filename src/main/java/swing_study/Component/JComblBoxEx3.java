package swing_study.Component;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.panel.Department;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import swing_study.panel.DeptPanel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JComblBoxEx3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private List<Department> deptList = new ArrayList<Department>();
	private JButton btnAdd;
	private DeptPanel pDept;
	private JComboBox<Department> cmbDept;
	private DefaultComboBoxModel<Department> model ;
	private JButton btnCk;


	public JComblBoxEx3() {
		initialize();
		deptList.add(new Department(1,"기획",8));
		deptList.add(new Department(2,"영업",18));
		deptList.add(new Department(3,"개발",28));
		model = new DefaultComboBoxModel<Department>(new Vector<Department>(deptList));
		
		cmbDept.setModel(model);
	}
	private void initialize() {
		setTitle("JComboBox 실전 에제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));
		
		pDept = new DeptPanel();
		pLeft.add(pDept, BorderLayout.CENTER);
		
		JPanel pBtn = new JPanel();
		pLeft.add(pBtn, BorderLayout.SOUTH);
		
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pBtn.add(btnAdd);
		
		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		cmbDept = new JComboBox();
		pRight.add(cmbDept);
		
		btnCk = new JButton("확인");
		btnCk.addActionListener(this);
		pRight.add(btnCk);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCk) {
			actionPerformedBtnCk(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
	}
	protected void actionPerformedBtnAdd(ActionEvent e) {
		if(deptList.contains(pDept.getDepartment())) {
			JOptionPane.showMessageDialog(null, "중복");
			return;
		}
		deptList.add(pDept.getDepartment());
		model = new DefaultComboBoxModel<Department>(new Vector<Department>(deptList));
		cmbDept.setModel(model);
		
	}
	protected void actionPerformedBtnCk(ActionEvent e) {
		Department dept = (Department) cmbDept.getSelectedItem();
		JOptionPane.showMessageDialog(null, dept);
	}
}
