package test06;
/*
 * date : 2020/05/13
 * name : 강래구
 * content : 클래스 상속 연습문제
 */

class rent{
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}
class Landload extends rent{
	public void getMoney() {
		System.out.println("건물주입니다.");
		payment();
		
	}
}

public class JavaTest6 {
	public static void main(String[] args) {
		
		Landload master = new Landload();
		master.getMoney();
	}

}
