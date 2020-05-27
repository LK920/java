package p333;

import p332.Phone;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
