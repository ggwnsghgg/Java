package master_ch09;

import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame{
	
	
	ContentPaneEx() {
		setTitle("ContentPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	
	Container contentPane = getContentPane();
	contentPane.setBackground(Color.orange);
	contentPane.setLayout(new FlowLayout());
	contentPane.add(new JButton("OK"));
	contentPane.add(new JButton("Cancle"));
	contentPane.add(new JButton("Ignore"));
	
	
	setSize(300, 150);
	setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();

	}
}
