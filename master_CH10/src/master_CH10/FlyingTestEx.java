package master_CH10;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class FlyingTestEx extends JFrame {
	
	JPanel contentPane = new JPanel();	
	JLabel la= new JLabel("Hello");		// Ű �Է¿� ���� ������ ���̺� ������Ʈ
	final int FLYING_UNIT = 10;				// ���̺��� �� �� �����̴� ������ 10 �ȼ�
	
	FlyingTestEx() {
		setTitle("��, ��, ��, �� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�" );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);	// ����Ʈ���� ��ġ������ ����
		contentPane.addKeyListener(new MyKeyListener());		// ����Ʈ�ҿ� Key ������ �ޱ�
		la.setLocation(50,50);;			// la�� �ʱ� ��ġ�� (50,50)
		la.setSize(100,20);
		contentPane.add(la);		
		setSize(300,300);
		setVisible(true);
		
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		contentPane.requestFocus();
	}
	
	// Key ������ ����
	class MyKeyListener extends KeyAdapter {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();		// �Էµ� Ű�� Ű �ڵ带 �˾Ƴ���.
				
				switch (keyCode) {
				case KeyEvent.VK_UP:  	     // UP Ű
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT); break;
				case KeyEvent.VK_DOWN:    // DOWN Ű
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT); break;
				case KeyEvent.VK_LEFT:  	// LEFT Ű
					la.setLocation(la.getX()-FLYING_UNIT, la.getY()); break;
				case KeyEvent.VK_RIGHT:   // RIGHT Ű
					la.setLocation(la.getX()+FLYING_UNIT, la.getY()); break;
				
					}
				}
			}
	
	public static void main(String[] args) {
		new FlyingTestEx();
	}

}
