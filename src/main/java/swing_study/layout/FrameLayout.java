package swing_study.layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameLayout extends JFrame {

	private PanelFlow contentPane;
	private LayoutGuBun gubun;

	
	

	
	public FrameLayout(LayoutGuBun gubun) {
		this.gubun = gubun;
		initialize();
	}
	private void initialize() {
		setTitle("레이아웃 종류");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new PanelFlow();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pSwitch=null;
		switch(gubun) {
		case FLOW :
			pSwitch = new PanelFlow();
			setTitle("플로우 레이아웃");
			break;
		case BODER :
			pSwitch = new PanelBoder();
			setTitle("보더 레이아웃");
			break;
		case GRID :
			pSwitch = new PanelGrid();
			setTitle("그리드 레이아웃");
			break;
		case ABSOLUTE :
			pSwitch = new PanelAbsolute();
			setTitle("절대 레이아웃");
			break;
		}
		contentPane.add(pSwitch, BorderLayout.CENTER);
		
	}

}
