package master_CH10;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

import jdk.jfr.ContentType;

public class KeyListenerEx2  extends JFrame{

	JPanel contentPane = new JPanel();			// 컨텐트팬으로 사용할 패널
	JLabel la = new JLabel();							// 빈 레이블 컴포넌트 생성
	
	KeyListenerEx2() {
		setTitle("KeyLitener 예제 ,F1 초록색  , % 노란색" );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		contentPane.requestFocus();
	}
	
	// Key 리스너 구현
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
				la.setText(e.getKeyText(e.getKeyCode()) + "키가 입력되었음");// 키 문자 값 알아내기
				// la에 입력된 키의 키 이름 문자열을 출력하여 사용자에게 보고함
				if(e.getKeyChar() == '%')			// la가  % 일때
					contentPane.setBackground(Color.YELLOW);
				else if(e.getKeyCode() == KeyEvent.VK_F1)		// la가 F1 일때
					contentPane.setBackground(Color.GREEN);	
		}
	}

	public static void main(String[] args) {
		new KeyListenerEx2();
	}
}
