package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("Java");			//�ν��Ͻ��� ó�� �������� �� �޸��ּ�
		System.out.println("javaStr ���ڿ� �ּ� :" + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);		// String���� ���� StringBuilder ����
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(javaStr));
		
		
		// ���ڿ� �߰�
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(javaStr));
		
		
		javaStr = buffer.toString();			// String Ŭ������ ��ȯ
		System.out.println(javaStr);
		System.out.println("����� javaStr ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
	}

}