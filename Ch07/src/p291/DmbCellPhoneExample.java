package p291;

import p290.DmbCellPhone;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//dmbcellphone ��ü ����
		DmbCellPhone dmbCellphone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//Cellphone ���κ��� ��ӹ��� �ʵ�
		System.out.println("��: "+dmbCellphone.model);
		System.out.println("����: "+dmbCellphone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä��: "+dmbCellphone.channel);
		
		//CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("��������.");
		dmbCellphone.recieveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dmbCellphone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellphone.hangUp();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
		
		
	}

}
