package sec03.exam02;

public class Dog extends Animal{
	public Dog() {
		this.kind = "������";
	}

	@Override							// �߻�޼ҵ� ������
	public void sound() {  
		System.out.println("�۸�");
		
	}

}
