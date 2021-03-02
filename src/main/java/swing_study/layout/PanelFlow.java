package swing_study.layout;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelFlow extends JPanel {

	
	public PanelFlow() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel p1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) p1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		p1.setBorder(new TitledBorder(null, "align(Leading)", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(p1);
		
		JButton btnNewButton = new JButton("1");
		p1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		p1.add(btnNewButton_1);
		
		JPanel p2 = new JPanel();
		p2.setBorder(new TitledBorder(null, "align(Center)", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		add(p2);
		
		JButton btnNewButton_2 = new JButton("1");
		p2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("2");
		p2.add(btnNewButton_3);
		
		JPanel p3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) p3.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		p3.setBorder(new TitledBorder(null, "align(Trailing)", TitledBorder.TRAILING, TitledBorder.TOP, null, null));
		add(p3);
		
		JButton btnNewButton_5 = new JButton("1");
		p3.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("2");
		p3.add(btnNewButton_4);
	}

}
