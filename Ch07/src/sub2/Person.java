package sub2;

public class Person {
	
	private String name;
	private int age;
	
	//생성자 쉽게 만드는 법 빈공간에 우클릭 - source - generate constructor using field   
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void hello() {
		System.out.println(name+" 입니다.");
		System.out.println(age+"세 입니다.");
	}
}
