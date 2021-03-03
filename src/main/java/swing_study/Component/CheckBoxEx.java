package swing_study.Component;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class CheckBoxEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox chckbxApple;
	private JLabel lblRes;
	private int sum;
	private String resStr;
	private JCheckBox chckbxPear;
	private JCheckBox chckbxChary;

	public CheckBoxEx() {
		initialize();
		chckbxChary.setSelected(true);// 중요 기본값 설정!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

	}

	private void initialize() {
		setTitle("체크박스예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 246, 138);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);
		pNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblTitle = new JLabel("사과100원 , 배 500원, 체리 20000원");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		pNorth.add(lblTitle);
		resStr = String.format("현재 %d원 입니다.", sum);

		JPanel pSouth = new JPanel();
		contentPane.add(pSouth);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		chckbxApple = new JCheckBox("사과");
		chckbxApple.addItemListener(this);
		panel.add(chckbxApple);
		
		chckbxPear = new JCheckBox("배");
		chckbxPear.addItemListener(this);
		panel.add(chckbxPear);
		
		chckbxChary = new JCheckBox("체리");
		chckbxChary.addItemListener(this);
		panel.add(chckbxChary);

		lblRes = new JLabel(resStr);
		pSouth.add(lblRes);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == chckbxChary) {
			itemStateChangedChckbxChary(e);
		}
		if (e.getSource() == chckbxPear) {
			itemStateChangedChckbxPear(e);
		}
		if (e.getSource() == chckbxApple) {
			itemStateChangedChckbxApple(e);
		}
		resStr = String.format("현재 %d원 입니다.", sum);
		lblRes.setText(resStr);
	}

	protected void itemStateChangedChckbxApple(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 100;
		} else {
			sum -= 100;
		}

	}

	protected void itemStateChangedChckbxPear(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 500;
		} else {
			sum -= 500;
		}

	}

	protected void itemStateChangedChckbxChary(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 20000;
		} else {
			sum -= 20000;
		}
	}
}
