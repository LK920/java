package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * date : 2020/05/26
 * name : ������
 * content : JDBC �ǽ��ϱ�
 */

public class JDBCTest {
	public static void main(String[] args) throws Exception {
		
		//DB����
		String host = "jdbc:mysql://192.168.44.7:3306/krg";
		String user = "krg";
		String pass = "1234";
		
		//1�ܰ� - JDBC ����̹� �����ε� :�ڹٿ� db���̿� ����̹� ��ġ�Ѵ�.
		Class.forName("com.mysql.jdbc.Driver"); //����̹�Ŭ������ �޸𸮿� �ø��°�
		//2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		if(conn != null) {
			System.out.println("�����ͺ��̽� ���� ����!");
		}
		
		//3�ܰ�
		//4�ܰ�
		//5�ܰ�
		
		//6�ܰ� - �����ͺ��̽� ��������
		conn.close();
		
	}

}
