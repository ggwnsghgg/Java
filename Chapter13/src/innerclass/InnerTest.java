package innerclass;


class OutClass {									// �ܺ� Ŭ����
	private int num = 10;							// �ܺ� Ŭ���� private ����
	private static int sNum = 20;				// �ܺ� Ŭ���� ���� ����


	// ���� Ŭ���� �ڷ��� ������ ���� ����
	private InClass inClass;

	
	// �ܺ� Ŭ���� ����Ʈ ������, �ܺ� Ŭ������ ������ �Ŀ� ���� Ŭ���� ���� ����
	public OutClass() {
	inClass = new InClass();
		
	}
	
	class InClass {
		int inNum = 100;							// �ν���Ʈ ���� Ŭ����
		// static int sInNum = 200; 				// �ν��Ͻ� ���� Ŭ������ ���� ���� ���� �Ұ���, ������ �߻��ϹǷ� �ּ� ó����
	
	void inTest() {
		System.out.println("OutClass num = " + num + " (�ܺ� Ŭ������ �ν��Ͻ� ����)" );
		System.out.println("OutClass sNum = " + sNum + " 	(�ܺ� Ŭ������ ���� ����)");
	
		}
		
		// ���� �޼��� ���� ������ �Ұ���, ������ �߻��ϹǷ� �ּ� ó����
		//static void sTest() {
	//}
	}
	public void usingClass() {
		inClass.inTest();
	}
	
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		
		void inTset() {
			// num += 10
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass inNum = " +sInNum + "(���� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass inNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		}
		
		static void sTest() {
			// num += 10;
			// inNum += 10;
			
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
			
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
	OutClass outClass = new OutClass();
	System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
	outClass.usingClass(); 						// ���� Ŭ���� ��� ȣ��
	
	System.out.println();
	
	OutClass.InStaticClass sInClass  = new OutClass.InStaticClass();
	System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
	sInClass.inTset();
	System.out.println();
	System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
	OutClass.InStaticClass.sTest();
	
	}
}