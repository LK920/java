package sub2;

public class Count {
	private int num;
	
	public int getNum() {
		return num;
	}
	//����ȭ ��ϼ������� ����Ʈ�� ������ ���´�. public synchronized void�� �ص���
	public void setNum() {
		synchronized(this) {
			num++;	
		}
		
	}
}
