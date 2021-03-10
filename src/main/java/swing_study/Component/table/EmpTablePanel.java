package swing_study.Component.table;

import javax.swing.SwingConstants;

import swing_study.panel.Employee;

public class EmpTablePanel extends AbstractCustomTablePanel<Employee> {

	@Override
	public Object[][] getData() {
		return null;
	}

	@Override
	public String[] getClumnNames() {
		return new String[] { "사원번호", "사원이름", "직책", "직속상사", "급여", "부서" };
	}

	@Override
	protected void setAlingAndWidth() {
		// 컬럼내용 위치정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 2,3,5);
		setTableCellAlign(SwingConstants.RIGHT, 4);
		// 컬럼별 간격 조정
		setTableCellWidth(100, 100, 80, 100, 100, 100);
	}

	@Override
	public Object[] toArray(Employee e) {
		return new Object[] { e.getEmpno(),
				e.getEmpname(), 
				String.format("%s(%d)", e.getTitle().getTname(),e.getTitle().getTno()),
				e.getManager()==null?"":e.getManager().getEmpname(),
				String.format("%,d", e.getSalary()),
				String.format("%s(%d)", e.getDept().getDeptName(),e.getDept().getDeptNo()) };
	}

}
