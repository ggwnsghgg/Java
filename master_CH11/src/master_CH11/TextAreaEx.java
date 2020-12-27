package master_CH11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaEx extends JFrame {
	Container contentPane;
	TextAreaEx() {
		setTitle("�ؽ�Ʈ���� �����  ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane(); // ����Ʈ���� �ּҸ� �˾Ƴ���.
		
		// ����Ʈ�ҿ� MyCenterPanel�� �����Ѵ�.
		contentPane.add(new MyCenterPanel(), BorderLayout.CENTER);

		setSize(300,300);
		setVisible(true);
	}
	
	// �ؽ�Ʈ�ʵ�, ��ư, �ؽ�Ʈ���� ������Ʈ�� ������ �г�
	class MyCenterPanel extends JPanel {
		JTextField tf;
		JButton btn;
		JTextArea ta;
		MyCenterPanel() {
			tf = new JTextField(20);
			btn = new JButton("�߰�");
			
			// ��ư�� Action �����ʸ� ����Ѵ�.
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText()+"\n");
				}
			});
			ta = new JTextArea("hello", 7, 20);
			add(new JLabel("�Ʒ� â�� ���ڿ��� �Է��ϰ� ��ư�� Ŭ���ϼ���"));
			add(tf);
			add(btn);
			add(new JScrollPane(ta));		
		}
	}
		
	public static void main(String [] args) {
		new TextAreaEx();
	}
} 




