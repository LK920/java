package sub2;
/*
 * date : 2020/04/29
 * name : ������
 * content : ������ �ڷ���(������ Ÿ��) �ǽ��ϱ�
 * 
 */
public class DataTypeTest {
	
	public static void main(String[] args) {
		
		
		//������ ������ ũ�� ���� byte���� long���� �� ���� ������ ������ Ŀ��
		byte var1 =1; //�ִ�127������ ���� 
		short var2 =2; 
		int var3 = 3; //�ִ� 2147483647���� ���� ��ư �̰� �߽���
		long var4 = 4;
 
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		
		//�Ǽ��� float�� ���̻� f�� �� �ٿ����� ���� �Ҽ����� 8�ڸ����� �ݿø��Ͽ� 7�ڸ� �ۿ� �ȳ��´�.	
		
		float var5 = 1.123456789f;
		double var6 = 1.123456789;
		
		System.out.println("var5 :"+var5);
		System.out.println("var6 :"+var6);
		
		//����
		
		boolean var7= true;
		boolean var8 = false;
		System.out.println("var7 :"+var7);
		System.out.println("var8 :"+var8);
				
		//������
		
		char ch1 = 'A';
		char ch2 = '��';
		
		System.out.println("ch1 ="+ch1);
		System.out.println("ch2 ="+ch2);
		
		
		//���ڿ�(�ܾ�)
		String str1 = "A";
		String str2 = "hello";
		String str3 = "�ȳ�!";
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		
	}

}
