package innerclass;


class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;										// ���� ����
		
		class MyRunnable implements Runnable{	// ���� ���� Ŭ����
			int localNum = 10;								// ���� ���� Ŭ������ �ν��Ͻ� ����

			@Override
			public void run() {
				// TODO Auto-generated method stub
				// num = 200;								// ���� ������ ����� �ٲ�Ƿ� ���� ������ �� ���� ���� �߻�
				// i = 100;									// �Ű������� ���� ����ó�� ����� �ٲ�Ƿ� ���� ������ �� ���� ���� �߻�
				System.out.println("i =" + 1);
				System.out.println("num = " +num);
				System.out.println("localNum = " +localNum);
				System.out.println("outNum = " +outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(�ܺ� Ŭ���� ���� ����)");
				
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);		//�޼��� ȣ��
		runner.run();
	}

}