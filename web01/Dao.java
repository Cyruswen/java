package com.kaikai;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	Statement stat;
	public int  insert(String id, String name, String pwd, String sex){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/testdb", "root","123456");
			//����һ�������� ---���ݵ�����
			stat = conn.createStatement();
			String sql = "insert into regist values('"+id+"','"+name+"','"+pwd+"','"+sex+"')";
			int n;
			n = stat.executeUpdate(sql);
			conn.close();
			return n;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		//��ȡ����
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
}
