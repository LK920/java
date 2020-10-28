package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * date : 2020/05/21
 * name : ������
 * content : �ڹ� ���� ����� �ǽ��ϱ� p1018 
 */
public class BufferIOTest {
	public static void main(String[] args) throws Exception {
		
		String originfile = "C:\\Users\\bigdata\\Desktop\\img\\sea.jpg";
		String targetfile = "C:\\Users\\bigdata\\Desktop\\img\\target.jpg";
		//����ȭ�鿡 ��� ��ų ������ ���� ��� �Է�
		//�⺻ ��Ʈ��
		FileInputStream fis =  new FileInputStream(originfile);
		FileOutputStream fos = new FileOutputStream(targetfile);
		
		//���۽�Ʈ�� ���� �� ����
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int value = 0;
		//�����͸� �ӽ÷� ���� value ����
		
		while(true) {
			//inputstream���� �����͸� �о���̱�
			value = bis.read();
			if(value == -1) {
				//-1�� �����Ͱ� ���ٴ� ����
				break;
			}
			//outputstream ���� ������ ��������
			bos.write(value);
		}
		//��Ʈ�� ����
		bis.close();
		bos.close();
		fis.close();
		fos.close();
		System.out.println("���α׷� ����..");
	}
}
