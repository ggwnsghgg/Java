package Chapter12;

public class MovieThread extends Thread{
	@Override
		public void run() {
		while(true) {
			System.out.println("�������� ����մϴ�.");
			try {
				Thread.sleep(1000); 
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
