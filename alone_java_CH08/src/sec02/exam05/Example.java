package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();		// interfaceA ������ methodA()�� ȣ�� ����
		
		InterfaceB ib = impl;
		ib.methodB();				// InterfaceB ������ methodB()�� ȣ�� ����
		System.out.println();
		
		InterfaceC ic = impl;
		
		// interfaceC ������ methodA, methodB, methodC ��� ȣ�� ����
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}