package sub4;

public class Calc {
	
	//�̱��� ��ü
	private static Calc instrance = new Calc();
	
	public static Calc getInstrance() {
		return instrance;
	}
	
	//�����ڸ� �����ؼ� statictest���� calc�� new�� ������� ����
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
