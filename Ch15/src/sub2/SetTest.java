package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * date : 2020/05/20
 * name : 강래구
 * content : 콜렉션 프레임워크(Set) 실습하기 p724
 */
public class SetTest {
	public static void main(String[] args) {
		
		Set<Double> set = new HashSet<>();
		
		set.add(1.1);
		set.add(1.12);
		set.add(1.3);
		set.add(1.1); //해쉬넷은 중복이 안되서 1.1 하나는 누락된다.
		set.add(0.15);
		
		System.out.println("원소 갯수 : "+set.size());
		
		//본복자를 이용한 집합원소 출력
		Iterator<Double> iter = set.iterator(); 
		
		while(iter.hasNext()) {
			System.out.println("원소 : "+iter.next());
		}
		
		
		
	}

}
