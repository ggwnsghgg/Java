package IfExample;

import java.util.Scanner;

public class CH04_p103_mission {

	public static void main(String[] args) {
		System.out.println("���� ���ڷ� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int season_num= sc.nextInt();
		String season_str;
		// "" str ���϶�
		// '' char ���϶�
		
		switch(season_num) {
		case 12:
		case	1:
		case	2:
			System.out.println("�ܿ� �Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("�� �Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("���� �Դϴ�");
			break;
		default:
			System.out.println("���� �Դϴ�.");
			break;
		}
	}
}