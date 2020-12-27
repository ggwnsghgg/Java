package master_CH11;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	Container contentPane;
	String [] fruits= {"apple", "banana", "kiwi", "mango", "pear", 
			"peach", "berry", "strawberry", "blackberry"};
	ImageIcon [] images = {new ImageIcon("C:\\Java_LAB\\master_CH11\\src\\master_CH11\\icon1.png"),
			new ImageIcon("C:\\Java_LAB\\master_CH11\\src\\master_CH11\\icon2.png"),
			new ImageIcon("C:\\Java_LAB\\master_CH11\\src\\master_CH11\\icon3.png"),
			new ImageIcon("C:\\Java_LAB\\master_CH11\\src\\master_CH11\\icon4.png")
	};
	ListEx() {
		setTitle("리스트 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JList strList = new JList(fruits); // 리스트 컴포넌트 생성
		contentPane.add(strList);
	
		JList imageList = new JList(); // 리스트 컴포넌트 생성
		imageList.setListData(images);
		contentPane.add(imageList);	
		
		JList scrollList = new JList(fruits); // 리스트 컴포넌트 생성
		contentPane.add(new JScrollPane(scrollList)); // 리스트를 JScrollPane에 부착

		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new ListEx();
	}
} 




