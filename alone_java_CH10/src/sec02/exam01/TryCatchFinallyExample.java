package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.Sring2");
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

	}

}