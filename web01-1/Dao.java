package com.kaikai;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Dao {
	Statement stat;
	
	public int  insert(String id, String name, String pwd, String sex){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/testdb", "root","123456");
			//创建一个语句对象 ---数据的载体
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
		//获取连接
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
	
	public ArrayList<Employee> findAll(){
		ArrayList<Employee>  es = new ArrayList<Employee>();
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection  conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/testdb", "root", "123456");
			Statement  state = conn.createStatement();
			ResultSet   rs = state.executeQuery("select * from emp");
			while (rs.next()) {
				int  eno =  rs.getInt("eno");
				String ename = rs.getString("ename");
				String job   = rs.getString("job");
				double  salary = rs.getDouble("salary");
				Employee  e = new  Employee(eno, ename, job, salary, 20);
				es.add(e);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  es;
	}
	
	public int addEmp(String name, String salary, String age, String job, String node){
		
		 int n;
		 String sql = "insert into employee values('"+name+"','"+salary+"','"+age+"','"+job+"','"+node+"')";
		 try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection  conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb", "root", "123456");
				Statement  state = conn.createStatement();
				n = state.executeUpdate(sql);
				conn.close();
				return n;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -1;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -1;
			}
	}
}
