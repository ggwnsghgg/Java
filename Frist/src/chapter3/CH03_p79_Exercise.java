package chapter3;
import java.util.Scanner;

public class CH03_p79_Exercise {

   public static void main(String[] args) {
     
     System.out.println("이지스 리조트 방 배정 시스템");
      
      Scanner sc = new Scanner(System.in);
      System.out.print("당신의 번호를 입력하세요 : ");
      
      int num;
      num = sc.nextInt();
      System.out.println("저는 " + num + "번 입니다." + "어느 방으로 가야 하나요?");
      
      
      if (num % 10==1) {
         System.out.println("1번방으로 가세요");
         sc.close();
      }
      else if (num%10==2) {
         System.out.println("2번방으로 가세요");
         sc.close();
      }
      else if (num % 10==3) {
         System.out.println("3번방으로 가세요");
         sc.close();
      }
      else if (num % 10==4) {
         System.out.println("4번방으로 가세요");
         sc.close();
      }
      else if (num % 10==5) {
         System.out.println("5번방으로 가세요");
         sc.close();
      }
      else if (num % 10==6) {
         System.out.println("6번방으로 가세요");
         sc.close();
      }
      else if (num % 10==7) {
         System.out.println("7번방으로 가세요");
         sc.close();
      }
      else if (num % 10==8) {
         System.out.println("8번방으로 가세요");
         sc.close();
      }
      else if (num % 10==9) {
         System.out.println("9번방으로 가세요");
         sc.close();
      }
      else {
         System.out.println("0번방으로 가세요");
         sc.close();
      }      
   }
}