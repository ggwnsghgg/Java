package map.hashmap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member> ();
		
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {		// HashMap�� �Ű������� ���� Ű ���� ȸ�����̵� �ִٸ�
			treeMap.remove(memberId);		// �ش� ȸ�� ����
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// Iterator�� ����� ��ü ȸ���� ����ϴ� �޼���
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()) {		// ���� key�� ������
			int key = ir.next();		// key���� �����ͼ�
			Member member = treeMap.get(key);	// key�κ��� value ��������
			System.out.println(member);
		}
		System.out.println();
	}
}