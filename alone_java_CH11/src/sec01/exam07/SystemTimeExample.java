package sec01.exam07;

public class SystemTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.nanoTime();   // ���� �ð� �б�
		
		int sum = 0;
		for(int i = 1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime(); // �� �ð� �ϱ�
		
		System.out.println("1~1000000 ������ �� : " + sum);
		System.out.println("��꿡 " + (time2-time1) + " �����ʰ� �ҿ�Ǿ����ϴ�.");
	}

}