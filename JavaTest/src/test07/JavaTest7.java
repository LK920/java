package test07;
/*
 * 날짜 : 2020/05/01
 * 이름 : 강래구
 * 내용 : 자바 조건문 연습문제
 */
public class JavaTest7 {
	public static void main(String[] args) {
		
		boolean isOk    = true;
		boolean isValid = true;
		
		if(isOk == true && isValid == true ) {
			System.out.println("isOk와 isValid 값은 true 입니다.");
		}else {
			System.out.println("isOk와 isValid 값 중 하나는 fasle 입니다.");
		} //조건식에 isOk && isValid 라고 해도 됨
		
	}
}
