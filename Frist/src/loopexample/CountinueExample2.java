package loopexample;
import java.util.Scanner;

public class CountinueExample2 {

	   public static void main(String[] args) {
		      // TODO Auto-generated method stub
		     String jumin = "",gender = "";
		     Scanner scan = new Scanner(System.in);
		      System.out.print("����� �ֹε�Ϲ�ȣ��?(-�� �����ؼ� �Է�)");
		      jumin = scan.next();
		      
		      char ch = jumin.charAt(7);
		      if((int)ch%2==1) {gender = "����";}
		      else {gender = "����";}
		      System.out.println("����:"+gender);
		   }
		}