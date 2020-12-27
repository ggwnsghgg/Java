package master_CH11;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {
	Container contentPane;

	RadioButtonEx() {
		setTitle("������ư �����  ����");
		setDefaultCloseOperation(3);
		contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		
		
		// �̹��� ���̵���ư�� ����� ���� 2���� ������ ��ü�� ����.
		ImageIcon cherryIcon = new ImageIcon("C:\\Java_LAB\\master_CH11\\src\\master_CH11\\cherry.jpg");							 // ���� ���¸� ǥ���ϴ� �̹���
		
		ImageIcon selectedCherryIcon = new ImageIcon("C:\\Java_LAB\\master_CH11\\src\\master_CH11\\selectedCherry.jpg");	// ���� ���¸� ǥ���ϴ� �̹���
		
		// ��ư �׷� ��ü ����
		ButtonGroup g = new ButtonGroup();
		
		// ������ư 3�� ����
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��", true);
		JRadioButton cherry = new JRadioButton("ü��", cherryIcon);
		
		cherry.setBorderPainted(true);																// �̹��� ������ư�� �ܰ��� ���
		cherry.setSelectedIcon(selectedCherryIcon);											// ���� ���¸� ǥ���ϴ� �̹��� ���
		
		// ��ư �׷� ��ü�� 3���� ���� ��ư ����
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		// ����Ʈ�ҿ� 3���� ���̵���ư ����
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonEx();
	}
}