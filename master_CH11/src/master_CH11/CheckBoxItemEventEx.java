package master_CH11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame {

	Container contentPane;
	JCheckBox [] fruits = new JCheckBox [3];
	String [] names = {"사과", "배", "체리"};
	JLabel  sumLabel;
	int sum = 0;
	
	CheckBoxItemEventEx() {
		setTitle("체크박스와 Item Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		// 3개의 체크박스 컴포넌트를 생성하고 컨텐트팬에 삽입, Item 리스너 등록
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);;
			contentPane.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener());
		}
		
		sumLabel = new JLabel("현재 0 원입니다.");
		contentPane.add(sumLabel);
		setSize(250,200);
		setVisible(true);
		
	}
	
	// item 리스너 구현
	class MyItemListener implements ItemListener {
		// 체크박스의 선택 상태가 변하면 itemStateChanged() 호출됨
		public void itemStateChange(ItemEvent e) {
			int selected =1; 
			
			// 선택 상자인지 판별
			if(e.getStateChange() == ItemEvent.SELECTED)
				selected = 1;
			else
				selected = -1;
			
			// 어떤 체크 박스인지 판별
			if(e.getItem() == fruits[0]) // 사과 체크박스
				sum = sum + selected*100;
			else if (e.getItem() == fruits[1])	// 배 체크박스
				sum = sum + selected*500;
			else 										// 체리 체크박스
				sum = sum + selected*20000;
		}
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();

	}

}

