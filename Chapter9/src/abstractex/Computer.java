package abstractex;

public abstract class Computer {		// �߻� Ŭ����
	
	public abstract void display();		// �߻� �޼ҵ�
	public abstract void typing();		// �߻� �޼ҵ�
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}

}
