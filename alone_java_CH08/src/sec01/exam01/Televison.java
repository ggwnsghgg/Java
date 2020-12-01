package sec01.exam01;

import sec01.exam01.RemoteControl;

public class Televison implements RemoteControl {

	//�ʵ� 
	private int volume;
	
	
	//turnOn() �߻� �޼ҵ��� ���� �޼ҵ�
	@Override
	public void trunOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	//turnOff() �߻� �޼ҵ��� ���� �޼ҵ�
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	//setVolume() �߻� �޼ҵ��� ���� �޼ҵ�  
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			System.out.println("���� TV ���� : " + this.volume);
		}
	}
	


}