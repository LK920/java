package test01;

/*
 * date : 2020/05/13
 * name : 강래구
 * content : 자바 클래스 연습문제
 */
public class JavaTest1 {
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		
		JavaTest1 obj = new JavaTest1();
		obj.setName("홍길동");
		
		System.out.println(obj.getName());
				
	}

}
