package collection.arraylist;

import java.util.ArrayList;

import collection.Member;								// Member클래스는 collection 패키지에 있으므로 사용하려면 import 해야함

public class MemberArrayList {

	private ArrayList<Member> arrayList;			// ArrayList  선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
		
	}
	// 해당 아이디를 가진 회원을 ArrayList에서 찾아 제거함
	public boolean removeMember(int memberId) {
		for(int i=0; i< arrayList.size(); i++) {
			Member member = arrayList.get(i);		// get() 메서드 회원을 순차적으로 가져옴
			int tempId = member.getMemberId();
			if(tempId == memberId) {					// 회원 아이디가 매개변수와 일치하면
				arrayList.remove(i);						// 해당 회원을 삭제
				return true;
			}
		}	
		// 반복문이 끝날때까지 해당 아이를 찾지 못한경우
	System.out.println(memberId + "가 존재하지 않습니다." ); 		
	return false;
	}
	
	// 전체 회원을 출력하는 메소드
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
