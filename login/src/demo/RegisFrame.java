package demo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisFrame extends JFrame {
	JTextField text1;
	JPasswordField text2;
	Service service = new Service();
	public RegisFrame(){
		init();
	}
	
	public void init(){
		this.setTitle("注册窗口");
		this.setContentPane(createContenPane());
		this.setLocation(312,234);
		this.setSize(400,300);
		this.setVisible(true);
	}
	
	public JPanel createContenPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		Font font = new Font("黑体",Font.BOLD,22);
		JLabel label = new JLabel("登录界面",JLabel.CENTER);
		label.setFont(font);
		panel.add(BorderLayout.NORTH,label);
		//panel.setBackground(Color.blue);
		panel.add(BorderLayout.CENTER,createCenterPane());
		panel.add(BorderLayout.SOUTH,createSouthPane());
		
		return panel;
	}
	
	public JPanel createSouthPane(){
		JPanel panel = new JPanel();
		JButton b1 = new JButton("注册");
		JButton b2 = new JButton("登录");
		JButton b3 = new JButton("取消");
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String id = text1.getText();
				String pwd = text2.getText();
				
				service.regist(id, pwd);
				//System.out.println("id: "+id+" pwd: "+pwd);
				//String sql = "insert into user values('"+id+"','"+pwd+"')";
				//insertToDatabase(sql);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg1) {
				// TODO Auto-generated method stub
				String id = text1.getText();
				String pwd = text2.getText();
				service.login(id, pwd);
			}
		});
		
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg2) {
				// TODO Auto-generated method stub
				System.exit(0);
				}
		});
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		return panel;
	}
	
	public JPanel createCenterPane(){
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel label1 = new JLabel("用户名：");
		JLabel label2 = new JLabel("密码：");
		label1.setSize(90, 30);
		label2.setSize(90, 30);
		label1.setLocation(55, 50);
		label2.setLocation(55, 100);
		text1 = new JTextField();
		text2 = new JPasswordField();
		text1.setSize(150, 30);
		text2.setSize(150, 30);
		text1.setLocation(130, 50);
		text2.setLocation(130, 100);
		//panel.setBackground(Color.blue);
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		
		//添加用户名和密码
		return panel;
	}
	
	/*public JPanel createIpg(){
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		Icon image = new ImageIcon("src/dwmo/city2.jpg");
		JLabel label = new JLabel(image);
		panel.add(BorderLayout.CENTER,label);
		panel.add(BorderLayout.SOUTH,createCenterPane());
		return panel;
	}*/
	
	//打印表
	public void printTable(ResultSet set){
		try {
			while(set.next()){
				String username = set.getString("username");
				String password = set.getString("password");
				//String dcity = set.getString("");
				System.out.println(username+" "+password+" ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}