package sub6;
/*
 * date : 2020/05/13
 * name : ������
 * content : �߻�Ŭ���� �ǽ��ϱ� ���� p329
 * 
 * �߻�Ŭ����
 *  - Ŭ������ �߻� �޼���� ����� Ŭ����
 *  - �߻�Ŭ������ ��� �޾� ���ϼ� �ִ� ������ ���� Ŭ������ ����
 *  - �߻�Ŭ������ ��ӹ޴� �ڽ�Ŭ������ Ÿ�Լ����� �������� ����
 *  
 * 
 */
public class AbstractClassTest {
	public static void main(String[] args) {
		
		//�߻�Ŭ������ ��ü���� �ȵ�
		//Unit unit = new Unit();
		
		Unit u1 = new Marine();
		Unit u2 = new Zergling();
		Unit u3 = new Zealot();
		
		u1.move();
		u1.attack();
		
		u2.move();
		u2.attack();
		
		u3.move();
		u3.attack();
	}
}
