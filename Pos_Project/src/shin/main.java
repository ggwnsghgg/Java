package shin;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


// 메인 화면 프레임
public class main {
   
   private JFrame frmCu;
   private BufferedImage imag1;
   JButton btn1 = new JButton("구매하러가기");
  
   
   
   
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               main window = new main();
               window.frmCu.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public main() {
      initialize();
      
      
      
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      
   
      
      ImageIcon img1 = new ImageIcon("C:\\Java_LAB\\Pos_Project\\src\\pos\\event.jpg");
      Image ch1 = img1.getImage();
      Image ch2 = ch1.getScaledInstance(409, 610, Image.SCALE_SMOOTH);
      
      
      
      frmCu = new JFrame();
      frmCu.setTitle("CU \uBB34\uC778 \uD3EC\uC2A4\uAE30");
      frmCu.setBounds(100, 100, 700, 800);
      frmCu.setResizable(false);
      frmCu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frmCu.getContentPane().setLayout(null);
      
      JButton btnNewButton = new JButton("\uAD6C\uB9E4\uD558\uB7EC \uAC00\uAE30");
      btn1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new menu();
		}
	});

 

   

      btn1.setBounds(268, 728, 133, 23);
      
      frmCu.getContentPane().add(btn1);
      
      
      JLabel lblNewLabel = new JLabel();
      lblNewLabel.setIcon(new ImageIcon(ch2));
      lblNewLabel.setBounds(138, 108, 409, 610);
      frmCu.getContentPane().add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel();
      lblNewLabel_1.setIcon(new ImageIcon("C:\\Java_LAB\\Pos_Project\\src\\pos\\banner.PNG"));
      lblNewLabel_1.setBounds(92, 21, 512, 77);
      frmCu.getContentPane().add(lblNewLabel_1);
      frmCu.setVisible(true);
      
      
   }
   
  // 메뉴 프레임
   public class menu extends JFrame{
	   
	   menu () {
	   setTitle("메뉴");
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	   
	   
	   JPanel menu = new JPanel();
	   JButton btn1 = new JButton();
	   setContentPane(menu);
	   
	   menu.add(btn1);
	   
	   setSize(700, 600);
	   setResizable(false);
	   setVisible(true);
	   setLayout(null);
	   
	   
	   
	  
	   
	   
	   }
   	}
   }