package swing_study.Component;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class CheckBoxCustome extends JFrame implements ItemListener{

	private JPanel contentPane;
	private ArrayList<Fruit> list;
	private int sum;
	private JLabel lblRes;
	private String resStr;
	

	public CheckBoxCustome(ArrayList<Fruit> list) {
		this.list = list;
		initialize();
//		list.forEach(s->System.out.println(s));
	}
	private void initialize() {
		setTitle("실전 CheckBox");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("");
		pNorth.add(lblTitle);
		
		
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		
		lblRes = new JLabel("New label");
		pSouth.add(lblRes);
		
		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		
		String titleStr = "";
		for(Fruit f : list) {
			JCheckBox ck = new JCheckBox(f.getName());
			titleStr += String.format("%s %d원  ", f.getName(),f.getPrice());
			pCenter.add(ck);
			ck.addItemListener(this);
		}
		lblTitle.setText(titleStr);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox cb = (JCheckBox) e.getSource();
		
		Fruit selectFruit = list.get(list.indexOf(new Fruit(cb.getText())));
		
		if(e.getStateChange()== ItemEvent.SELECTED) {
			sum += selectFruit.getPrice();
		}else {
			sum -= selectFruit.getPrice();
			
		}
		resStr = String.format("%d원 입니다.", sum);
		lblRes.setText(resStr);
		
	}
	

}
