package sub1;
/*
 * date : 2020/05/13
 * name : 강래구
 * content : 인터페이스 실습하기 p344
 */
public class InterfaceTest1 {
	
	public static void main(String[] args) {
		//인터페이스 역할 : 클래스 설계의 표준 가이드 역할
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chDown();
		samsung.soundUp();
	}
}
