package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.Sring2");
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

	}

}
