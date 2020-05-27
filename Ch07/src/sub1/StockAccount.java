package sub1;

public class StockAccount extends Account {
	//extends 를 통해 부모클래스를 가져오면 stockaccount는 자식 클래스가 된다.
	//이때 자식클래스가 되면 부모클래스의 멤버를 초기화 해줘야함
	//자식클래스도 초기화 해줘야함. 아래의 stockaccount의 괄호 안에 이어서 작성할 것 
	private String stock;
	private int amount;
	private int price;
	
	StockAccount(String bank, String id, String name, int money,
				String stock, int amount, int price) {
		super(bank, id, name, money); //super(=부모클래스) 생성자 호출
		//아래는 stockaccount 생성자 호출
		this.stock = stock;
		this.amount = amount;
		this.price = price;		
	}
	
	public void sell(int amount) {
		this.amount -= amount;
	}
	
	public void buy(int amount) {
		this.amount += amount;
	}
	//부모클래스에서 멤버를 protected한다. 왜냐하면 protected는 자식 클래스에 멤버를 상속가능
	public void info() {
		System.out.println("==================");
		System.out.println("은 행 명 : "+bank);
		System.out.println("계좌변호: "+id);
		System.out.println("입 금 주 : "+name);
		System.out.println("현재잔액: "+money);
		System.out.println("주식종목: "+stock);
		System.out.println("주식수량: "+amount);
		System.out.println("주식가격: "+price);
	}
}
