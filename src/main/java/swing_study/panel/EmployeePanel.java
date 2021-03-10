package swing_study.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

public class EmployeePanel extends JPanel {
	private JTextField tfNo;
	private JTextField tfName;
	private JComboBox  cmbTitle;
	private JComboBox  cmbManager;
	private JSpinner   spinSalary;
	private JComboBox  cmbDept;
	private JTextField tfPass1;
	private JTextField tfPass2;
	private JDateChooser dateChooser;

	/**
	 * Create the panel.
	 */
	public EmployeePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "\uC0AC\uC6D0\uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pRight = new JPanel();
		add(pRight);
		pRight.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel lblNo = new JLabel("사원번호");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		pRight.add(lblNo);
		
		tfNo = new JTextField();
		tfNo.setColumns(10);
		pRight.add(tfNo);
		
		JLabel lblName = new JLabel("사원명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pRight.add(lblName);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		pRight.add(tfName);
		
		JLabel lblTitle = new JLabel("직책");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		pRight.add(lblTitle);
		
		cmbTitle = new JComboBox();
		pRight.add(cmbTitle);
		
		JLabel lblManager = new JLabel("직속상사");
		lblManager.setHorizontalAlignment(SwingConstants.RIGHT);
		pRight.add(lblManager);
		
		cmbManager = new JComboBox();
		pRight.add(cmbManager);
		
		JLabel lblSalary = new JLabel("급여");
		lblSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		pRight.add(lblSalary);
		
		spinSalary = new JSpinner();
		pRight.add(spinSalary);
		
		JLabel lblDept = new JLabel("부서");
		lblDept.setHorizontalAlignment(SwingConstants.RIGHT);
		pRight.add(lblDept);
		
		cmbDept = new JComboBox();
		pRight.add(cmbDept);
		
		JLabel lblDate = new JLabel("입사일");
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		pRight.add(lblDate);
		
		dateChooser = new JDateChooser();
		pRight.add(dateChooser);
		
		JLabel lblPass1 = new JLabel("비밀번호");
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		pRight.add(lblPass1);
		
		tfPass1 = new JTextField();
		tfPass1.setColumns(10);
		pRight.add(tfPass1);
		
		JLabel lblPass2 = new JLabel("비밀번호확인");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pRight.add(lblPass2);
		
		tfPass2 = new JTextField();
		tfPass2.setColumns(10);
		pRight.add(tfPass2);
		
		JPanel panel = new JPanel();
		pRight.add(panel);
		
		JPanel panel_1 = new JPanel();
		pRight.add(panel_1);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setFont(new Font("굴림", Font.BOLD, 15));
		label_9.setForeground(new Color(255, 0, 0));
		panel_1.add(label_9);
		
		JPanel pLeft = new JPanel();
		add(pLeft, BorderLayout.WEST);
		pLeft.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel pImg = new JPanel();
		pImg.setBorder(new EmptyBorder(5, 5, 5, 5));
		pLeft.add(pImg);
		pImg.setLayout(new BorderLayout(5, 5));
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\사과.jpg"));
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		pImg.add(lblImg, BorderLayout.CENTER);
		
		JButton btnImg = new JButton("사진추가");
		pImg.add(btnImg, BorderLayout.SOUTH);
	}
	
	public void setEmployee(Employee emp) {
		tfNo.setText(emp.getEmpno()+"");;      
		tfName.setText(emp.getEmpname());;    
		cmbTitle.setSelectedItem(emp.getTitle());;  
		cmbManager.setSelectedItem(emp.getManager());;
		spinSalary.setValue(emp.getSalary());;  
		cmbDept.setSelectedItem(emp.getDept());;   
//		tfPass1;   
//		tfPass2;   
	}
//	public Title getEmployee() {
//		int empno = Integer.parseInt(tfNo.getText());        
//		String empname = tfName.getText();   
//		Title title= new Title((String)cmbTitle.getSelectedItem());      
//		Employee manager=cmbManager; 
//		int salary=spinSalary;       
//		Department dept=cmbDept;  
//		return new Employee(empno, empname, title, manager, salary, dept);
//	}
	public void clearTf() {
		tfNo.setText("");      
		tfName.setText("");  
		cmbTitle.setSelectedItem("");  
		cmbManager.setSelectedItem("");
		spinSalary.setValue("");;  
		cmbDept.setSelectedItem("");
		tfPass1.setText("");   
		tfPass2.setText("");  
		
	}
}
