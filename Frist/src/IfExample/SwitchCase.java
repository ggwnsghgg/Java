package IfExample;

public class SwitchCase {

	public static void main(String[] args) {
		char ranking = '��';
		char medalColor;
		
		switch(ranking) {
		case '��':
			medalColor = 'G';
			break;
		case '��':
			medalColor = 'S';
			break;
		case '��':
			medalColor = 'B';
			break;
		default:
			medalColor = 'A';
		}
		System.out.println(ranking + "�� �޴��� ������" + medalColor + "�Դϴ�.");
	}
}
