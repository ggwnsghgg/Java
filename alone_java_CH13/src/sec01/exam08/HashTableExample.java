package sec01.exam08;

import java.util.*;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		
		// ���̵�� ��й�ȣ ����
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		
		Scanner scanner = new Scanner(System.in);		// Ű����� �Է��� �� �б�
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.println("���̵� : ");
			String id = scanner.nextLine();					// Ű����� �Է��� ���̵� ����
			System.out.println("��й�ȣ : ");
			String password = scanner.nextLine();			// Ű����� �Է��� ��й�ȣ�� ����
			System.out.println();
			
			
			if(map.containsKey(id)) {						// ���̵��� Ű�� �����ϴ��� Ȯ��
				if(map.get(id).equals(password)) {		//  ��й�ȣ�� ��
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}
	}
}
