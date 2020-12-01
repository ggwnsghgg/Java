package IfExample;

import java.util.Scanner;

public class CH04_p100_alone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학점을 입력하세요 : ");
		
		int score = sc.nextInt();
		if (score >= 90) {
			char grade = 'A';
			System.out.println(grade);
		}
		else if (score >= 80) {
			char grade = 'B';
			System.out.println(grade);
		}
		else if (score >= 70) {
			char grade = 'C';
			System.out.println(grade);
		}
		else if (score >= 60) {
			char grade = 'D';
			System.out.println(grade);
		}
		else {
			char grade = 'F';
			System.out.println(grade);
		}
	}

}