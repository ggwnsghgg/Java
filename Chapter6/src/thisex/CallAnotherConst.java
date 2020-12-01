package thisex;

class Person { 
	String name;
	int age;
	
	Person() {           // 디폴트 생성자
	// this 구문 위에 this를 제외한 내용을 적으면 오류뜸 this는 맨위에 작성해야한다	
		this("이름 없음", 1);
	}
	
	Person(String name, int age){  // Person 의 매개변수 (name, age)   * overload
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
