package exception;

public class AutoCloseobjTest {
	public static void main(String[] args) {
		try(AutoCloseobj obj = new AutoCloseobj()) {// ����� ���ҽ� ���� {
	}catch(Exception e ) {
		System.out.println("���� �κ��Դϴ�.");
		}
	}
}
