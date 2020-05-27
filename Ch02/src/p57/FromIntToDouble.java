package p57;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456781;
		
		double num3 = num1;
		num2= (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
	
}