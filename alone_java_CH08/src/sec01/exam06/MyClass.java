package sec01.exam06;

import sec01.exam01.Audio;
import sec01.exam01.RemoteControl;
import sec01.exam01.Televison;



public class MyClass {
	
	//필드
	RemoteControl rc = new Televison();
	
	
	// 생성자
	MyClass () {
		
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.trunOn();
		rc.setVolume(5);
		
	}
	
	// 메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.trunOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.trunOn();
		rc.setVolume(5);
	}
}
