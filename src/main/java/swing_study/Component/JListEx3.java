package swing_study.Component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;

public class JListEx3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnAdd;
	private DeptPanel pLeftCenter;
	private JList<Department> deptList;
	private DefaultListModel<Department> model;
	private JPanel panel;
	private JButton btnConfirm;
	private JButton btnUpdate;
	private JButton btnDelete;

	public JListEx3() {
		initialize();

		model.addElement(new Department(1, "기획", 8));
		model.addElement(new Department(2, "영업", 18));
		model.addElement(new Department(3, "개발", 28));

	}

	private void initialize() {
		setTitle("JList 응용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 20, 0));

		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));

		pLeftCenter = new DeptPanel();
		pLeft.add(pLeftCenter, BorderLayout.CENTER);

		JPanel pSouth = new JPanel();
		pLeft.add(pSouth, BorderLayout.SOUTH);

		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pSouth.add(btnAdd);

		JPanel pRight = new JPanel();
		pRight.setBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "\uBD80\uC11C\uBAA9\uB85D", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pRight);

		deptList = new JList<>();
		deptList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		model = new DefaultListModel<Department>();
		pRight.setLayout(new BorderLayout(0, 0));
		deptList.setModel(model);
		pRight.add(deptList);

		panel = new JPanel();
		pRight.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 3, 10, 0));

		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		panel.add(btnConfirm);

		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(this);
		panel.add(btnUpdate);

		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(this);
		panel.add(btnDelete);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnDelete) {
			actionPerformedBtnDelete(e);
		}
		if (e.getSource() == btnUpdate) {
			actionPerformedBtnUpdate(e);
		}
		if (e.getSource() == btnConfirm) {
			actionPerformedBtnConfirm(e);
		}
		if (e.getSource() == btnAdd) {
			if (btnAdd.getText().equals("추가"))
				actionPerformedBtnAdd(e);
			if (btnAdd.getText().equals("수정"))
				actionPerformedBtnUpBtn(e);

		}

	}

	protected void actionPerformedBtnAdd(ActionEvent e) {
		Department dept = pLeftCenter.getDepartment();
		pLeftCenter.clearTf();
		model.addElement(dept);

		JOptionPane.showMessageDialog(null, dept);
	}

	protected void actionPerformedBtnConfirm(ActionEvent e) {
//		int idx = deptList.getSelectedIndex();
//		Department selDept = model.get(idx);
//		String message1 = String.format("%d %s %d", selDept.getDeptNo(),selDept.getDeptName(),selDept.getFloor());

		Department dept = deptList.getSelectedValue();
		String message = String.format("%d %s %d", dept.getDeptNo(), dept.getDeptName(), dept.getFloor());
		JOptionPane.showMessageDialog(null, message);
	}

	protected void actionPerformedBtnUpdate(ActionEvent e) {

		Department dept = deptList.getSelectedValue();
		
		
		pLeftCenter.setDepartment(dept);
//		pLeftCenter.getTfDeptno().setText(dept.getDeptNo()+"");
//		pLeftCenter.getTfDeptName().setText(dept.getDeptName()+"");
//		pLeftCenter.getTfFloor().setText(dept.getFloor()+"");

		btnAdd.setText("수정");

	}

	private void actionPerformedBtnUpBtn(ActionEvent e) {

//		int deptNo = Integer.parseInt(pLeftCenter.getTfDeptno().getText());
//		String deptName = pLeftCenter.getTfDeptName().getText();
//		int floor = Integer.parseInt(pLeftCenter.getTfFloor().getText());

		Department dept = pLeftCenter.getDepartment();  //현타 오지게 오네
		
		int idx = deptList.getSelectedIndex();
		
		model.setElementAt(dept, idx);

		pLeftCenter.clearTf();

		btnAdd.setText("추가");
	}

	protected void actionPerformedBtnDelete(ActionEvent e) {
		int idx = deptList.getSelectedIndex();
		model.remove(idx);
	}
}
