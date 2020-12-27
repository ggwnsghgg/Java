package master_CH11;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
	Container contentPane;	
	SliderEx() {
		setTitle("�����̴� �����  ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());		

		// �����̴� ������Ʈ �����
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true); // ��ġ(label)�� ���̵��� ����
		slider.setPaintTicks(true); // ����(tick)�� ���̵��� ����
		slider.setPaintTrack(true); // Ʈ��(track)�� �� ���̵��� ����
		slider.setMajorTickSpacing(50); // ū ���� ������ 50�ȼ��� ����
		slider.setMinorTickSpacing(10); // ���� ���� ������ 10�ȼ��� ����

		contentPane.add(slider);
		setSize(300,100);
		setVisible(true);	
	}
	
	public static void main(String [] args) {
		new SliderEx();
	}
} 




