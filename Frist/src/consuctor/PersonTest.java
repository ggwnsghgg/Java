package consuctor;

public class PersonTest {
	public static void main(String[] args) {
		
		// ����Ʈ ������ �� �ҷ�����
		 Person personKim = new Person();  
		 personKim.name = "������";
		 personKim.weight = 85.5F;
		 personKim.height = 180.0F;
		 
		 System.out.println(personKim.height);
		 // �����ε� �� ������ �� �ҷ�����
		 Person personLee = new Person("�̼���", 175, 75);	
		 
		 System.out.println(personLee.height);
	}
}
