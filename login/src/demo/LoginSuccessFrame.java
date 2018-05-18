package demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class LoginSuccessFrame extends JFrame{
	String name1;
	
	public LoginSuccessFrame(String _name){
		init();
		this.name1 = _name;
	}
	
	public void init(){
		this.setTitle("登录成功");
		this.setContentPane(createContenPane());
		this.setLocation(600,120);
		this.setSize(400,300);
		this.setVisible(true);
	}
	
	public JPanel createContenPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		Font font = new Font("黑体",Font.BOLD,20);
		JLabel label = new JLabel("登录成功",JLabel.CENTER);
		label.setForeground(Color.black);
		label.setFont(font);
		//label.setSize(90,50);
		//label.setLocation(100, 50);
		panel.add(BorderLayout.SOUTH,createSouthPane());
		panel.add(label);
		return panel;
	}
	
	public JPanel createSouthPane(){
		JPanel panel = new JPanel();
		JButton b5 = new JButton("修改密码");
		//b5.setSize(10, 30);
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ChangePwdFrame changepwdframe = new ChangePwdFrame(name1);
				dispose();
			}
		});
		panel.add(b5);
		
		return panel;
		
	}
}


