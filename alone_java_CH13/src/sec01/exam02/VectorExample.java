package sec01.exam02;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
			
		
		// Board ��ü�� ����
		list.add(new Board("����", "����1", "�۾���1"));
		list.add(new Board("����", "����2", "�۾���2"));
		list.add(new Board("����", "����3", "�۾���3"));
		list.add(new Board("����", "����4", "�۾���4"));
		list.add(new Board("����", "����5", "�۾���5"));
		
		list.remove(2);						// 2��° ����Ʈ �ε��� �� ����
		list.remove(3);						// 3��° ����Ʈ �ε��� �� ����
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);				
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}

}