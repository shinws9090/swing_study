package swing_study.Component;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MyButton extends JButton {//개꿀팁
	private String imgPath = System.getProperty("user.dir")
							 +File.separator
							 +"images"
							 +File.separator;
	
	public MyButton() {
		setIcon(new ImageIcon(imgPath+"1.gif"));
		setRolloverIcon(new ImageIcon(imgPath+"2.gif"));
		setPressedIcon(new ImageIcon(imgPath+"3.gif"));
	}

}
