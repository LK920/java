package sub1;
/*
 * date : 2020/05/13
 * name : ������
 * content : �������̽� �ǽ��ϱ� p344
 */
public class InterfaceTest1 {
	
	public static void main(String[] args) {
		//�������̽� ���� : Ŭ���� ������ ǥ�� ���̵� ����
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chDown();
		samsung.soundUp();
	}
}
