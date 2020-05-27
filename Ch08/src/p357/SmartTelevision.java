package p357;

import p349.RemoteControl;
import p356.Searchable;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
		//turnOn() 추상 메소드의 실체 메소드
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		//turnOff() 추상 메소드의 실체 메소드
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		//setVolume 추상 메소드의 실체 메소드
		@Override
		public void setVolume(int volume) {
			if(volume>RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume<RemoteControl.MIN_VOLUME){
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume= volume;
			}
			System.out.println("현재 TV 볼륨 : "+this.volume);
		}
		public void search(String url) {
			System.out.println(url+"을 검색합니다.");
		}
}
