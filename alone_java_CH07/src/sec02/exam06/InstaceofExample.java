package sec02.exam06;

public class InstaceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {										// Child Ÿ������ ��ȯ�� �������� Ȯ��
			Child child = (Child) parent;
			System.out.println("method1 - child�� ��ȯ ����");
		}else {
			System.out.println("method1 - child�� ��ȯ���� ����");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child)parent;											// ClassCastException�� �߻��� ���ɼ��� ����
		System.out.println("method2 - child�� ��ȯ ����");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();										//  Child ��ü�� �Ű������� ����
		method1(parentA);													
		method2(parentA);
		
		Parent parentB = new Parent();									//  Parent ��ü�� �Ű������� ����
		method1(parentB);	
		method2(parentB); 
		
	}

}
