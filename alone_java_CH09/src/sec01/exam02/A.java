package sec01.exam02;

public class A {
	//�ν��Ͻ� �ʵ�
	B field1 = new B();			// O
	C field2 = new C();			// O
	
	//�ν��Ͻ� �޼ҵ�
	void method1() {

	B var1 = new B();				// O
	C var2 = new C();				// O
	
	}
	
	//���� �ʵ� �ʱ�ȭ
	//static B field3 = new B(); // O
	static C field4 = new C();	// O
	
	//���� �޼ҵ�
	static void method2() {
		
	//B var1 = new B();		// X
		C var2 = new C();		// O
	}
	
	//�ν��Ͻ� ��� Ŭ����
	class B {}
	
	//���� ��� Ŭ����
	static class C {}
}
