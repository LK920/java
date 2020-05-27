package sub1;
/*
 * date : 2020/05/12
 * name : 강래구
 * content : 클래스 상속 실습하기 교재 p288
 */
public class InheritTest {
	public static void main(String[] args) {
		
		Account nh = new Account("농협","1231-11-1111","김춘추", 10000);
		nh.deposit(10000);
		nh.withdraw(5000);
		nh.info();
		
		StockAccount kb = new StockAccount("국민은행","213-21-2131-2","홍길동",10000,"삼성전자",100,30000);
		kb.deposit(50000);
		kb.withdraw(10000);
		kb.buy(100);
		kb.sell(10);
		
		kb.info();
	}
}
