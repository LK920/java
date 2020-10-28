package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {
		//무작위 숫자를 넣을 set 콜렉션
		//set은 중복값 허용 하지 않기때문
		Set<Integer> set = new HashSet<>();
		//set 사이즈가 6보다 작을때까지 랜덤 숫자 넣기
		while(set.size()<6) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}	
		
		List<Integer> list = new ArrayList<>(set);
		
		//컬렉션 정렬
		Collections.sort(list);
		//출력
		System.out.println(list);
		
	}

}
