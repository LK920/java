package sub1;
/*
 * date : 2020/05/06
 * name : 강래구
 * content : 자바 오버로드 메서드(함수) 실습하기
 */
public class MethodOverloadTest {
	public static void main(String[] args) {
	
		int r1 = add(1);
		System.out.println("r1 : "+r1);
		int r2 = add(1,2);
		System.out.println("r2 : "+r2);
		String r3 = add("홍길동");
		System.out.println("r3 : "+r3);	
		
	}//main end
	// 오버로드 메서드
	//  - 함수명이 같지만 매개변수의 갯수와 타입으로 구분하는 메서드
	//모든 메서드나 매개변수는 중복이 되지 않음.
	public static int add(int a) {//매개변수를 달리 함으로 메서드 중복사용 가능.(오버로드)
		return a++;
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static String add(String name) {
		return name+"님 반갑습니다.";
	}
}
