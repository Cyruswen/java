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
		//��ȡ��ѯ���
		set = dao.getSet(id, pwd);
		
		try {
			if(set.next() == false){
				JOptionPane.showMessageDialog(null, "�û���������������������룡");
			}
			String username = set.getString("username");
			String password = set.getString("password");
			//�Ƚ������ֵ�����ݿ��е�ֵ�Ƿ����
			if(username.equals(id) && password.equals(pwd)){
				LoginSuccessFrame success = new LoginSuccessFrame(username);
			}else{
				JOptionPane.showMessageDialog(null,"�û���������������������룡");
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
