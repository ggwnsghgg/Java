package IfExample;

import java.util.Scanner;

public class CH04_p103_mission {

	public static void main(String[] args) {
		System.out.println("월을 숫자로 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int season_num= sc.nextInt();
		String season_str;
		// "" str 값일때
		// '' char 값일때
		
		switch(season_num) {
		case 12:
		case	1:
		case	2:
			System.out.println("겨울 입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름 입니다");
			break;
		default:
			System.out.println("가을 입니다.");
			break;
		}
	}
}