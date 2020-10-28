package sub1;
/*
 * date : 2020/05/19
 * name : 강래구
 * content : Thread 클래스 실습하기 교재 p576
 * 
 * Thread
 * - 하나의 프로세스에서 실행되는 실행 흐름
 * - 프로그램이 실행될때 생성하는 실행 흐름
 * - Thread 클래스를 상속받아 start() 메서드로 서브스레드 실행
 * 
 */
public class ThreadTest {
	public static void main (String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("sub1");
		SubThread sub2 = new SubThread("sub2");
		
		//비동기 (Asyncronize) 방식으로 실행
		sub1.start();//병행 실행
		sub2.start();//병행 실행
		
		for(int i =1 ; i <=10 ; i++) {
			
			Thread.sleep(1000);
			System.out.println("Main Thread 실행...");
		}
		System.out.println("M"
				+ "ain Thread 종료...");
		
		
		
		
		
		
		
		
		
	}

}
