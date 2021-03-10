package swing_study.panel;

public class Employee {
	private int empno;
	private String empname;
	private Title title;
	private Employee manager;
	private int salary;
	private Department dept;
	
	public Employee() {
	}
	public Employee(int empno) {
		this.empno = empno;
	}
	
	public Employee(int empno, String empname) {
		this.empno = empno;
		this.empname = empname;
	}
	public Employee(int empno, String empname, Title title, Employee manager, int salary, Department dept) {
		this.empno = empno;
		this.empname = empname;
		this.title = title;
		this.manager = manager;
		this.salary = salary;
		this.dept = dept;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String toString2() {
		return String.format(" %s, %s, %s, %s, %s,%s, %s,%s", empno,
				empname, title.getTno(),title.getTname(),
				manager.getEmpno(),manager.getEmpname(),salary, 
				dept);
	}
	@Override
	public String toString() {
		return String.format(" %s, %s, %s, %s, %s,%s", empno,
				empname, title.getTno(),
				manager.getEmpno(),salary, 
				dept.getDeptNo());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empno != other.empno)
			return false;
		return true;
	}
	
	

}
