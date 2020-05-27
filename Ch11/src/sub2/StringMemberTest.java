package sub2;
/*
 * date : 2020/05/18
 * name : ������
 * content : String ��� �ǽ��ϱ�  p5
 * 
 */
public class StringMemberTest {
	public static void main(String[] args) {
		String str = "Hello Korea";
		
		//length - ���ڿ��� ����(���ڰ���)
		System.out.println("str ���ڿ� ���� : "+str.length());
		
		//charAt - ���ڿ����� Ư������ ����
		System.out.println("str�� 6��° ����:"+str.charAt(6));
		
		//substring - ���ڿ� �ڸ���
		System.out.println("str�� 0������ 5������ ���ڿ� :"+str.substring(0,5));
		System.out.println("str�� 6������ ���������� ���ڿ� :"+str.substring(6));
		
		//indexOf, lastIndexOf -
		int idx1 = str.indexOf("e"); //-���ڿ� �տ������� ã�°�
		int idx2 = str.lastIndexOf("e"); //-ã�� ���ڿ��� ������ ��ġ�� ���ڿ� �ڿ��� ���� ã�°�
		System.out.println("���ڿ� str���� ���� e�� �ε����� : "+idx1);
		System.out.println("���ڿ� str���� ���� e�� �ε����� : "+idx2);
		
		//replace 
		String newStr = str.replace("Korea", "Busan");
		System.out.println("newStr : "+newStr);
		
		//valueOf - �Ϲ�Ÿ�� ������ ���ڿ��� ���� 
		int     var1 = 1;
		double  var2 = 2.12;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);;
		String s3 = ""+var3;
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		
	}

}
