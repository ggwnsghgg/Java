package sec01.exam04;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
		String element = iterator.next();
		System.out.println("\t" + element);
	}
		set.remove("JDBC");											// 1개의 객체 삭제
		set.remove("iBATIS");										// 1개의 객체 삭제
		
		System.out.println("총 객체수 : " + set.size());		// 저장된 객체 수 얻기
		
		iterator = set.iterator();										// 반복자 얻기
		
		// 객체 수만큼 루핑
		for(String element : set) {							
			System.out.println("\t" + element);
		}
		
		set.clear();														// 모든 객체 지우기
		if(set.isEmpty()) { System.out.println("비어 있음"); }
	}

}
