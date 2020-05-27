package sub2;
//Account(계좌)가 가지고 있는 특성과 기능 예시
public class Account {
	
	//특성(멤버변수) : 객체가 가지고 있는 정보
	// - 접근권한 private 선언으로 무조건 캡슐화한다.
	private String bank; //은행이름 특성
	private String id;	
	private String name;
	private int money;
	
	// 생성자 : 객체를 생성할 때 멤버변수를 초기화하는 메서드
	Account (String bank, String id, String name, int money){
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	
	//기능(메서드)
	public void deposit(int money) {
		this.money += money; //this는 account 클래스를 지시하는 지시대명사
	}
	public void withdraw(int money) {
		this.money -= money;
	}
	public void info() {
		System.out.println("==============");
		System.out.println("은행명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입금 주 : "+name);
		System.out.println("전체금액 : "+money);
	}
}
