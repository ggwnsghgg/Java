package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		try (AutoCloseobj obj = new AutoCloseobj()){
			throw new Exception();						// ���� ���� �߻�
		} catch (Exception e) {
			System.out.println("���� �κ� �Դϴ�.");
		}
	}

}
