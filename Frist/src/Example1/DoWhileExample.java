package Example1;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		
		do {
			sum = sum + num;
			num = num + 1;
		} while(num <= 10); 
		System.out.println("1���� 10������ ���� "+ sum + "�Դϴ�.");
	}
}
