package swing_study.Component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class RadioButtonEx extends JFrame implements ItemListener {
	private JPanel contentPane;
	private CustomRadioButton pRadio;
	private String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private ImageIcon[] icons = { 
			new ImageIcon(imgPath + "사과.jpg"), 
			new ImageIcon(imgPath + "배.jpg"),
			new ImageIcon(imgPath + "체리.jpg") };
	private JLabel lblImg;

	public RadioButtonEx() {
		initialize();
	}

	private void initialize() {
		setTitle("라디오버튼 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 541, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 10, 0));

		JPanel pLeft = new JPanel();
		pLeft.setBorder(new TitledBorder(null, "간단한 라디오 버튼", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));

		pRadio = new CustomRadioButton();
		pRadio.getRdbtnApple().addItemListener(this);
		pLeft.add(pRadio);

		JPanel pRight = new JPanel();
		pRight.setBorder(new TitledBorder(null, "응용예제", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pRight);
		pRight.setLayout(new BorderLayout(0, 0));

		CustomRadioButton panel = new CustomRadioButton();
		pRight.add(panel, BorderLayout.NORTH);

		JPanel panel_1 = new JPanel();
		pRight.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		lblImg = new JLabel("");
		panel_1.add(lblImg, BorderLayout.CENTER);

		for (JRadioButton r : panel.getRdBtns()) {
			r.addItemListener(this);
		}
		
		panel.getRdbtnApple().setSelected(true);
	}


	public void itemStateChanged(ItemEvent e) {
		JRadioButton rd = (JRadioButton) e.getSource();
		if (e.getStateChange() == ItemEvent.SELECTED) {
//			JOptionPane.showMessageDialog(null, rd.getText());
			String text = rd.getText();
			switch(text) {
			case "사과" :
				lblImg.setIcon(icons[0]);
				break;
			case "배" :
				lblImg.setIcon(icons[1]);
				break;
			default :
				lblImg.setIcon(icons[2]);
			}
			
		}
		
	}
}
