package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
	int [] arr = {1,2,3,4,5,};
	
	int sumVal = Arrays.stream(arr).sum(); 		 // sum() �������� arr �迭�� ����� ���� ��� ����
	int count = (int)Arrays.stream(arr).count(); // count() �������� arr �迭�� ��� ������ ��ȯ��
	// count() �޼����� ��ȯ  ���� long �̹Ƿ� ing������ ��ȯ
	
	
	System.out.println(sumVal);
	System.out.println(count);

	}

}
