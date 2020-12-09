package master_CH10;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class KeyListenerEx  extends JFrame{

	JPanel contentPane = new JPanel();
	JLabel[] keyMessage;
	
	KeyListenerEx() {
		setTitle("KeyLitener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		
		// ���̺� �迭�� 3�� �����ϰ� �� ���̺� ������Ʈ ����
		keyMessage = new JLabel[3];	// ���̺� �迭 ����
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		// 3���� ���̺� ������Ʈ�� ����Ʈ�ҿ� ����
		for(int i=0; i<keyMessage.length; i++) {
			contentPane.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); // ������ ���̵��� ������ �Ӽ� ����
			keyMessage[i].setBackground(Color.CYAN); // ������ CYAN ������ ����
		}
		
		setSize(300,150);
		setVisible(true);
		
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		contentPane.requestFocus();
	}
	
	// Key ������ ����
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();									// Ű �ڵ� �˾Ƴ���
			char keyChar = e.getKeyChar();									// Ű ���� �� �˾Ƴ���
			
			keyMessage[0].setText(Integer.toString(keyCode));		// Ű �ڵ� ���
			keyMessage[1].setText(Character.toString(keyChar));		// Ű ���� ���
			keyMessage[2].setText(e.getKeyText(keyCode));			// Ű �̸� ���ڿ� ���
			System.out.println("KeyPressed");
		}
		
		public void keyReleased(KeyEvent e) {
			System.out.println("KeyReleased");

		}
		
		public void keyTyped(KeyEvent e) {
			System.out.println("Key Typed");
		}
	}

	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
