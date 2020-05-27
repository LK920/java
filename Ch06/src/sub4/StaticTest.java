package sub4;
/*
 * date : 2020/05/11
 * name : 강래구
 * content : 교재 p236클래스변수(정적 변수), 클래스 메서드(정적메서드) 실습하기
 */
public class StaticTest {
	public static void main(String[] args) {
		//메모리 고정 할당 영역(Method Area)에 이미 Increament의 add() 메서드가
		//정의 되어 있기 때문에 객체 생성없이 바로 호출 가능
		Increament.add(); 
		
		
		Increament inc1 = new Increament();
		Increament inc2 = new Increament();
		Increament inc3 = new Increament();
		
		//싱글톤 객체 얻어오기
		Calc c1 = Calc.getInstrance();
		Calc c2 = Calc.getInstrance();
		
		int r1 = c1.plus(1, 2);
		int r2 = c1.minus(1, 2);
		int r3 = c1.multi(1, 2);
		int r4 = c1.div(1, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
	}

}
