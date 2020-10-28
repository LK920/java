package sub2;
/*
 * date : 2020/05/20
 * name : 강래구
 * content : 제네릭 클래스 실습하기 p654
 */

public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV("LG 올레드");
		SmartPhone phone = new SmartPhone("아이폰 10s");
		
		Product<TV, Integer> p1 = new Product<>(tv, 100);
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy s20");
		
		p1.show();
		p2.show();
				
		
	}

}
