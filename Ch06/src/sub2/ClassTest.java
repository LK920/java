package sub2;
/*
 *date : 2020/05/07
 *name : ������
 *content : �ڹ� Ŭ���� �ǽ��ϱ� 
 */
public class ClassTest {
	public static void main(String[] args) {
		//java : ��ü ���� ���α׷���
		//class : ���� ���迡 �ִ� ��� �繰�� �߻�ȭ �� ��
		
		int num1 = 1;
		int num2 = 2;
				
		//�������� ��ü���� �� ��ü �ʱ�ȭ
		Account kb = new Account("��������", "122-12-1234", "������", 10000);
		
		//�Ա�, ����ϱ�, ��ȸ�ϱ�
		kb.deposit(10000);
		kb.withdraw(5000);
		//kb.money--; //��ü�� ��������� ĸ��ȭ�� ���� ����ڵ� ����
		
		kb.info();
		
		//�������� ��ü���� �� �ʱ�ȭ
		Account sh = new Account("��������", "123-13-13450", "������", 30000);
		//�� ���� : stack�� sh��� �������� ���� > new Account ��ü�� heap�� ���� > ������ ȣ��(���� �ִ� new account�� �ʱ�ȭ)
		// >new account�� �ּҰ��� sh�� ����
		//�������� �Ա�,���,��ȸ�ϱ�
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
	}
}
