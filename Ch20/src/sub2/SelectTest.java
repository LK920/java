package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * date : 2020/05/26
 * name : 강래구
 * content : JDBC Select 실습하기
 */
public class SelectTest {
	public static void main(String[] args) throws Exception {
		//DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/krg";
		String user = "krg";
		String pass = "1234";
		//1단계 - jdbc 드라이브 동적로드
		Class.forName("com.mysql.jdbc.Driver");
		
		//2단계 - 데이버 베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		//3단계 - sql객체 생성
		Statement stmt = conn.createStatement();
		//4단계 - sql 실행
		String sql = "SELECT * FROM `USER1` ";
		ResultSet rs = stmt.executeQuery(sql); //결과를 받아와야해서
		//5단계 - 결과셋 처리(SELECT)
			while(rs.next()) {
				System.out.println("========================");
				System.out.println("아이디: "+rs.getString(1));
				System.out.println("이름: "+rs.getString(2));
				System.out.println("휴대전화: "+rs.getString(3));
				System.out.println("나이: "+rs.getInt(4));
				
			}
		//6단계 - 데이터베이스 종료
		conn.close();
	}

}
