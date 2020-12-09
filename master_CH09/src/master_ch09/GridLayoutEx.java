package master_ch09;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
	GridLayoutEx() {
		setTitle("GridLayout Sample");									// 프레임의 타이틀 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 프레임 윈도우를 닫으면 프로그램 종료
		
		Container c = getContentPane();
		GridLayout grid =  new GridLayout(4,2);		// 컨텐트팬에 FlowLayOut 배치 관리자 설정

		grid.setVgap(5); // 그리드 사이의 수직간격을 5 픽셀로 설정
		c.setLayout(grid);
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new  JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new  JLabel("과목"));
		c.add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
		
		

	}

}
