package sub2;
/*
 * date : 2020/05/21
 * name : 강래구
 * content : 자바 파일 입출력 실습하기 p1018 
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
					//더 이상 읽을 데이터가 없을 경우
					break;
				}
				char c = (char) value;
				//숫자로 읽어드렸기 때문에 캐스팅해서 문자로 바꿔줘야 한다.
				System.out.print(c);
			}
			//입력 스트림 해제
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}// catch(IOException e) {
			//fis.read의 예외를 처리해주기 위해서 추가 아니면 execption을 사용해 모든 예외 한번에 처리 가능
			//e.printStackTrace();}
		System.out.println("\n프로그램 종료....");
	}
	

}
