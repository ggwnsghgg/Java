package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();            //�ڵ� Ÿ�� ��ȯ
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		/*
		 * parent.field2 = "data2";              // �Ұ�����
		 * parent.method3();
		 */
		
		Child child = (Child)parent;              //�ڵ� Ÿ�� ��ȯ
		child.field1 = "yyy";
		child.method3();  
	}

}
