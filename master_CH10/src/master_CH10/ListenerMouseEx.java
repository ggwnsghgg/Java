package master_CH10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerMouseEx extends JFrame {
	
	ListenerMouseEx() {
		setTitle("��ư�� Moust �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// ��ư ������Ʈ�� �����ϰ�  MouseListener�� �ܴ�.
		JButton btn = new JButton("Mouste Event �׽�Ʈ ��ư");
		btn.setBackground(Color.YELLOW);
		MyMouseListener listener =  new MyMouseListener(); // ���콺 �����ʹ� ����
		btn.addMouseListener(listener);
		
		// ��ư�� ����Ʈ�ҿ� �ܴ�.
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
