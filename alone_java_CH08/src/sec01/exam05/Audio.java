package sec01.exam05;


public class Audio implements RemoteControl{
	
	//�ʵ�
	private int volume;

	
	@Override
	public void trunOn() {
		System.out.println("Audio�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
		
	}

	//setVolume() �߻� �޼ҵ��� ���� �޼ҵ�  
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			System.out.println("���� Audio ���� : " + this.volume);
		}
	}
	

}
