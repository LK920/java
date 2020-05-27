package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * date : 2020/05/26
 * name : 강래구
 * content : JDBC Update 실습하기
 */
public class UpdateTest {
	public static void main(String[] args) {
			//DB정보
			String host = "jdbc:mysql://192.168.44.7:3306/krg";
			String user = "krg";
			String pass = "1234";
			
			Connection conn = null;
			
			try {
				//1단계 - jdbc 드라이버 동적로드
				Class.forName("com.mysql.jdbc.Driver");
				//2단계 - 데이터베이스 접속
				conn = DriverManager.getConnection(host, user, pass);
					
				//3단계 - SQL실행객체 생성
				Statement stmt = conn.createStatement();
				
				//4단계 - SQL 실행
				String sql = "UPDATE `USER1` SET `HP`='010-1111-1111' ";
						sql += "WHERE `uid` = 'j101'";
					//where문과 update문 사이에 한칸 공백있어야한다.
						
				stmt.executeUpdate(sql);
				//5단계 - 결과셋(ResultSet) 처리(SELECT 일 경우)
				
				//6단계 - 데이터베이스 종료(해제)
				conn.close();
			} catch (Exception e) {
				System.out.println("쿼리문 실행에 문제가 발생했습니다.");
			}
			System.out.println("UPDATE 완료...");
	}
}
