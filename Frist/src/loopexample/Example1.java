package loopexample;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 =2;
		int sum;
		String operator;	
		Scanner sc = new Scanner(System.in);
		System.out.println("하고자하는 사칙연산을 입력하세요 : ");
		operator = sc.next();
		
		switch (operator) {
		case "+": {
				sum = num1 + num2;
				System.out.println(sum);
		}
		case "*": {
				sum = num1 * num2;
				System.out.println(sum);
		}
		case "/": {
				sum = num1 / num2;
				System.out.println(sum);
		}
		case "-": {
				sum = num1 - num2;
				System.out.println(sum);
		}
		default : {
			System.out.println("사칙연산을 다시 입력해주세요");
				}
			}
		}
	}
