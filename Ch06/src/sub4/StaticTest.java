package sub4;
/*
 * date : 2020/05/11
 * name : ������
 * content : ���� p236Ŭ��������(���� ����), Ŭ���� �޼���(�����޼���) �ǽ��ϱ�
 */
public class StaticTest {
	public static void main(String[] args) {
		//�޸� ���� �Ҵ� ����(Method Area)�� �̹� Increament�� add() �޼��尡
		//���� �Ǿ� �ֱ� ������ ��ü �������� �ٷ� ȣ�� ����
		Increament.add(); 
		
		
		Increament inc1 = new Increament();
		Increament inc2 = new Increament();
		Increament inc3 = new Increament();
		
		//�̱��� ��ü ������
		Calc c1 = Calc.getInstrance();
		Calc c2 = Calc.getInstrance();
		
		int r1 = c1.plus(1, 2);
		int r2 = c1.minus(1, 2);
		int r3 = c1.multi(1, 2);
		int r4 = c1.div(1, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
	}

}
