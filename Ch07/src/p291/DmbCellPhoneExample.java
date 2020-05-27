package p291;

import p290.DmbCellPhone;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//dmbcellphone 객체 생성
		DmbCellPhone dmbCellphone = new DmbCellPhone("자바폰", "검정", 10);
		
		//Cellphone 으로부터 상속받은 필드
		System.out.println("모델: "+dmbCellphone.model);
		System.out.println("색상: "+dmbCellphone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널: "+dmbCellphone.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요.");
		dmbCellphone.recieveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellphone.sendVoice("아~ 예 반갑습니다.");
		dmbCellphone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
		
		
	}

}
