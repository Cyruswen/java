package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
//dao层 封装的数据
public class Dao {
	Statement stat;
	public Dao(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/testdb", "root","123456");
			//创建一个语句对象 ---数据的载体
			stat = conn.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//获取连接
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void insert(String id, String pwd){
		String sql = "insert into user values('"+id+"','"+pwd+"')";
		int n;
		try {
			n = stat.executeUpdate(sql);
			if(n > 0){
				JOptionPane.showMessageDialog(null,"注册成功，请登录！");
			}else{
				//ErrorFrame error = new ErrorFrame();
				JOptionPane.showMessageDialog(null,"该用户已存在,注册失败！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//ErrorFrame error = new ErrorFrame();
			JOptionPane.showMessageDialog(null,"该用户已存在,注册失败！");
		}
		
	}
	
	public ResultSet getSet(String id, String pwd){
		//判断用户名，密码是否正确
		String sql = "select * from user where username='"+id+"'";
		ResultSet set;
		try {
			set = stat.executeQuery(sql);
			return set;
			//查询结果为空，返回0
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			ErrorFrame error = new ErrorFrame();
			return null;	
		}	
	}
	
	/*public void select(){
		
	}*/
	
	public void updateTable(String newpassword,String username){
		String sql = "update user set password='"+newpassword+"' where username='"+username+"'";
		int n;
		try {
			//System.out.println("1");
			n = stat.executeUpdate(sql);
			//System.out.println(n);
			if(n > 0){
				RegisFrame regisframe = new RegisFrame();
				regisframe.text1.setText(username);
				
			}else{
				ErrorFrame error = new ErrorFrame();
				//System.out.println("error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			ErrorFrame error = new ErrorFrame();
		}

		
	}
	
	/*public void delete(){
		
	}*/
}
