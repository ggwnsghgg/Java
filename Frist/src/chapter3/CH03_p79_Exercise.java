package chapter3;
import java.util.Scanner;

public class CH03_p79_Exercise {

   public static void main(String[] args) {
     
     System.out.println("������ ����Ʈ �� ���� �ý���");
      
      Scanner sc = new Scanner(System.in);
      System.out.print("����� ��ȣ�� �Է��ϼ��� : ");
      
      int num;
      num = sc.nextInt();
      System.out.println("���� " + num + "�� �Դϴ�." + "��� ������ ���� �ϳ���?");
      
      
      if (num % 10==1) {
         System.out.println("1�������� ������");
         sc.close();
      }
      else if (num%10==2) {
         System.out.println("2�������� ������");
         sc.close();
      }
      else if (num % 10==3) {
         System.out.println("3�������� ������");
         sc.close();
      }
      else if (num % 10==4) {
         System.out.println("4�������� ������");
         sc.close();
      }
      else if (num % 10==5) {
         System.out.println("5�������� ������");
         sc.close();
      }
      else if (num % 10==6) {
         System.out.println("6�������� ������");
         sc.close();
      }
      else if (num % 10==7) {
         System.out.println("7�������� ������");
         sc.close();
      }
      else if (num % 10==8) {
         System.out.println("8�������� ������");
         sc.close();
      }
      else if (num % 10==9) {
         System.out.println("9�������� ������");
         sc.close();
      }
      else {
         System.out.println("0�������� ������");
         sc.close();
      }      
   }
}