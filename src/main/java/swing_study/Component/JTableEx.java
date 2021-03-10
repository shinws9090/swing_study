package swing_study.Component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import swing_study.Component.table.DeptTablePanel;
import swing_study.Component.table.EmpTablePanel;
import swing_study.Component.table.MyTablePanel;
import swing_study.Component.table.Student;
import swing_study.Component.table.TitleTablePanel;
import swing_study.panel.Department;
import swing_study.panel.Employee;
import swing_study.panel.Title;

public class JTableEx extends JFrame {

	private JPanel contentPane;
	private JTable table1;
	private List<Student> stdList = new ArrayList<Student>();
	private List<Department> deptList = new ArrayList<Department>();
	private List<Title> titleList = new ArrayList<Title>();
	private List<Employee> empList = new ArrayList<Employee>();
	
	public JTableEx() {
		stdList.add(new Student(1, "김인환", 50, 60, 60));
		stdList.add(new Student(2, "이태훈", 70, 71, 70));
		stdList.add(new Student(3, "김상건", 90, 92, 100));
		stdList.add(new Student(4, "전수린", 60, 53, 60));
		deptList.add(new Department(1,"개발",10));
		deptList.add(new Department(2,"영업",30));
		deptList.add(new Department(3,"샤발",20));
		titleList.add(new Title(1, "사장"));
		titleList.add(new Title(2, "부장"));
		titleList.add(new Title(3, "과장"));
		titleList.add(new Title(4, "대리"));
		titleList.add(new Title(5, "사원"));
		empList.add(new Employee(1, "꼬부기",  titleList.get(0),null,2000000 ,deptList.get(0)));
		empList.add(new Employee(1, "파이리",  titleList.get(1), empList.get(0),2000000 ,deptList.get(1)));
		empList.add(new Employee(1, "피카피카", titleList.get(2), empList.get(1),2000000 ,deptList.get(2)));
		empList.add(new Employee(1, "이상해씨", titleList.get(3),empList.get(2),2000000 ,deptList.get(2)));
		empList.add(new Employee(1, "지릿",   titleList.get(4), empList.get(3),2000000 ,deptList.get(2)));
		initialize();
	}

	private void initialize() {
		setTitle("JTable 예");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));

		JPanel pTable1 = new JPanel();
		pTable1.setBorder(new TitledBorder(null, "\uAE30\uBCF8\uD14C\uC774\uBE14", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		contentPane.add(pTable1);
		pTable1.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane1 = new JScrollPane();
		pTable1.add(scrollPane1, BorderLayout.CENTER);

		table1 = new JTable();
		table1.setModel(getModel());
		scrollPane1.setViewportView(table1);

		JPanel pTable2 = new JPanel();
		contentPane.add(pTable2);
		pTable2.setLayout(new BorderLayout(0, 0));
		
		//////////////////////////////////////////// list 추가
		MyTablePanel pCustomTable2 = new MyTablePanel();
		pCustomTable2.setList(stdList);
		pCustomTable2.setBorder(new TitledBorder(null, "\uCEE4\uC2A4\uD140\uD14C\uC774\uBE14", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pTable2.add(pCustomTable2, BorderLayout.CENTER);
		
		JPanel pTable3 = new JPanel();
		contentPane.add(pTable3);
		pTable3.setLayout(new BorderLayout(0, 0));
		
		DeptTablePanel pDeptTable3 = new DeptTablePanel();
		pDeptTable3.setList(deptList);
		pTable3.add(pDeptTable3, BorderLayout.CENTER);

		DeptTablePanel pTable4 = new DeptTablePanel();
		contentPane.add(pTable4);
		pTable4.setLayout(new BorderLayout(0, 0));
		
		TitleTablePanel pTitleTable4 = new TitleTablePanel();
		pTitleTable4.setList(titleList); 
		pTable4.add(pTitleTable4, BorderLayout.CENTER);
		
		JPanel pTable5 = new JPanel();
		contentPane.add(pTable5);
		pTable5.setLayout(new BorderLayout(0, 0));
		
		EmpTablePanel pEmpTable5 = new EmpTablePanel();
		pEmpTable5.setList(empList);
		pTable5.add(pEmpTable5, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
	}

	public DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getList(), getColumn());
		return model;
	}
	
	class CustomTableModel extends	DefaultTableModel{
		
		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
		
		
		
	}
	public Object[][] getList() {
		return new Object[][] { 
			{ 1, "빠바박", 10, "여자" }, 
			{ 2, "뿌부북", 11, "남자" }
			};
	}

	public String[] getColumn() {
		return new String[] { "썅썅바", "삐비빅", "메로나", "빠세이" };
	}

}
