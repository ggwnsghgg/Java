package shin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class menu {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 740, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		// 맨위 상단 배너
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Java_LAB\\Pos_Project\\src\\pos\\banner.PNG"));
		lblNewLabel.setBounds(12, 10, 700, 64);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		// 메뉴 아래 버튼 
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(600, 494, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(491, 494, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(12, 494, 97, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		// 메뉴 목록
		JPanel panel = new JPanel();
		panel.setBounds(12, 84, 700, 354);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(12, 10, 102, 103);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("New button");
		btnNewButton_3_1.setBounds(126, 10, 102, 103);
		panel.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("New button");
		btnNewButton_3_1_1.setBounds(354, 10, 102, 103);
		panel.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_2 = new JButton("New button");
		btnNewButton_3_2.setBounds(240, 10, 102, 103);
		panel.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_1_2 = new JButton("New button");
		btnNewButton_3_1_2.setBounds(583, 10, 102, 103);
		panel.add(btnNewButton_3_1_2);
		
		JButton btnNewButton_3_3 = new JButton("New button");
		btnNewButton_3_3.setBounds(469, 10, 102, 103);
		panel.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_1_2_1 = new JButton("New button");
		btnNewButton_3_1_2_1.setBounds(583, 123, 102, 103);
		panel.add(btnNewButton_3_1_2_1);
		
		JButton btnNewButton_3_3_1 = new JButton("New button");
		btnNewButton_3_3_1.setBounds(469, 123, 102, 103);
		panel.add(btnNewButton_3_3_1);
		
		JButton btnNewButton_3_1_1_1 = new JButton("New button");
		btnNewButton_3_1_1_1.setBounds(354, 123, 102, 103);
		panel.add(btnNewButton_3_1_1_1);
		
		JButton btnNewButton_3_2_1 = new JButton("New button");
		btnNewButton_3_2_1.setBounds(240, 123, 102, 103);
		panel.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_3_1_3 = new JButton("New button");
		btnNewButton_3_1_3.setBounds(126, 123, 102, 103);
		panel.add(btnNewButton_3_1_3);
		
		JButton btnNewButton_3_4 = new JButton("New button");
		btnNewButton_3_4.setBounds(12, 123, 102, 103);
		panel.add(btnNewButton_3_4);
		
		JButton btnNewButton_3_1_2_2 = new JButton("New button");
		btnNewButton_3_1_2_2.setBounds(583, 236, 102, 103);
		panel.add(btnNewButton_3_1_2_2);
		
		JButton btnNewButton_3_3_2 = new JButton("New button");
		btnNewButton_3_3_2.setBounds(469, 236, 102, 103);
		panel.add(btnNewButton_3_3_2);
		
		JButton btnNewButton_3_1_1_2 = new JButton("New button");
		btnNewButton_3_1_1_2.setBounds(354, 236, 102, 103);
		panel.add(btnNewButton_3_1_1_2);
		
		JButton btnNewButton_3_2_2 = new JButton("New button");
		btnNewButton_3_2_2.setBounds(240, 236, 102, 103);
		panel.add(btnNewButton_3_2_2);
		
		JButton btnNewButton_3_1_4 = new JButton("New button");
		btnNewButton_3_1_4.setBounds(126, 236, 102, 103);
		panel.add(btnNewButton_3_1_4);
		
		JButton btnNewButton_3_5 = new JButton("New button");
		btnNewButton_3_5.setBounds(12, 236, 102, 103);
		panel.add(btnNewButton_3_5);
	}
}
