package sub3;
/*
 * date : 2020/05/07
 * name : ������
 * content : ��ü �޸� ���� �ǽ��ϱ�
 */
public class AddTest {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30};
		Adder a =new Adder(100);
		//x = 100
		a.add(100);
		System.out.println("��ü a�� ��� x : "+a.getX());
		//x = 150
		a.add(a);
		System.out.println("��ü a�� ��� x : "+a.getX());
		//x = 190
		a.add(arr);
		System.out.println("�迭 arr�� 1��° ���� :"+arr[0]);
		//arr[0] = 11
		a = a.addNew(a);
		System.out.println("��ü a�� ��� x : "+a.getX());
		//x=1
		
	}
}
