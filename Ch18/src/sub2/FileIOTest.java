package sub2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * date : 2020/05/21
 * name : ������
 * content : �ڹ� ���� ����� �ǽ��ϱ� p1018 
 */
public class FileIOTest {
	public static void main(String[] args) throws Exception {
		
		String originfile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetfile = "C:\\Users\\bigdata\\Desktop\\target.jpg";
		//����ȭ�鿡 ��� ��ų ������ ���� ��� �Է�
		
		FileInputStream fis =  new FileInputStream(originfile);
		FileOutputStream fos = new FileOutputStream(targetfile);
		
		int value = 0;
		//�����͸� �ӽ÷� ���� value ����
		
		while(true) {
			//inputstream���� �����͸� �о���̱�
			value = fis.read();
			if(value == -1) {
				//-1�� �����Ͱ� ���ٴ� ����
				break;
			}
			//outputstream ���� ������ ��������
			fos.write(value);
		}
		//��Ʈ�� ����(����� �ڿ� �ݳ�)
		fis.close();
		fos.close();
		
		System.out.println("���α׷� ����..");
	}
}













