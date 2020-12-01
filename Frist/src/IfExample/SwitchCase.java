package IfExample;

public class SwitchCase {

	public static void main(String[] args) {
		char ranking = '금';
		char medalColor;
		
		switch(ranking) {
		case '금':
			medalColor = 'G';
			break;
		case '은':
			medalColor = 'S';
			break;
		case '동':
			medalColor = 'B';
			break;
		default:
			medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");
	}
}
