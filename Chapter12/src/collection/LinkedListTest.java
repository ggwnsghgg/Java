package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		// ����Ʈ�� ��� �߰�
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		
		//����Ʈ ��ü ���
		System.out.println(myList);
		
		
		// ��ũ�� ����Ʈ�� ù ��° ��ġ�� D �߰�
		myList.add(1, "D");
		System.out.println(myList);
		
		// ���� ����Ʈ�� �� �տ� 0 �߰�
		myList.addFirst("0");
		System.out.println(myList);
		
		// ���� ����Ʈ�� �� �� ��� ���� �� �ش� ��Ҹ� ���
		System.out.println(myList.removeLast());
		System.out.println(myList);

	}

}
