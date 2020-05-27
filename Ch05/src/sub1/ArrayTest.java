package sub1;
/*
 * date : 2020/05/04
 * name : 강래구
 * content : 자바 배열 기초 실습하기
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		//변수
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
				
		//배열
		int nums[] = {1, 2, 3, 4, 5}; //{} 안에있는 값을 원소, 원소의 번호는 인덱스(0부터 시작)
		
		//배열의 길이(length)
		System.out.println("배열 nums의 원소의 갯수 : "+nums.length);
		
		//배열 원소 출력	
		for(int i = 0 ; i<=4; i++) {
			System.out.println("배열 nums의 "+(i+1)+"번째 원소 : "+nums[i]);
		}
		
		//확인문제
		String p1 = "김유신";
		String p2 = "김춘추";
		String p3 = "장보고";
		String p4 = "강감찬";
		String p5 = "이순신";

		String people[] = {p1, p2, p3, p4, p5};
		
		//배열의 반복문
		for(String person : people ) {
				System.out.print(person+", ");	
							
		} // = for(int person = 0; person < people.length ; person++ ) {System.out.print(people[person]+", ");
		}
	}