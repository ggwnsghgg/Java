package loopexample;
import java.util.Scanner;

public class CountinueExample2 {

	   public static void main(String[] args) {
		      // TODO Auto-generated method stub
		     String jumin = "",gender = "";
		     Scanner scan = new Scanner(System.in);
		      System.out.print("당신은 주민등록번호는?(-를 포함해서 입력)");
		      jumin = scan.next();
		      
		      char ch = jumin.charAt(7);
		      if((int)ch%2==1) {gender = "남성";}
		      else {gender = "여성";}
		      System.out.println("성별:"+gender);
		   }
		}