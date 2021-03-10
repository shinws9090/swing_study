package swing_study.Component.table;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import swing_study.panel.Department;

import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

public class DeptTablePanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public DeptTablePanel() {

		initialize();
	}

	private void initialize() {
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(getModel());
		scrollPane.setViewportView(table);
	}

	public DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getData(), getClumnNames());
		return model;
	}

	public Object[][] getData() {
		return new Object[][] { { null, null, null } };
	}

	public String[] getClumnNames() {
		return new String[] { "부서번호", "부서명", "위치" };
	}

	public void setList(List<Department> deptList) {
		Object[][] datas = new Object[deptList.size()][];
		for(int i = 0; i<datas.length;i++) {
			datas[i] = toArray(deptList.get(i));
		}
		CustomTableModel model = new CustomTableModel(datas, getClumnNames());
		table.setModel(model);
		// 컬럼내용 위치정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1,2);
		// 컬럼별 간격 조정
		setTableCellWidth(100,500,80);
	}

	private void setTableCellWidth(int ...width) {
		TableColumnModel tcm = table.getColumnModel();
		
		for (int i = 0; i < width.length; i++) {
			tcm.getColumn(i).setPreferredWidth(width[i]);
		}
	}
	
	private void setTableCellAlign(int align, int...idx) {
		TableColumnModel tcm = table.getColumnModel();

		//기본 렌더러
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align); // 가운대 정렬

		for (int i = 0; i < idx.length; i++) {
			tcm.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}

	private Object[] toArray(Department department) {
		Object[] arr = new Object[] {
				department.getDeptNo(),
				department.getDeptName(),
				department.getFloor()
		};
		
		return arr;
	}

	private class CustomTableModel extends DefaultTableModel {

		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	}
}
