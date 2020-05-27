package sub2;

/**
 * date : 2020/05/19
 * name : 강래구
 * content : Thread 활용 실습하기 교재 p576
 * 
 */ 
public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThead ct1 = new CountThead(count);
		CountThead ct2 = new CountThead(count);
		CountThead ct3 = new CountThead(count);
		
		ct1.start();
		ct2.start();
		ct3.start();//계산 과정에서 누락 발생
		
		//메인쓰레드에서 파생된 서브스레드의 작업이 완료된 후 다시 메인쓰레드로 합류되는 것을 실행
		//join 는 병행실행의 결과를 메인스레드가 기다리다가 합류시키는 개념
		ct1.join();
		ct2.join();
		ct3.join(); 
		
		//누락과정을 막기위해선 count 안에 있는 setnum 앞에 syncronized를 입력하여 
		//병행실행이 동시에 들어오는 것을 막는다.
		
		System.out.println("결과 : "+count.getNum());
	}
	
	

}
