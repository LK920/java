package sub1;
/*
 * date : 2020/05/28
 * name : 강래구
 * content : 람다식 실습하기 p678
 */
public class LambdaTest {
	public static void main(String[] args) {
		
		//람다식 : 인터페이스를 활용한 코드블럭을 갖는 익명함수
		Type1 t1 = ()->{
			System.out.println("Type1 람다식 실행...");
		}; //람다식 
		
		t1.f();
		
		Type2 t2 = (x)->{
			System.out.println("Type2 x : "+x);
		};
		
		t2.f(5);
		
		Type3 t3 = (x,y)->{
			return x+y;
		};
		int result = t3.f(2, 4);
		System.out.println("result :"+result);
	}

}
