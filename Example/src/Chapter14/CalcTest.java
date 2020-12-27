package Chapter14;

public class CalcTest {
	public static void main(String[] args) {
		Calc sum = (x, y) -> {
			return x + y;
		};
		System.out.println(sum.add(20, 30));
	}
}