package Chapter9;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	public void washCar() {
		System.out.println("������ �մϴ�.");
	}
	public void run() {
		this.start();
		this.drive();
		this.stop();
		this.turnOff();
		this.washCar();
	}
}
