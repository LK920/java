package sub3;
/*
 * date : 2020/05/13
 * name : ������
 * content : �������̽� �ǽ��ϱ� 3
 */
public class InterfaceTest3 {
	public static void main(String[] args) {
		//�������̽� ���� : ��ü���� ���յ��� ���ߴ� ����(�����ϰ���)
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
	}

}
