package sub1;
/*
 * date : 2020/05/18
 * name : 강래구
 * content : Object 클래스 실습하기 교재 p457
 * 
 * Object 클래스
 * - 자바의 최상위 클래스
 * - 모든 클래스의 부모 클래스로 다형성 적용에 활용된다.
 */

public class ObjectTest {
	public static void main(String[] args) {
		
		Object obj1 = new Apple("한국", 3000);
		Object obj2 = new Apple("일본", 3000);
		Object obj3 = new Banana("대만", 2500);
		Object obj4 = new Banana("중국", 2500);
		
		//toString 메서드를 재정의하면 다운캐스팅 X
		obj1.toString(); //apple
		//obj3.info();
		
		//다운캐스팅(오브젝트 클래스에서 자식 메서드를 못받아와서 해줌)
		Apple a1 = (Apple) obj1; 
		Banana b1 = (Banana) obj3;
		
		a1.info();
		b1.info();
		
		//다형성에 활용되는 Object클래스
		Object fruit[] = {obj1, obj2, obj3, obj4};// 타입이 애플이나 바나나로 하면 오류가 생김. 부모클래스를 입력해줘야하는데 따로 설정이 안되어있기에 자동으로 있는 object클래스를 사용
		
		Apple a2 = (Apple) fruit[1];
		Banana b2 = (Banana) fruit[3];
		
		a2.info();
		b2.info();
	
	}

}
