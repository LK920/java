package sub1;
/*
 * date : 2020/05/19
 * name : ������
 * content : Thread Ŭ���� �ǽ��ϱ� ���� p576
 * 
 * Thread
 * - �ϳ��� ���μ������� ����Ǵ� ���� �帧
 * - ���α׷��� ����ɶ� �����ϴ� ���� �帧
 * - Thread Ŭ������ ��ӹ޾� start() �޼���� ���꽺���� ����
 * 
 */
public class ThreadTest {
	public static void main (String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("sub1");
		SubThread sub2 = new SubThread("sub2");
		
		//�񵿱� (Asyncronize) ������� ����
		sub1.start();//���� ����
		sub2.start();//���� ����
		
		for(int i =1 ; i <=10 ; i++) {
			
			Thread.sleep(1000);
			System.out.println("Main Thread ����...");
		}
		System.out.println("M"
				+ "ain Thread ����...");
		
		
		
		
		
		
		
		
		
	}

}
