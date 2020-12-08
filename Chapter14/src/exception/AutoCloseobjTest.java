package exception;

public class AutoCloseobjTest {
	public static void main(String[] args) {
		try(AutoCloseobj obj = new AutoCloseobj()) {// 사용할 리소스 선언 {
	}catch(Exception e ) {
		System.out.println("예외 부분입니다.");
		}
	}
}
