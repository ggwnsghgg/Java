package chapter4;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 (13자리) : " );
		
		String n = sc.next();
		String test = n.substring(6,7);
		System.out.println(test);
		
		
		if (test.equals("1")) {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
		
//		
//		if (n.substring(6)) {
//			System.out.println(n);
//			System.out.println("남자 입니다");
//		}
//		else {
//			System.out.println(n);
//			System.out.println("여자 입니다");
//		}
		}
	}

