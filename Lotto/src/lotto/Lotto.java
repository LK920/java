package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {
		//������ ���ڸ� ���� set �ݷ���
		//set�� �ߺ��� ��� ���� �ʱ⶧��
		Set<Integer> set = new HashSet<>();
		//set ����� 6���� ���������� ���� ���� �ֱ�
		while(set.size()<6) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}	
		
		List<Integer> list = new ArrayList<>(set);
		
		//�÷��� ����
		Collections.sort(list);
		//���
		System.out.println(list);
		
	}

}
