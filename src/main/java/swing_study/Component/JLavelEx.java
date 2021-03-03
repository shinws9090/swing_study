package swing_study.Component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class JLavelEx extends JFrame implements MouseListener {

	private JPanel contentPane;
	//프로그램 실행중인 경로 System.getProperty("user.dir") 
	//File.separator  ==  /
	private String path = System.getProperty("user.dir")+File.separator+"images"+File.separator;
	private JLabel lblNorth;
	private JLabel lblCenter;
	private JLabel lblSouth;

	public JLavelEx() {
		System.out.println(path); //경로확인
		initialize();
	}
	private void initialize() {
		setTitle("JLabel");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblNorth = new JLabel("증명사진");
		lblNorth.addMouseListener(this);
		lblNorth.setOpaque(true);
		lblNorth.setBackground(Color.DARK_GRAY);
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNorth, BorderLayout.NORTH);
		
		lblCenter = new JLabel("");
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCenter.setIcon(new ImageIcon(path+"제목 없음.png"));
		contentPane.add(lblCenter, BorderLayout.CENTER);
		
		lblSouth = new JLabel("전화해라");
		lblSouth.setOpaque(true);
		lblSouth.setBackground(Color.LIGHT_GRAY);
		lblSouth.setIcon(new ImageIcon(path+"images.jpg"));
		lblSouth.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSouth, BorderLayout.SOUTH);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblNorth) {
			mouseClickedLblNorth(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblNorth(MouseEvent e) {
		lblCenter.setIcon(new ImageIcon(path+"images.jpg"));
		lblSouth.setText("돈갚아라");
		JOptionPane.showMessageDialog(null, "변경완료");
	}
}
