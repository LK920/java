package test08;
/*
 * date : 2020/05/13
 * name : 강래구
 * content : 다형성 연습문제
 */
public class JavaTest8 {
	public static void main(String[] args) {
		
		Product p1 = new Television("가전", 100);
		Product p2 = new Computer("컴퓨터", 150);
		
		p1.info();
		p2.info();
	}

}
