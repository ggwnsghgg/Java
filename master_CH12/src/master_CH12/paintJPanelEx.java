package master_CH12;

import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame {
	Container contentPane;
	paintJPanelEx() {
		setTitle("JPanel paintComponent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		MyPanel panel = new MyPanel(); // �г��� ���� ����
		contentPane.add(panel, BorderLayout.CENTER); // �г��� ����Ʈ�ҿ� ����
		setSize(250,200);
		setVisible(true);
	}

	// JPanel�� ��ӹ޴� �� �г� ����
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			// �гο� ������ �׸���.
			super.paintComponent(g); // JPanel�� paintComponent() ȣ��
			g.setColor(Color.BLUE); // �Ķ��� ����
			g.drawRect(10,10,50,50); // (10,10) ��ġ�� 50x50 ũ���� �簢�� �׸���
			g.drawRect(50,50,50,50); // (50,50) ��ġ�� 50x50 ũ���� �簢�� �׸���			
			g.drawRect(90,90,50,50); // (90,90) ��ġ�� 50x50 ũ���� �簢�� �׸���
		}	
	}
	
	public static void main(String [] args) {
		new paintJPanelEx();
	}
} 