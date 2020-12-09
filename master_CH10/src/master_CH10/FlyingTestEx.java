package master_CH10;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class FlyingTestEx extends JFrame {
	
	JPanel contentPane = new JPanel();	
	JLabel la= new JLabel("Hello");		// 키 입력에 따라 움직일 레이블 컴포넌트
	final int FLYING_UNIT = 10;				// 레이블이 한 번 움직이는 단위는 10 픽셀
	
	FlyingTestEx() {
		setTitle("상, 하, 좌, 우 키를 이용하여 텍스트 움직이기" );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);	// 컨텐트팬의 배치관리자 삭제
		contentPane.addKeyListener(new MyKeyListener());		// 컨텐트팬에 Key 리스너 달기
		la.setLocation(50,50);;			// la의 초기 위치는 (50,50)
		la.setSize(100,20);
		contentPane.add(la);		
		setSize(300,300);
		setVisible(true);
		
		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		contentPane.requestFocus();
	}
	
	// Key 리스너 구현
	class MyKeyListener extends KeyAdapter {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();		// 입력된 키의 키 코드를 알아낸다.
				
				switch (keyCode) {
				case KeyEvent.VK_UP:  	     // UP 키
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT); break;
				case KeyEvent.VK_DOWN:    // DOWN 키
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT); break;
				case KeyEvent.VK_LEFT:  	// LEFT 키
					la.setLocation(la.getX()-FLYING_UNIT, la.getY()); break;
				case KeyEvent.VK_RIGHT:   // RIGHT 키
					la.setLocation(la.getX()+FLYING_UNIT, la.getY()); break;
				
					}
				}
			}
	
	public static void main(String[] args) {
		new FlyingTestEx();
	}

}
