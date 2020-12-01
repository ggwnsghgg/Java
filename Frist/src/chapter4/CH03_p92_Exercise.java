package chapter4;
import java.util.Scanner;

public class CH03_p92_Exercise {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.print("당신의 나이를 숫자로 입력해주세요 : ");
      int n;
      n = sc.nextInt();
      if (n < 8) {
         System.out.println(n+"살은 학교에 다니지 않습니다.");
         sc.close();
      }
      else if ((n>7)&&(n<14)) {
         System.out.println(n+"살은 초등학교에 다닙니다.");
         sc.close();
      }
      else if ((n>13)&&(n<17)) {
         System.out.println(n+"살은 중학교에 다닙니다.");
         sc.close();
      }
      else if ((n>16)&&(n<20)) {
         System.out.println(n+"살은 고등학교에 다닙니다.");
         sc.close();
      }
      else {
         System.out.println(n+"살은 대학교에 다닙니다.");
         sc.close();	
      }      
   }
}