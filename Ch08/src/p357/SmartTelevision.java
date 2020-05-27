package p357;

import p349.RemoteControl;
import p356.Searchable;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
		//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		//turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
		//setVolume �߻� �޼ҵ��� ��ü �޼ҵ�
		@Override
		public void setVolume(int volume) {
			if(volume>RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume<RemoteControl.MIN_VOLUME){
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume= volume;
			}
			System.out.println("���� TV ���� : "+this.volume);
		}
		public void search(String url) {
			System.out.println(url+"�� �˻��մϴ�.");
		}
}
