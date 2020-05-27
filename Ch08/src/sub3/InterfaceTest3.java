package sub3;
/*
 * date : 2020/05/13
 * name : 강래구
 * content : 인터페이스 실습하기 3
 */
public class InterfaceTest3 {
	public static void main(String[] args) {
		//인터페이스 역할 : 객체간의 결합도를 낮추는 역할(느슨하게함)
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
	}

}
