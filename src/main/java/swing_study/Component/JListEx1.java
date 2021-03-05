package swing_study.Component;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JListEx1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private ImageIcon[] icons = { 
			new ImageIcon(imgPath + "집.png"), 
			new ImageIcon(imgPath + "돋보기.png"),
			new ImageIcon(imgPath + "와이파이.png"),
			new ImageIcon(imgPath + "열쇠.png") };
	private String[] fruits = new String[] {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private JButton btn01;
	private JList<String> strList;

	public JListEx1() {
		initialize();
	}
	
	private void initialize() {
		setTitle("JList예제1");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 0));
		
		strList = new JList();
		strList.setListData(fruits);
		contentPane.add(strList);
		
		JList<ImageIcon> list = new JList();
		list.setListData(icons);
		contentPane.add(list);
		
		JPanel pBtns = new JPanel();
		contentPane.add(pBtns);
		
		btn01 = new JButton("첫리스트선택확인");
		btn01.addActionListener(this);
		pBtns.add(btn01);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn01) {
			actionPerformedBtn01(e);
		}
	}
	protected void actionPerformedBtn01(ActionEvent e) {
		int idx = strList.getSelectedIndex();
		String selStr = strList.getSelectedValue();
		List<String> seletedList = strList.getSelectedValuesList();
		String message = String.format("index : %d%nselectedValue   %s%nselectedList   %s", idx,selStr,seletedList);
		JOptionPane.showMessageDialog(null, message);
	}
}
