package sub1;

public class Apple {
	
	private String contry;
	private int price;
	
	public Apple(String contry, int price) {
		this.contry = contry;
		this.price = price;
	}
	
	public void info() {
		System.out.println("������ : "+contry);
		System.out.println("��  �� : "+price);
	}
	
	@Override
	public String toString() {
		System.out.println("������ : "+contry);
		System.out.println("��  �� : "+price);
		return super.toString();
	}

}
