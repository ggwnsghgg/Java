package master_CH10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerMouseEx extends JFrame {
	
	ListenerMouseEx() {
		setTitle("버튼에 Moust 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// 버튼 컴포넌트를 생성하고  MouseListener를 단다.
		JButton btn = new JButton("Mouste Event 테스트 버튼");
		btn.setBackground(Color.YELLOW);
		MyMouseListener listener =  new MyMouseListener(); // 마우스 리스터늘 생성
		btn.addMouseListener(listener);
		
		// 버튼을 컨텐트팬에 단다.
		add(btn);
		
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListenerMouseEx();

	}

	class MyMouseListener implements MouseListener {
		public void mouseEntered(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.RED);
		}
		
		public void mouseExited(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.YELLOW);
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
	}
}
