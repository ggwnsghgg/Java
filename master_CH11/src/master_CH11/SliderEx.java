package master_CH11;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
	Container contentPane;	
	SliderEx() {
		setTitle("슬라이더 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());		

		// 슬라이더 컴포넌트 만들기
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true); // 수치(label)가 보이도록 설정
		slider.setPaintTicks(true); // 눈금(tick)이 보이도록 설정
		slider.setPaintTrack(true); // 트랙(track)이 이 보이도록 설정
		slider.setMajorTickSpacing(50); // 큰 눈금 간격을 50픽셀로 설정
		slider.setMinorTickSpacing(10); // 작은 눈금 간격을 10픽셀로 설정

		contentPane.add(slider);
		setSize(300,100);
		setVisible(true);	
	}
	
	public static void main(String [] args) {
		new SliderEx();
	}
} 




