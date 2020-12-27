package master_CH11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaEx extends JFrame {
	Container contentPane;
	TextAreaEx() {
		setTitle("텍스트영역 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane(); // 컨텐트팬의 주소를 알아낸다.
		
		// 컨텐트팬에 MyCenterPanel을 부착한다.
		contentPane.add(new MyCenterPanel(), BorderLayout.CENTER);

		setSize(300,300);
		setVisible(true);
	}
	
	// 텍스트필드, 버튼, 텍스트영역 컴포넌트를 가지는 패널
	class MyCenterPanel extends JPanel {
		JTextField tf;
		JButton btn;
		JTextArea ta;
		MyCenterPanel() {
			tf = new JTextField(20);
			btn = new JButton("추가");
			
			// 버튼에 Action 리스너를 등록한다.
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText()+"\n");
				}
			});
			ta = new JTextArea("hello", 7, 20);
			add(new JLabel("아래 창에 문자열을 입력하고 버튼을 클릭하세요"));
			add(tf);
			add(btn);
			add(new JScrollPane(ta));		
		}
	}
		
	public static void main(String [] args) {
		new TextAreaEx();
	}
} 




