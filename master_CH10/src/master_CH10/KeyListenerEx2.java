package master_CH10;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

import jdk.jfr.ContentType;

public class KeyListenerEx2  extends JFrame{

	JPanel contentPane = new JPanel();			// ����Ʈ������ ����� �г�
	JLabel la = new JLabel();							// �� ���̺� ������Ʈ ����
	
	KeyListenerEx2() {
		setTitle("KeyLitener ���� ,F1 �ʷϻ�  , % �����" );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		contentPane.requestFocus();
	}
	
	// Key ������ ����
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
				la.setText(e.getKeyText(e.getKeyCode()) + "Ű�� �ԷµǾ���");// Ű ���� �� �˾Ƴ���
				// la�� �Էµ� Ű�� Ű �̸� ���ڿ��� ����Ͽ� ����ڿ��� ������
				if(e.getKeyChar() == '%')			// la��  % �϶�
					contentPane.setBackground(Color.YELLOW);
				else if(e.getKeyCode() == KeyEvent.VK_F1)		// la�� F1 �϶�
					contentPane.setBackground(Color.GREEN);	
		}
	}

	public static void main(String[] args) {
		new KeyListenerEx2();
	}
}
