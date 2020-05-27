package sub2;
/*
 * date : 2020/05/04
 * name : 강래구
 * content : 반복문 While 실습하기
 */
public class WhileTest {
	// declare initialize
	public static void main(String[] args) {
		
		//1부터 10까지 합 while(조건식){} 조건식이 거짓이면 실행 x
		int sum = 0;
		int k   = 1; //for문에서 사용한 초기식
		while( k<=10 ) {
			sum += k; // sum += k; 는  1+1+1+1+1+1+1+1+1 .... 무한루프
			k++; // for문에서 사용한 증감식
		}
		System.out.println("1부터 10까지의 합 : "+sum);
		
		// do ~ while 무조건 한번은 실행하고 조건에 따라 추후 실행할지에 말지 결정
		int eSum = 0;
		int i = 1;
		
		do {			
			if(i%2 == 0) {
				eSum += i;	
			}
			
			i++;
			
		}while(i <=10);
		System.out.println("1부터 10까지 짝수합 : "+eSum);
		
		//break 반복 계산중 if 조건에 맞는 값을 출력
		int num = 0;
		
		while(true) {
			
			num++;
			
			if(num%5==0 && num%7==0) {
				break; //반복문을 탈출
			}
			
		}
		System.out.println("5와 7의 최소 공배수 : "+num);
		
		//continue
		int total = 0;
		
		for(int j=1 ; j<=10 ; j++) {
			
			if(j%2==1 ) {
				continue; //반복문의 상위로 이동
			}
			
			total += j;			
			
		}
		System.out.println("1부터 10까지 짝수합 : "+total);
	}

}
