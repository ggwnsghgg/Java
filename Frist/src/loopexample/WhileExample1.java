package loopexample;

public class WhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += sum + num;
			num = num + 1;         // ���ǽ��� False �ǵ��� ����� ���� * (�ȳ����� ���� ���� ��)
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}
}
