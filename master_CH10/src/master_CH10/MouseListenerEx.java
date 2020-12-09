package master_CH10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseListenerEx extends JFrame  {
	
	JPanel contentPane = new JPanel();	// ����Ʈ������ ����� �г�
	JLabel la;			// "hello"���ڿ� ����� �ϱ� ���� ���̺� ������Ʈ
	
	
	MouseListenerEx() {
		setTitle("Mouse �̺�Ʈ ����");
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
