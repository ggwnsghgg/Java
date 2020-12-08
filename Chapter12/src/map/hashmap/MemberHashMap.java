package map.hashmap;

import collection.Member;
import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	// HashMap���� ȸ���� �߰��ϴ� �޼���
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);		// key-value ������ �߰�
	}
	
	// HashMap���� ȸ���� �����ϴ� �޼���
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {		// HashMap�� �Ű������� ���� Ű ���� ȸ�����̵� �ִٸ�
			hashMap.remove(memberId);		// �ش� ȸ�� ����
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// Iterator�� ����� ��ü ȸ���� ����ϴ� �޼���
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) {		// ���� key�� ������
			int key = ir.next();		// key���� �����ͼ�
			Member member = hashMap.get(key);	// key�κ��� value ��������
			System.out.println(member);
		}
		System.out.println();
	}
}