package thisex;

class Person { 
	String name;
	int age;
	
	Person() {           // ����Ʈ ������
	// this ���� ���� this�� ������ ������ ������ ������ this�� ������ �ۼ��ؾ��Ѵ�	
		this("�̸� ����", 1);
	}
	
	Person(String name, int age){  // Person �� �Ű����� (name, age)   * overload
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {   
		// TODO Auto-generated method stub
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}

}
