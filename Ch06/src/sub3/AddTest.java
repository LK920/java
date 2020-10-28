package sub3;
/*
 * date : 2020/05/07
 * name : 강래구
 * content : 객체 메모리 생성 실습하기
 */
public class AddTest {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30};
		Adder a =new Adder(100);
		//x = 100
		a.add(100);
		System.out.println("객체 a의 멤버 x : "+a.getX());
		//x = 150
		a.add(a);
		System.out.println("객체 a의 멤버 x : "+a.getX());
		//x = 190
		a.add(arr);
		System.out.println("배열 arr의 1번째 원소 :"+arr[0]);
		//arr[0] = 11
		a = a.addNew(a);
		System.out.println("객체 a의 멤버 x : "+a.getX());
		//x=1
		
	}
}
