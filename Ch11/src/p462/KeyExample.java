package p462;

import java.util.HashMap;

import p461.Key;

public class KeyExample {
	public static void main(String[] args) {
		//key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� hashmap ��ü ����
		HashMap<Key, String> hashmap = new HashMap<>();
		
		//�ĺ�Ű "new Key(1)"�� ȫ�浿�� ������
		hashmap.put(new Key(1), "ȫ�浿");
		
		//�ĺ�Ű "new Key(1)"�� ȫ�浿�� �о��
		String value = hashmap.get(new Key(1));
		System.out.println(value);
	}

}
