package sub4;

public class Calc {
	
	//싱글톤 객체
	private static Calc instrance = new Calc();
	
	public static Calc getInstrance() {
		return instrance;
	}
	
	//생성자를 생성해서 statictest에서 calc를 new로 못만들게 막음
	private Calc() {	
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}

}
