package sub3;
/*
 * date : 2020/05/12
 * name : ������
 * content : �ڹ� �������̵� �޼��� �ǽ��ϱ� ���� p295
 */
public class OverrideTest {
	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		
		//final : �߰� ������ ���ϰ� �׻� �빮�ڷ� ǥ���ؾ��Ѵ�.
		// - final ���� : ���
		// - final �޼��� : ���ٸ��̵� ����
		// - final Ŭ����  : ��ӱ���
		
		final int NUM = 1; //<-���
		//num = 2; ����� ó�� �ʱ�ȭ�� ������ �����ȴ�.
		final double PI = 3.14;
		
	}
}
