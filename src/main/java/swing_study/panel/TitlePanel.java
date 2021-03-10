package swing_study.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class TitlePanel extends JPanel {
	private JTextField tfTitleNo;
	private JTextField tfTitleName;

	/**
	 * Create the panel.
	 */
	public TitlePanel() {

		initialize();
	}
	private void initialize() {
		setBackground(new Color(255, 255, 240));
		setBorder(new TitledBorder(new EmptyBorder(10, 10, 10, 10), "\uC9C1\uCC45\uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblTitleNo = new JLabel("직책번호");
		lblTitleNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitleNo);
		
		tfTitleNo = new JTextField();
		add(tfTitleNo);
		tfTitleNo.setColumns(10);
		
		JLabel lblTitleName = new JLabel("직책이름");
		lblTitleName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitleName);
		
		tfTitleName = new JTextField();
		add(tfTitleName);
		tfTitleName.setColumns(10);
	}
	
	public void setTitle(Title title) {
		tfTitleNo.setText(title.getTno()+"");
		tfTitleName.setText(title.getTname());
		
	}
	public Title getTitle() {
		 int no = Integer.parseInt(tfTitleNo.getText());
		 String name =tfTitleName.getText();
		return new Title(no, name);
	}
	public void clearTf() {
		tfTitleNo.setText("");
		tfTitleName.setText("");
		
	}
}
