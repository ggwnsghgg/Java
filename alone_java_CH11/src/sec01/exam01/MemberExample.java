package sec01.exam01;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 =new Member("blue");
		Member obj2 =new Member("blue");
		Member obj3 =new Member("red");
		
		if(obj1.equals(obj2)) {	// 매개값이 member 타입이고 id 필드값도 동일하므로 true
			System.out.println("obj1과  obj2는 동일합니다.");
		}else {
			System.out.println("obj1과 obj2는 동일하지 않습니다");
		}
		
		if(obj1.equals(obj3)) {	// 매개값이 member 타입이만 id 필드값이 동일하지 않으므로 False
			System.out.println("obj1과  obj3는 동일합니다.");
		}else {
			System.out.println("obj1과 obj3는 동일하지 않습니다");
		}
		
	}

}
