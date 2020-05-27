package sub3;
/*
 * date : 2020/05/12
 * name : 강래구
 * content : 자바 오버라이드 메서드 실습하기 교재 p295
 */
public class OverrideTest {
	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		
		//final : 추가 대입을 못하고 항상 대문자로 표기해야한다.
		// - final 변수 : 상수
		// - final 메서드 : 오바리이드 금지
		// - final 클래스  : 상속금지
		
		final int NUM = 1; //<-상수
		//num = 2; 상수는 처음 초기화된 값으로 고정된다.
		final double PI = 3.14;
		
	}
}
