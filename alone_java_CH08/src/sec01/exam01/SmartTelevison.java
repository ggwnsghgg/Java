package sec01.exam01;

public class SmartTelevison implements RemoteControl, Searchable{
	
	private int volume;
	
	
	// RemoteControl 추상메소드에 대한 실제 메소드
	@Override
	public void trunOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	} 
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			System.out.println("현재 TV 볼륨 : " + this.volume);
		}
	}
	// Searchable 추상메소드에 대한 실제 메소드	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
		}
	}
	
	
