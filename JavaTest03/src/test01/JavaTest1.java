package test01;

/*
 * date : 2020/05/13
 * name : ������
 * content : �ڹ� Ŭ���� ��������
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
		obj.setName("ȫ�浿");
		
		System.out.println(obj.getName());
				
	}

}