package sub4;

import java.io.FileReader;
import java.util.Properties;

/*
 * date : 2020/05/21
 * name : 강래구
 * content : 프로퍼티 컬렉션 실습하기 p748
 */
public class PropertyTest {
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.setProperty("101", "서울");
		prop.setProperty("102", "대전");
		prop.setProperty("103", "대구");
		prop.setProperty("104", "부산");
		prop.setProperty("105", "광주");
		
		System.out.println("101번 데이터 : "+prop.getProperty("101"));
		System.out.println("102번 데이터 : "+prop.getProperty("102"));
		
		//스트림을 통한 데이터 입력
		String file = "C:\\Users\\bigdata\\Desktop\\country.properties";
		
		FileReader fr = new FileReader(file);
		Properties country = new Properties();
		country.load(fr);
		
		System.out.println("101번 나라:"+country.getProperty("101"));
		System.out.println("102번 나라:"+country.getProperty("102"));
	}
}
