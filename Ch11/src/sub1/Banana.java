package sub1;

public class Banana {
	private String contry;
	private int price;
	
	public Banana(String contry, int price) {
		this.contry = contry;
		this.price = price;
	}
	
	public void info() {
		System.out.println("������ : "+ contry);
		System.out.println("��  �� : "+ price);
}
	}
