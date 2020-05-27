package test09;
/*
 * date : 2020/05/13
 * name : 강래구
 * content : 추상클래스, 다형성 연습문제
 */
public class JavaTest9 {
	
	public static void main(String[] args) {
		
		JavaTest9 here = new JavaTest9();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	
	public void draw(Shape obj) {
		obj.draw();
	}

}
