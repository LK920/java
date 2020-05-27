package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * date : 2020/05/20
 * name : ������
 * content : �ݷ��� �����ӿ�ũ(Set) �ǽ��ϱ� p724
 */
public class SetTest {
	public static void main(String[] args) {
		
		Set<Double> set = new HashSet<>();
		
		set.add(1.1);
		set.add(1.12);
		set.add(1.3);
		set.add(1.1); //�ؽ����� �ߺ��� �ȵǼ� 1.1 �ϳ��� �����ȴ�.
		set.add(0.15);
		
		System.out.println("���� ���� : "+set.size());
		
		//�����ڸ� �̿��� ���տ��� ���
		Iterator<Double> iter = set.iterator(); 
		
		while(iter.hasNext()) {
			System.out.println("���� : "+iter.next());
		}
		
		
		
	}

}
