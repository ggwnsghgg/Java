package master_CH11;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	Container contentPane;

	TextFieldEx() {
		this.setTitle("�ؽ�Ʈ �ʵ� �����  ����");
		this.setDefaultCloseOperation(3);
		this.contentPane = this.getContentPane();
		this.contentPane.setLayout(new FlowLayout());
		this.contentPane.add(new JLabel("�̸� : "));
		this.contentPane.add(new JTextField(10));
		this.contentPane.add(new JLabel("�а� : "));
		this.contentPane.add(new JTextField("��ǻ�Ͱ��а�(����)"));
		this.contentPane.add(new JLabel("�ּ� : "));
		this.contentPane.add(new JTextField("����� ...", 20));
		this.setSize(350, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldEx();
	}
}