package sec01.exam06;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			if(i == 5) {
				System.exit(0);	// �ݸ� i�� ���� 5�� �Ǹ� system�� ������
				// break
			}
		}
		System.out.println("������ �ڵ�");
	}

}
