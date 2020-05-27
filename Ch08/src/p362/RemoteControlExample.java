package p362;

import p349.RemoteControl;
import p351.Television;
import p361.Audio;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc1 = new Audio();
		RemoteControl rc2 = new Television();
		rc1.turnOn();
		rc1.setMute(true);
		
		rc2.setMute(true);
		rc2.turnOff();
	}

}
