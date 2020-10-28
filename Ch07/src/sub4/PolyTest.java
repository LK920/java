package sub4;
/**
 * date : 2020/05/12
 * name : 강래구
 * content : 다형성(Polymorphism) 실습하기 교재 p 305
 * 
 * 오버라이드(Override)
 *  - 부모클래스의 멤버 메서드를 자식클래스에서 다시 정의하는 것(재정의)
 *  - 자식클래스의 다시 정의한 메서드를 부모클래스의 메서드를 덮어쓴다.(가려진다.)
 *  
 * 다형성
 *  - 상속관계에 있는 부모클래스의 구체적인 내용이 상속받는 자식클래스로 변하는 성질 
 *  - 부모클래스의 타입으로 객체를 선언하는 것
 *  
 * 
 */
public class PolyTest {
	public static void main(String[] args) {
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
				
		a1.move(); //animal에서 참조가 되어서 hunt를 가져오기 위해서 hunt를 입력함
		a2.move(); //move는 animal에 있는 move가 tiger의 move로 덮어씌어짐
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		
		//다형성 활용
		Tiger ani1 = new Tiger();
		Eagle ani2 = new Eagle();
		Shark ani3 = new Shark();
		
		//객체배열
		Animal arr[] = {ani1, ani2, ani3};
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		arr[0].hunt();
		arr[1].hunt();
		arr[2].hunt();
	}
}
