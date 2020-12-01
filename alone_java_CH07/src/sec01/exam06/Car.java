package sec01.exam06;

public class Car {
	public int speed;
	
	public void speedUp() {speed += 1;}
	
	public final void stop() {
		System.out.println("ÀÚµ¿ ¸ØÃã");
		speed = 0;
	}
}
