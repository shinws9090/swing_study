package swing_study.frame;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ContentPaneEx extends JFrame {

	private JPanel contentPane;

	public ContentPaneEx() {
		initialize();
	}
	private void initialize() {
		setTitle("Test");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //종료시 동작모드
		setBounds(100, 400, 450, 300); // frame실행위치 및 프래임 크기
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(10, 20, 30, 40));
		setContentPane(contentPane); // 페널 내용출력
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 50));//레이아웃 여백
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		contentPane.add(btnNewButton_3);
	}

}
