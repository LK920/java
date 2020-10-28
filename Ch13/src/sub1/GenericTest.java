package sub1;
/*
 * date : 2020/05/20
 * name : 강래구
 * content : 제네릭 실습하기 교재 p654
 */
public class GenericTest {
	public static void main(String[] args) {
		Apple a = new Apple("한국",3000);
		Banana b = new Banana("대만",2000);
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(a);
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(b);
		
		appleBox.getFruit().show();
		bananaBox.getFruit().show();
		
	}

}
