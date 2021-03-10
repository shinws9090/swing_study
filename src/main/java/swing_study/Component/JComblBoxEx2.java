package swing_study.Component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class JComblBoxEx2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox<ImageIcon> cmb;
	private String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private ImageIcon[] icons = { 
			new ImageIcon(imgPath + "사과.jpg"),
			new ImageIcon(imgPath + "배.jpg"),
			new ImageIcon(imgPath + "체리.jpg") };
	private JLabel lblImg;
	private String[] fruits = {"사과","배","체리"};

	public JComblBoxEx2() {
		initialize();
	}

	private void initialize() {
		setTitle("JComboBox 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		cmb = new JComboBox(fruits);
		cmb.setSelectedIndex(-1);
		cmb.addActionListener(this);
		contentPane.add(cmb, BorderLayout.NORTH);

		lblImg = new JLabel("");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblImg, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmb) {
			actionPerformedCmb(e);
		}
	}

	protected void actionPerformedCmb(ActionEvent e) {
		int idx = cmb.getSelectedIndex();
		lblImg.setIcon(icons[idx]);
	}
}

/*
public class JComboBoxEx2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox<String> cmb;
	private JLabel lblImg;
	private String imgPath= System.getProperty("user.dir") + File.separator + "images" + File.separator;
	
	private Map<String, ImageIcon> map = new HashMap<String, ImageIcon>();
	
	private ImageIcon[] icons = {
			new ImageIcon(imgPath + "apple.jpg"),
			new ImageIcon(imgPath + "pear.jpg"),
			new ImageIcon(imgPath + "cherry.jpg")
	};
	private String[] fruits = {"apple", "pear", "cherry"};
	
	public JComboBoxEx2() {
		for(int i=0; i<icons.length; i++) {
			map.put(fruits[i], icons[i]);
		}
		
		initialize();
	}
	
	private void initialize() {
		setTitle("JComboBox 이벤트 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);
		
		cmb = new JComboBox<>();
		cmb.setModel(new DefaultComboBoxModel<String>(fruits));
		cmb.setSelectedIndex(-1);//선택 초기화
		cmb.addActionListener(this);
		pNorth.add(cmb);
		
		lblImg = new JLabel("");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblImg, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmb) {
			actionPerformedCmb(e);
		}
	}
	protected void actionPerformedCmb(ActionEvent e) {
		Object obj = cmb.getSelectedItem();
		
		lblImg.setIcon(map.get(obj));
	}
} */