package sub1;

import sub1.Outer.Inner;

/*
 * date : 2020/05/14
 * name : ������
 * content : ��øŬ���� �ǽ��ϱ� ���� p390
 */
public class InnerTest {
	public static void main(String[] args) {
		Outer out = new Outer(10);
		out.info();
		Inner inner = out.new Inner(20);
		inner.info();
	}
}
