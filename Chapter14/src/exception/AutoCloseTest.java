package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		try (AutoCloseobj obj = new AutoCloseobj()){
			throw new Exception();						// 강제 예외 발생
		} catch (Exception e) {
			System.out.println("예외 부분 입니다.");
		}
	}

}
