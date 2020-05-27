package sub1;

public class Apple {
	
	private String contry;
	private int price;
	
	public Apple(String contry, int price) {
		this.contry = contry;
		this.price = price;
	}
	
	public void info() {
		System.out.println("생산지 : "+contry);
		System.out.println("가  격 : "+price);
	}
	
	@Override
	public String toString() {
		System.out.println("생산지 : "+contry);
		System.out.println("가  격 : "+price);
		return super.toString();
	}

}
