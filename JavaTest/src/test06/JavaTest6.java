package test06;
/*
 * ��¥ : 2020/05/01
 * �̸� : ������
 * ���� : �ڹ� ������ ��������
 */
public class JavaTest6 {
	public static void main(String[] args) {
		
		int num = 0;
		int result;
		// �ڿ� ���� ++/--�� �ش� ������ �Ѿ�鼭 ����/�����Ѵ�. 
		// �տ� ���� ++/--�� �ش� ���忡�� ����/�����Ѵ�.
		
		result = num++; // ���� num�� 0 
		System.out.println("result : "+result);
		
		result = ++num; //�Ѿ�� num �� 1 �̰� ++num���� ���� �ش� ���忡�� 1�� �� �����ؼ� num = 2
		System.out.println("result : "+result);
		
		result = num--;//num�� 2�� ���� �״�� ����ä ���� �������� �Ѿ�� -1�� �ȴ�.
		System.out.println("result : "+result);
		
		result = --num;//�Ѿ�� num�� -1�� �� 1�̸� --num���� ���� �ش� ���忡�� �ѹ��� -1�� �Ǿ� 0�� ��
		System.out.println("result : "+result);
	}

}
