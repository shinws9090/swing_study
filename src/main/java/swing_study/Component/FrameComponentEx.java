package swing_study.Component;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameComponentEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn2;
	private JButton btn3;
	private JButton btn1;

	public FrameComponentEx() {
		initialize();
	}

	private void initialize() {
		setTitle("공통속성");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		createBtn();

		btn2 = new JButton("Disabled Button");
		btn2.addActionListener(this);
		btn2.setEnabled(false);
		contentPane.add(btn2);

		btn3 = new JButton("gerX(),getY()");
		btn3.addActionListener(this);
		contentPane.add(btn3);
	}

	public void createBtn() {
		btn1 = new JButton("Magenta/Yellow Button");
		btn1.setForeground(Color.MAGENTA);
		btn1.setBackground(Color.YELLOW);
		btn1.setFont(new Font("Algerian", Font.PLAIN, 20));
		contentPane.add(btn1, 0);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			actionPerformedBtn1(e);
		}
		if (e.getSource() == btn2) {
			actionPerformedBtn2(e);
		}
		if (e.getSource() == btn3) {
			actionPerformedBtn3(e);
		}
	}

	protected void actionPerformedBtn3(ActionEvent e) { // 컨트롤+1 은 변수를 필드로 바로 빼기
		JButton btn = (JButton) e.getSource();
		FrameComponentEx parent = (FrameComponentEx) btn.getTopLevelAncestor();
		parent.setTitle(btn.getX() + "," + btn.getY());

		if (btn2.isEnabled()) {// 중요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 프로잭트에 써야한다 버튼이나 택스트 활성화 비활성화
			btn2.setEnabled(false);
		} else {
			btn2.setEnabled(true);
		}

	}

	protected void actionPerformedBtn2(ActionEvent e) {
		if (btn1 != null) { // 삭제
			contentPane.remove(btn1);
			revalidate();
			btn1 = null;
		} else {
			createBtn();
			revalidate();

		}

	}

	protected void actionPerformedBtn1(ActionEvent e) {

		if (btn3.isVisible()) {
			btn3.setVisible(false);
		} else {
			btn3.setVisible(true);
		}
	}
}
