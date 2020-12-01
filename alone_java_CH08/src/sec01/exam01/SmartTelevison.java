package sec01.exam01;

public class SmartTelevison implements RemoteControl, Searchable{
	
	private int volume;
	
	
	// RemoteControl �߻�޼ҵ忡 ���� ���� �޼ҵ�
	@Override
	public void trunOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	} 
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
	// Searchable �߻�޼ҵ忡 ���� ���� �޼ҵ�	
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�");
		}
	}
	
	