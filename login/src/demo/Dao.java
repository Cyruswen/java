package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
//dao�� ��װ������
public class Dao {
	Statement stat;
	public Dao(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/testdb", "root","123456");
			//����һ�������� ---���ݵ�����
			stat = conn.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//��ȡ����
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
				JOptionPane.showMessageDialog(null,"ע��ɹ������¼��");
			}else{
				//ErrorFrame error = new ErrorFrame();
				JOptionPane.showMessageDialog(null,"���û��Ѵ���,ע��ʧ�ܣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//ErrorFrame error = new ErrorFrame();
			JOptionPane.showMessageDialog(null,"���û��Ѵ���,ע��ʧ�ܣ�");
		}
		
	}
	
	public ResultSet getSet(String id, String pwd){
		//�ж��û����������Ƿ���ȷ
		String sql = "select * from user where username='"+id+"'";
		ResultSet set;
		try {
			set = stat.executeQuery(sql);
			return set;
			//��ѯ���Ϊ�գ�����0
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
