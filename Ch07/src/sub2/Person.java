package sub2;

public class Person {
	
	private String name;
	private int age;
	
	//������ ���� ����� �� ������� ��Ŭ�� - source - generate constructor using field   
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void hello() {
		System.out.println(name+" �Դϴ�.");
		System.out.println(age+"�� �Դϴ�.");
	}
}
