package sub2;
/*
 * date : 2020/05/21
 * name : ������
 * content : �ڹ� ���� ����� �ǽ��ϱ� p1018 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {
	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		try {
			FileInputStream fis = new FileInputStream(file);
			int value = 0;
			
			while(true) {
				
				value = fis.read();
				
				if(value == -1) {
					//�� �̻� ���� �����Ͱ� ���� ���
					break;
				}
				char c = (char) value;
				//���ڷ� �о��ȱ� ������ ĳ�����ؼ� ���ڷ� �ٲ���� �Ѵ�.
				System.out.print(c);
			}
			//�Է� ��Ʈ�� ����
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}// catch(IOException e) {
			//fis.read�� ���ܸ� ó�����ֱ� ���ؼ� �߰� �ƴϸ� execption�� ����� ��� ���� �ѹ��� ó�� ����
			//e.printStackTrace();}
		System.out.println("\n���α׷� ����....");
	}
	

}
