package test06;
/*
 * date : 2020/05/13
 * name : ������
 * content : Ŭ���� ��� ��������
 */

class rent{
	public void payment() {
		System.out.println("�Ӵ�Ḧ �޽��ϴ�.");
	}
}
class Landload extends rent{
	public void getMoney() {
		System.out.println("�ǹ����Դϴ�.");
		payment();
		
	}
}

public class JavaTest6 {
	public static void main(String[] args) {
		
		Landload master = new Landload();
		master.getMoney();
	}

}
