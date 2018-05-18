package demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Service {
	Dao dao = new Dao();
	
	public void regist(String id, String pwd){
		dao.insert(id, pwd);
	}
	
	public void login(String id, String pwd){
		ResultSet set;
		//获取查询结果
		set = dao.getSet(id, pwd);
		
		try {
			if(set.next() == false){
				JOptionPane.showMessageDialog(null, "用户名或密码错误，请重新输入！");
			}
			String username = set.getString("username");
			String password = set.getString("password");
			//比较输入的值与数据库中的值是否相等
			if(username.equals(id) && password.equals(pwd)){
				LoginSuccessFrame success = new LoginSuccessFrame(username);
			}else{
				JOptionPane.showMessageDialog(null,"用户名或密码错误，请重新输入！");
				//ErrorFrame error = new ErrorFrame();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//ErrorFrame error = new ErrorFrame();
		}
	}
	
	public void update(String newpassword,String name){
		dao.updateTable(newpassword, name);
	}
	
	/*public void delete(){
		
	}*/

}
