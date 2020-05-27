package sub2;
/**
 * date : 2020/05/14
 * name : 강래구
 * content : 익명객체 실습하기 교재 p404
 */
public class AnonyObjectTest {
	public static void main(String[] args) {
		// person이라는 추상메서드를 타 클래스에서 오버라이드 하지 않고
		//직접 가져와서 오버라이드 하는 것 
		
		/*익명개체 : 인터페이스를 클래스 구현없이 바로 new연산으로 객체를 생성하는 것*/
		
		Person p = new Person() {
			
			@Override
			public void info() {
				System.out.println("Person info..."); 
			}
			
			@Override
			public void hello() {
				System.out.println("Person hello...");				
			}
		};
		
		p.info();
		p.hello();
	}

}
