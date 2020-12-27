package master_CH11;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	Container contentPane;

	TextFieldEx() {
		this.setTitle("텍스트 필드 만들기  예제");
		this.setDefaultCloseOperation(3);
		this.contentPane = this.getContentPane();
		this.contentPane.setLayout(new FlowLayout());
		this.contentPane.add(new JLabel("이름 : "));
		this.contentPane.add(new JTextField(10));
		this.contentPane.add(new JLabel("학과 : "));
		this.contentPane.add(new JTextField("컴퓨터공학과(수정)"));
		this.contentPane.add(new JLabel("주소 : "));
		this.contentPane.add(new JTextField("서울시 ...", 20));
		this.setSize(350, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldEx();
	}
}