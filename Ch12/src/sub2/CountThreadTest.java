package sub2;

/**
 * date : 2020/05/19
 * name : ������
 * content : Thread Ȱ�� �ǽ��ϱ� ���� p576
 * 
 */ 
public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThead ct1 = new CountThead(count);
		CountThead ct2 = new CountThead(count);
		CountThead ct3 = new CountThead(count);
		
		ct1.start();
		ct2.start();
		ct3.start();//��� �������� ���� �߻�
		
		//���ξ����忡�� �Ļ��� ���꽺������ �۾��� �Ϸ�� �� �ٽ� ���ξ������ �շ��Ǵ� ���� ����
		//join �� ��������� ����� ���ν����尡 ��ٸ��ٰ� �շ���Ű�� ����
		ct1.join();
		ct2.join();
		ct3.join(); 
		
		//���������� �������ؼ� count �ȿ� �ִ� setnum �տ� syncronized�� �Է��Ͽ� 
		//��������� ���ÿ� ������ ���� ���´�.
		
		System.out.println("��� : "+count.getNum());
	}
	
	

}
