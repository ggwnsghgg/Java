package sec01.exam01;

public class Member {
	public String id;
	
	
	public Member(String id) {
		this.id = id;

	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {			// �Ű����� member Ÿ������ Ȯ��
			// member Ÿ������ ���� Ÿ�� ��ȯ�ϰ� id �ʵ尪�� �������� �˻��� ��, �����ϴٸ� true�� ����
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
} 