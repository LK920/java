package sub2;
/*
 * date : 2020/05/12
 * name : 강래구
 * content : 클래스 상속 실습하기
 */
// 자바에서는 다중 상속 지원 안함
public class InheritTest {
	
	public static void main(String[] args) {
		
		SalaryStudent kim = new SalaryStudent("김유신", 31, "부경대", "경영학", "Samsung");
		Student lee = new Student("이순신", 25, "부산대", "경제학");
		
		kim.hello();
		lee.hello();
	}
}
