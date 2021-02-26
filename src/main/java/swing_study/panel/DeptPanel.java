package swing_study.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class DeptPanel extends JPanel {
	private JTextField tfDeptno;
	private JTextField tfDeptName;
	private JTextField tfFloor;

	public DeptPanel() {

		initialize();
	}

	private void initialize() {
		setForeground(Color.BLACK);
		setBackground(new Color(255, 250, 240));
		setBorder(new TitledBorder(null, "부서정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));

		JLabel lblDeptno = new JLabel("부서번호");
		lblDeptno.setForeground(Color.BLACK);
		lblDeptno.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptno);

		tfDeptno = new JTextField();
		add(tfDeptno);
		tfDeptno.setColumns(10);

		JLabel lblDeptName = new JLabel("부서명");
		lblDeptName.setForeground(Color.BLACK);
		lblDeptName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptName);

		tfDeptName = new JTextField();
		tfDeptName.setColumns(10);
		add(tfDeptName);

		JLabel lblFloor = new JLabel("위치");
		lblFloor.setForeground(Color.BLACK);
		lblFloor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblFloor);

		tfFloor = new JTextField();
		tfFloor.setColumns(10);
		add(tfFloor);
	}

	public Department getDepartment() {
		int deptNo = Integer.parseInt(tfDeptno.getText().trim());
		String deptName = tfDeptName.getText().trim();
		int floor = Integer.parseInt(tfFloor.getText().trim());
		
		return new Department(deptNo, deptName, floor);
	}

	public void setDepartment(Department department) {
//		tfDeptno.setText(String.valueOf(department.getDeptNo()));
		tfDeptno.setText(department.getDeptNo()+"");
		tfDeptName.setText(department.getDeptName()+"");
		tfFloor.setText(department.getFloor()+"");
		
	}
	
	public void clearTf(Department department) {
//		tfDeptno.setText(String.valueOf(department.getDeptNo()));
		tfDeptno.setText("");
		tfDeptName.setText("");
		tfFloor.setText("");
		
	}
}











