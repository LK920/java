package sub3;

import java.io.FileInputStream;

/*
 * date : 2020/05/21
 * name : ������
 * content : ���� ����� ��Ʈ�� �ǽ��ϱ� p1032
 */
public class ReaderTest {
	public static void main(String[] args) {
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
	
		try {
			FileInputStream fr = new FileInputStream(file);
			int value = 0;
			
			while(true) {
				
				value = fr.read();
				
				if(value == -1) {
					break;
				}
				char c = (char) value;
				System.out.print(c);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		System.out.println("\n���α׷� ����....");
	}
	}}

