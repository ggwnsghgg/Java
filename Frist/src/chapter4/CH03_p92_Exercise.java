package chapter4;
import java.util.Scanner;

public class CH03_p92_Exercise {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.print("����� ���̸� ���ڷ� �Է����ּ��� : ");
      int n;
      n = sc.nextInt();
      if (n < 8) {
         System.out.println(n+"���� �б��� �ٴ��� �ʽ��ϴ�.");
         sc.close();
      }
      else if ((n>7)&&(n<14)) {
         System.out.println(n+"���� �ʵ��б��� �ٴմϴ�.");
         sc.close();
      }
      else if ((n>13)&&(n<17)) {
         System.out.println(n+"���� ���б��� �ٴմϴ�.");
         sc.close();
      }
      else if ((n>16)&&(n<20)) {
         System.out.println(n+"���� ����б��� �ٴմϴ�.");
         sc.close();
      }
      else {
         System.out.println(n+"���� ���б��� �ٴմϴ�.");
         sc.close();	
      }      
   }
}