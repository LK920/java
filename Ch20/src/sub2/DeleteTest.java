package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * date : 2020/05/26
 * name : ������
 * content : JDBC Delete �ǽ��ϱ�
 */
public class DeleteTest {
	public static void main(String[] args) throws Exception {
		//DB����
		String host = "jdbc:mysql://192.168.44.7:3306/krg";
		String user = "krg";
		String pass = "1234";
		//1�ܰ� - jdbc ����̺� �����ε�
		Class.forName("com.mysql.jdbc.Driver");
		//2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host,user,pass);
		//3�ܰ� - sql ���ఴü ����
		Statement stmt = conn.createStatement();
		
		//4�ܰ� - sql ����
		String sql = "DELETE FROM `USER1` WHERE `uid`='J101'";
		stmt.executeUpdate(sql);
		//5�ܰ� - �����ó��(select�� ���)
		//6�ܰ� - �����ͺ��̽� ����
		conn.close();
		System.out.println("delete ���� �Ϸ�....");
	}

}
