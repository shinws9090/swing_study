package swing_study.Component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JButtonEx extends JFrame implements ActionListener {
	private String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;

	private JPanel contentPane;
	private JToggleButton tglbtn01;

	public JButtonEx() {
		initialize();
	}

	private void initialize() {
		setTitle("JButton && JToggleButton");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 711, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BoxLayout(pLeft, BoxLayout.Y_AXIS));

		MyButton btn01 = new MyButton();
		btn01.setText("call~~!");

		pLeft.add(btn01);

		tglbtn01 = new JToggleButton("토글버튼");
		tglbtn01.addActionListener(this);
		tglbtn01.setIcon(new ImageIcon(imgPath+"1.gif"));
		tglbtn01.setSelectedIcon(new ImageIcon(imgPath+"3.gif"));
		pLeft.add(tglbtn01);

		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 1, 0));

		JPanel pTop = new JPanel();
		pTop.setBorder(
				new TitledBorder(null, "\uC218\uD3C9\uC815\uB82C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pRight.add(pTop);
		pTop.setLayout(new GridLayout(0, 1, 0, 0));

		MyButton btn02 = new MyButton();
		btn02.setHorizontalAlignment(SwingConstants.LEFT);
		btn02.setText("LEFT");
		pTop.add(btn02);

		MyButton btn03 = new MyButton();
		btn03.setText("Center");
		pTop.add(btn03);

		MyButton btn04 = new MyButton();
		btn04.setText("Right");
		btn04.setHorizontalAlignment(SwingConstants.RIGHT);
		pTop.add(btn04);

		JPanel pButton = new JPanel();
		pButton.setBorder(
				new TitledBorder(null, "\uC218\uC9C1\uC815\uB82C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pRight.add(pButton);
		pButton.setLayout(new GridLayout(1, 0, 0, 0));

		MyButton btn05 = new MyButton();
		btn05.setVerticalAlignment(SwingConstants.TOP);
		btn05.setText("Top");
		pButton.add(btn05);

		MyButton btn06 = new MyButton();
		btn06.setText("Center");
		pButton.add(btn06);

		MyButton btn07 = new MyButton();
		btn07.setVerticalAlignment(SwingConstants.BOTTOM);
		btn07.setText("Bottom");
		pButton.add(btn07);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tglbtn01) {
			actionPerformedTglbtn01(e);
		}
	}

	protected void actionPerformedTglbtn01(ActionEvent e) {
		if (tglbtn01.isSelected()) {
			tglbtn01.setText("누르셈");
		} else {
			tglbtn01.setText("눌럿네");

		}
	}
}
