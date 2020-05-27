package sub2;

import java.util.Set;
import java.util.TreeSet;

/*
 * date : 2020/05/20
 * name : 강래구
 * content : 콜렉션 프레임워크(Set) 실습하기 p724
 */
public class TreeSetTest {
	public static void main(String[] args) {
		//TreeSet 생성 및 숫자 데이터 저장
		Set<Integer> tree = new TreeSet<>();
		tree.add(23);
		tree.add(10);
		tree.add(48);
		tree.add(15);
		tree.add(7);
		tree.add(22);
		tree.add(56);
		
		for(int num : tree) {
			System.out.print(num+", ");
		}
	}
}
