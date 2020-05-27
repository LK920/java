package sub2;
/*
 *date : 2020/05/07
 *name : 강래구
 *content : 자바 클래스 실습하기 
 */
public class ClassTest {
	public static void main(String[] args) {
		//java : 객체 지향 프로그래밍
		//class : 현실 세계에 있는 모든 사물을 추상화 한 것
		
		int num1 = 1;
		int num2 = 2;
				
		//국민은행 객체생성 및 객체 초기화
		Account kb = new Account("국민은행", "122-12-1234", "김춘추", 10000);
		
		//입금, 출금하기, 조회하기
		kb.deposit(10000);
		kb.withdraw(5000);
		//kb.money--; //객체의 멤버변수의 캡슐화를 통한 취약코드 예방
		
		kb.info();
		
		//신한은행 객체생성 및 초기화
		Account sh = new Account("신한은행", "123-13-13450", "김유신", 30000);
		//위 순서 : stack에 sh라는 참조변수 선언 > new Account 객체를 heap에 생성 > 생성자 호출(힙에 있는 new account에 초기화)
		// >new account의 주소값을 sh에 대입
		//신한은행 입금,출금,조회하기
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
	}
}
