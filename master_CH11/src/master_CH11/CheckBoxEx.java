package master_CH11;


import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame{
	Container contentPane;
	CheckBoxEx() {
		setTitle("체크박스 만들기 예제" );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		// 이미지 체크박스를 만들기 위해 2개의 이미지 객체를 생성한다.

		ImageIcon cherryIcon = new ImageIcon("C:\\Java_LAB\\master_CH11\\src\\master_CH11\\cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("C:\\Java_LAB\\master_CH11\\src\\master_CH11\\selectedCherry.jpg");

		
		// 3개의 체크박스 컴포넌트 생성.
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		// 컨텐트팬에 3개의 체크박스 컴포넌트 삽입
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
