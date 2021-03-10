package swing_study.Component;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import swing_study.panel.Employee;
import swing_study.panel.Title;
import swing_study.panel.TitlePanel;
import swing_study.panel.EmployeePanel;

public class JTabbePane extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnConfirm;
	private JTabbedPane tabbedPane;
	private DeptPanel pDept;
	private TitlePanel pTitle;
	private EmployeePanel pEmp;


	public JTabbePane() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		pDept = new DeptPanel();
		tabbedPane.addTab("부서", null, pDept, "부서");
		
		pTitle = new TitlePanel();
		tabbedPane.addTab("직책", null, pTitle, "직책");
		
		pEmp = new EmployeePanel();
		tabbedPane.addTab("사원", null, pEmp, "사원");
		
		JPanel pBtn = new JPanel();
		contentPane.add(pBtn, BorderLayout.SOUTH);
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		pBtn.add(btnConfirm);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfirm) {
			actionPerformedBtnConfirm(e);
		}
	}
	protected void actionPerformedBtnConfirm(ActionEvent e) {
		//선택된 탭 가지고와서 , getXX()호출
		Component comp =tabbedPane.getSelectedComponent();
		Object obj=null;
		if(comp.equals(pDept)) {
			obj= pDept.getDepartment();
		}
		if(comp.equals(pTitle)) {
			obj= pTitle.getTitle();
		}
		if(comp.equals(pEmp)) {
//			obj = pDept.get();
		}
		JOptionPane.showMessageDialog(null, obj);
		
	}
}
