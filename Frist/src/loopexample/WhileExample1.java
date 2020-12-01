package loopexample;

public class WhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += sum + num;
			num = num + 1;         // 조건식이 False 되도록 만드는 구문 * (안넣으면 무한 루프 돔)
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
}
