package sec02.exam05;

public class DeamonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);   // AutoSaveThread�� ���� ������� ����
		autoSaveThread.start();
		
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("���� ������ ����");
	}
}