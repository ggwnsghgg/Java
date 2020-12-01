package classpart;

public class p135 {
	public int add(int num1, int num2) {
			int result;
			result = num1 + num2;
			return result;
		}
			
	public void printGreeting(String name) {
		System.out.println(name + " 님 안녕하세요.");
		return;
		
		//메소드가 없고 void(반환형)만 있을때 return 값 가져갈 것이 없을 때가 있다 메소드 안에 print 구문이 존재하기때문
	}
	
	public static void main(String[] args) {
//		p135 result = new p135();
//		int return_result = result.add(1, 2);
//		System.out.println(return_result);
		
		p135 result = new p135();
		result.printGreeting("신준호");
	}
}

