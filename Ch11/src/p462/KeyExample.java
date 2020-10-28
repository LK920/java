package p462;

import java.util.HashMap;

import p461.Key;

public class KeyExample {
	public static void main(String[] args) {
		//key 객체를 식별키로 사용해서 String 값을 저장하는 hashmap 객체 생성
		HashMap<Key, String> hashmap = new HashMap<>();
		
		//식별키 "new Key(1)"로 홍길동을 저장함
		hashmap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)"로 홍길동을 읽어옴
		String value = hashmap.get(new Key(1));
		System.out.println(value);
	}

}
