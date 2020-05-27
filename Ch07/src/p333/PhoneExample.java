package p333;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); 추상클래스 라서 객체 x
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}

}
