package consuctor;

public class PersonTest {
	public static void main(String[] args) {
		
		// 디폴트 생성자 값 불러오기
		 Person personKim = new Person();  
		 personKim.name = "김유신";
		 personKim.weight = 85.5F;
		 personKim.height = 180.0F;
		 
		 System.out.println(personKim.height);
		 // 오버로드 된 생성자 값 불러오기
		 Person personLee = new Person("이순신", 175, 75);	
		 
		 System.out.println(personLee.height);
	}
}
