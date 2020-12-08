package sec01.exam02;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
			
		
		// Board 객체를 저장
		list.add(new Board("제목", "내용1", "글쓴이1"));
		list.add(new Board("제목", "내용2", "글쓴이2"));
		list.add(new Board("제목", "내용3", "글쓴이3"));
		list.add(new Board("제목", "내용4", "글쓴이4"));
		list.add(new Board("제목", "내용5", "글쓴이5"));
		
		list.remove(2);						// 2번째 리스트 인덱스 값 삭제
		list.remove(3);						// 3번째 리스트 인덱스 값 삭제
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);				
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}

}