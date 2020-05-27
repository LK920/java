package sub2;
/*
 * date : 2020/05/01
 * name : 강래구
 * contest : For 반복문 실습하기
 */

public class ForTest {
	public static void main(String[] args) {
		
		//for(초기식; 조건식; 증감식) {}
		for(int i =1 ; i<=2 ; i++) {
			System.out.println("Hello Java!");
			}
		// for 반복문 실행 방식 : 변수 i는 1이고 i가 2보다 작으니 참이면 출력하고, i++로 인해 i는 2가 되고 2가 된 i는 2와 같으니 참이다.
		// 다시 증가하여 3이면되 거짓이 됨으로 2에서 출력이 멈춘다.
		
		
		//1부터 10까지 합
		int sum = 0;
		for(int k =1 ; k<=10; k++) {
			sum += k;
		}
		System.out.println("1부터 10까지 합 : "+sum);
		
		//1부터 10까지 짝수합
		int eSum = 0;
		for(int k = 1; k<=10; k++) {
			if( k % 2 == 0) {
				eSum +=k;	
			}
		}
		System.out.println("1부터 10가지 짝수합 : "+eSum);

		//이중 for 
		for(int a=1; a<=3; a++) {
			System.out.println("a : "+a);
			for(int b=1;b<=5; b++) {
				System.out.println("b : "+b);	
			}
		}
		//구구단
		for(int x = 2 ; x<=3;x++) {
			System.out.println(x+"단");
			for(int y = 1;y<=9;y++ ) {
				int z  = x * y;
				System.out.println(x+" x "+y+" = "+z);
			}
		}
		//별 삼각형 I
		for(int start = 1; start <=10 ; start++) {
			
			for(int end=1; end <= start; end++) {
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		//별 삼각형I 역순
		for(int start = 10; start >=1 ; start--) {
			
			for(int end=1; end <= start; end++) {
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		//별 삼각형 II
		for(int a = 1; a<=5; a++) {
			
			for(int b= 1; b<=5-a;b++) {
				System.out.print("☆");
			}
			for(int c =1; c<=a; c++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
