package master_CH11;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {
	Container contentPane;

	RadioButtonEx() {
		setTitle("라디오버튼 만들기  예제");
		setDefaultCloseOperation(3);
		contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		
		
		// 이미지 라이도버튼을 만들기 위해 2개의 미지지 객체를 생성.
		ImageIcon cherryIcon = new ImageIcon("C:\\Java_LAB\\master_CH11\\src\\master_CH11\\cherry.jpg");							 // 비선택 상태를 표시하는 이미지
		
		ImageIcon selectedCherryIcon = new ImageIcon("C:\\Java_LAB\\master_CH11\\src\\master_CH11\\selectedCherry.jpg");	// 선택 상태를 표시하는 이미지
		
		// 버튼 그룹 객체 생성
		ButtonGroup g = new ButtonGroup();
		
		// 라디오버튼 3개 생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		
		cherry.setBorderPainted(true);																// 이미지 라디오버튼의 외곽선 출력
		cherry.setSelectedIcon(selectedCherryIcon);											// 선택 상태를 표시하는 이미지 등록
		
		// 버튼 그룹 객체에 3개의 라디오 버튼 삽입
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		// 컨탠트팬에 3개의 라이도버튼 삽입
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonEx();
	}
}