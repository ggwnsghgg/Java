package master_CH10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseListenerEx extends JFrame  {
	
	JPanel contentPane = new JPanel();	// 컨텐트팬으로 사용할 패널
	JLabel la;			// "hello"문자열 출력을 하기 위한 레이블 컴포넌트
	
	
	MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addMouseListener(new MyMouseListener());
		
		
		la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);
		setSize(200, 200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
		 int x = e.getX();
		 int y = e.getY();
		 la.setLocation(x,y);
	}
	

	}
	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
