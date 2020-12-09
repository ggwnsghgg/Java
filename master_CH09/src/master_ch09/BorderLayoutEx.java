package master_ch09;

	import javax.swing.*;
	import java.awt.*;

	public class BorderLayoutEx extends JFrame{
		BorderLayoutEx() {
			setTitle("BorderLayout Sample");									// �������� Ÿ��Ʋ �ݱ�
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ������ �����츦 ������ ���α׷� ����
			
			Container c = getContentPane();
			c.setLayout(new BorderLayout());		// ����Ʈ�ҿ� FlowLayOut ��ġ ������ ����
		
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
