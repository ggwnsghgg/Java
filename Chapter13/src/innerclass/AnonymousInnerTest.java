package innerclass;


class Outer2 {
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				//num = 200;
				// i = 10;
				System.out.println(i);
				System.out.println(num);
			}
			
		};
	}
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable�� ������ �͸� Ŭ���� ����");
			
		}
	};
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
	Outer2 out = new Outer2();
	Runnable runnable = out.getRunnable(10);
	runnable.run();
	out.runner.run();

	}

}