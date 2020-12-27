package master_CH12;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame {
	Container contentPane;
	GraphicsDrawStringEx() {
		setTitle("drawString 사용  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		MyPanel panel = new MyPanel(); // 새로운 패널 생성
		contentPane.add(panel, BorderLayout.CENTER); // 패널을 컨텐트팬에 부착
		setSize(250,200);
		setVisible(true);
	}

	// JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("자바는 재밌다.~~", 30,30); // 패널의 (30,30) 위치에 문자열 출력
			g.drawString("얼마나? 하늘만큼 땅만큼 !!!!", 60, 60); // 패널의 (60,60) 위치에 문자열 출력
		}	
	}
	
	public static void main(String [] args) {
		new GraphicsDrawStringEx();
	}
} 