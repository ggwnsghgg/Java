package sec01.exam06;

import sec01.exam01.Audio;
import sec01.exam01.RemoteControl;
import sec01.exam01.Televison;



public class MyClass {
	
	//�ʵ�
	RemoteControl rc = new Televison();
	
	
	// ������
	MyClass () {
		
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.trunOn();
		rc.setVolume(5);
		
	}
	
	// �޼ҵ�
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