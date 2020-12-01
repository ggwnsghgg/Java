package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();            //자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		/*
		 * parent.field2 = "data2";              // 불가능함
		 * parent.method3();
		 */
		
		Child child = (Child)parent;              //자동 타입 변환
		child.field1 = "yyy";
		child.method3();  
	}

}
