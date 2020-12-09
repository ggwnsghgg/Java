package master_CH11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame {

	Container contentPane;
	JCheckBox [] fruits = new JCheckBox [3];
	String [] names = {"���", "��", "ü��"};
	JLabel  sumLabel;
	int sum = 0;
	
	CheckBoxItemEventEx() {
		setTitle("üũ�ڽ��� Item Event ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));
		
		// 3���� üũ�ڽ� ������Ʈ�� �����ϰ� ����Ʈ�ҿ� ����, Item ������ ���
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);;
			contentPane.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener());
		}
		
		sumLabel = new JLabel("���� 0 ���Դϴ�.");
		contentPane.add(sumLabel);
		setSize(250,200);
		setVisible(true);
		
	}
	
	// item ������ ����
	class MyItemListener implements ItemListener {
		// üũ�ڽ��� ���� ���°� ���ϸ� itemStateChanged() ȣ���
		public void itemStateChange(ItemEvent e) {
			int selected =1; 
			
			// ���� �������� �Ǻ�
			if(e.getStateChange() == ItemEvent.SELECTED)
				selected = 1;
			else
				selected = -1;
			
			// � üũ �ڽ����� �Ǻ�
			if(e.getItem() == fruits[0]) // ��� üũ�ڽ�
				sum = sum + selected*100;
			else if (e.getItem() == fruits[1])	// �� üũ�ڽ�
				sum = sum + selected*500;
			else 										// ü�� üũ�ڽ�
				sum = sum + selected*20000;
		}
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();

	}

}

