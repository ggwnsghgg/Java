package chapter4;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ��� (13�ڸ�) : " );
		
		String n = sc.next();
		String test = n.substring(6,7);
		System.out.println(test);
		
		
		if (test.equals("1")) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
		
//		
//		if (n.substring(6)) {
//			System.out.println(n);
//			System.out.println("���� �Դϴ�");
//		}
//		else {
//			System.out.println(n);
//			System.out.println("���� �Դϴ�");
//		}
		}
	}
