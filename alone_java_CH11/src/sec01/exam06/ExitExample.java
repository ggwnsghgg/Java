package sec01.exam06;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			if(i == 5) {
				System.exit(0);	// 반목문 i의 값이 5가 되면 system을 끝내라
				// break
			}
		}
		System.out.println("마무리 코드");
	}

}
