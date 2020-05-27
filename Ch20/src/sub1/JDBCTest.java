package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * date : 2020/05/26
 * name : 강래구
 * content : JDBC 실습하기
 */

public class JDBCTest {
	public static void main(String[] args) throws Exception {
		
		//DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/krg";
		String user = "krg";
		String pass = "1234";
		
		//1단계 - JDBC 드라이버 동적로드 :자바와 db사이에 드라이버 설치한다.
		Class.forName("com.mysql.jdbc.Driver"); //드라이버클래스를 메모리에 올리는것
		//2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		if(conn != null) {
			System.out.println("데이터베이스 접속 성공!");
		}
		
		//3단계
		//4단계
		//5단계
		
		//6단계 - 데이터베이스 접속종료
		conn.close();
		
	}

}
