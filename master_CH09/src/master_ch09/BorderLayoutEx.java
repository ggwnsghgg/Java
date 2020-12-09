package master_ch09;

	import javax.swing.*;
	import java.awt.*;

	public class BorderLayoutEx extends JFrame{
		BorderLayoutEx() {
			setTitle("BorderLayout Sample");									// 프레임의 타이틀 닫기
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 프레임 윈도우를 닫으면 프로그램 종료
			
			Container c = getContentPane();
			c.setLayout(new BorderLayout());		// 컨텐트팬에 FlowLayOut 배치 관리자 설정
		
			c.add(new JButton("add"), BorderLayout.NORTH);
			c.add(new JButton("sub"), BorderLayout.SOUTH);
			c.add(new JButton("mul"), BorderLayout.EAST);
			c.add(new JButton("div"), BorderLayout.WEST);
			c.add(new JButton("Calculate"), BorderLayout.CENTER);
			
			setSize(300, 200);
			setVisible(true);
		}
		public static void main(String[] args) {
			new BorderLayoutEx();

		}

	}
