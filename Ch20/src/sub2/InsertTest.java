package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * date : 2020/05/26
 * name : ������
 * content : JDBC Insert �ǽ��ϱ�
 */
public class InsertTest {
	public static void main(String[] args) throws Exception{
		
		//DB����
		String host = "jdbc:mysql://192.168.44.7:3306/krg";
		String user = "krg";
		String pass = "1234";
		
		//1�ܰ� - jdbc ����̹� �����ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		//3�ܰ� - SQL���ఴü ����
		Statement stmt = conn.createStatement();
		
		//4�ܰ� - SQL ����
		String sql = "INSERT INTO `USER1`(`age`,`name`,`uid`,`hp`) VALUES(30,'��ö','J102','010-1111-3333')";
		stmt.executeUpdate(sql);
		
		//5�ܰ� - �����(ResultSet) ó��(SELECT �� ���)
		
		//6�ܰ� - �����ͺ��̽� ����(����)
		conn.close();
		
		System.out.println("INSERT �Ϸ�...");
		

	}
	

}
