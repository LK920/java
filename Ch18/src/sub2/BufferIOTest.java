package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * date : 2020/05/21
 * name : 강래구
 * content : 자바 파일 입출력 실습하기 p1018 
 */
public class BufferIOTest {
	public static void main(String[] args) throws Exception {
		
		String originfile = "C:\\Users\\bigdata\\Desktop\\img\\sea.jpg";
		String targetfile = "C:\\Users\\bigdata\\Desktop\\img\\target.jpg";
		//바탕화면에 출력 시킬 가상의 파일 경로 입력
		//기본 스트림
		FileInputStream fis =  new FileInputStream(originfile);
		FileOutputStream fos = new FileOutputStream(targetfile);
		
		//버퍼스트림 생성 및 연결
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int value = 0;
		//데이터를 임시로 받을 value 지정
		
		while(true) {
			//inputstream으로 데이터를 읽어들이기
			value = bis.read();
			if(value == -1) {
				//-1은 데이터가 없다는 말임
				break;
			}
			//outputstream 으로 데이터 내보내기
			bos.write(value);
		}
		//스트림 해제
		bis.close();
		bos.close();
		fis.close();
		fos.close();
		System.out.println("프로그램 종료..");
	}
}
