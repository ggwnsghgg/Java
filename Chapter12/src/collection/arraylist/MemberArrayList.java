package collection.arraylist;

import java.util.ArrayList;

import collection.Member;								// MemberŬ������ collection ��Ű���� �����Ƿ� ����Ϸ��� import �ؾ���

public class MemberArrayList {

	private ArrayList<Member> arrayList;			// ArrayList  ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
		
	}
	// �ش� ���̵� ���� ȸ���� ArrayList���� ã�� ������
	public boolean removeMember(int memberId) {
		for(int i=0; i< arrayList.size(); i++) {
			Member member = arrayList.get(i);		// get() �޼��� ȸ���� ���������� ������
			int tempId = member.getMemberId();
			if(tempId == memberId) {					// ȸ�� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i);						// �ش� ȸ���� ����
				return true;
			}
		}	
		// �ݺ����� ���������� �ش� ���̸� ã�� ���Ѱ��
	System.out.println(memberId + "�� �������� �ʽ��ϴ�." ); 		
	return false;
	}
	
	// ��ü ȸ���� ����ϴ� �޼ҵ�
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}