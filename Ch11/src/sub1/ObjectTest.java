package sub1;
/*
 * date : 2020/05/18
 * name : ������
 * content : Object Ŭ���� �ǽ��ϱ� ���� p457
 * 
 * Object Ŭ����
 * - �ڹ��� �ֻ��� Ŭ����
 * - ��� Ŭ������ �θ� Ŭ������ ������ ���뿡 Ȱ��ȴ�.
 */

public class ObjectTest {
	public static void main(String[] args) {
		
		Object obj1 = new Apple("�ѱ�", 3000);
		Object obj2 = new Apple("�Ϻ�", 3000);
		Object obj3 = new Banana("�븸", 2500);
		Object obj4 = new Banana("�߱�", 2500);
		
		//toString �޼��带 �������ϸ� �ٿ�ĳ���� X
		obj1.toString(); //apple
		//obj3.info();
		
		//�ٿ�ĳ����(������Ʈ Ŭ�������� �ڽ� �޼��带 ���޾ƿͼ� ����)
		Apple a1 = (Apple) obj1; 
		Banana b1 = (Banana) obj3;
		
		a1.info();
		b1.info();
		
		//�������� Ȱ��Ǵ� ObjectŬ����
		Object fruit[] = {obj1, obj2, obj3, obj4};// Ÿ���� �����̳� �ٳ����� �ϸ� ������ ����. �θ�Ŭ������ �Է�������ϴµ� ���� ������ �ȵǾ��ֱ⿡ �ڵ����� �ִ� objectŬ������ ���
		
		Apple a2 = (Apple) fruit[1];
		Banana b2 = (Banana) fruit[3];
		
		a2.info();
		b2.info();
	
	}

}
