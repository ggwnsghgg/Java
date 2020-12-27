package master_CH12;

import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame {
	Container contentPane;
	paintJPanelEx() {
		setTitle("JPanel paintComponent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		MyPanel panel = new MyPanel(); // 패널을 새로 생성
		contentPane.add(panel, BorderLayout.CENTER); // 패널을 컨텐트팬에 부착
		setSize(250,200);
		setVisible(true);
	}

	// JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			// 패널에 도형을 그린다.
			super.paintComponent(g); // JPanel의 paintComponent() 호출
			g.setColor(Color.BLUE); // 파란색 선택
			g.drawRect(10,10,50,50); // (10,10) 위치에 50x50 크기의 사각형 그리기
			g.drawRect(50,50,50,50); // (50,50) 위치에 50x50 크기의 사각형 그리기			
			g.drawRect(90,90,50,50); // (90,90) 위치에 50x50 크기의 사각형 그리기
		}	
	}
	
	public static void main(String [] args) {
		new paintJPanelEx();
	}
} 