package master_ch09;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
	FlowLayoutEx() {
		setTitle("FlowLayout Sample");									// �������� Ÿ��Ʋ �ݱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ������ �����츦 ������ ���α׷� ����
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30 , 40));		// ����Ʈ�ҿ� FlowLayOut ��ġ ������ ����
	
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutEx();
		
		

	}

}
