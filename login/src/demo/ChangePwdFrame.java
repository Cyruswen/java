package demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ChangePwdFrame extends JFrame{
	Service service = new Service();
	JPasswordField text3 = new JPasswordField();
	JPasswordField text4 = new JPasswordField();
	String name2;
	
	public ChangePwdFrame(String _name2) {
		this.name2 = _name2;
		init();
	}
	
	public void init() {
		this.setTitle("修改密码");
		this.setContentPane(createContenPane());
		this.setLocation(600,120);
		this.setSize(400,300);
		this.setVisible(true);
	}
	
	public JPanel createContenPane() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		Font font = new Font("黑体",Font.BOLD,22);
		JLabel label = new JLabel("修改密码",JLabel.CENTER);
		label.setFont(font);
		panel.add(BorderLayout.NORTH,label);
		panel.setBackground(Color.red);
		panel.add(BorderLayout.CENTER,createCenterPane());
		panel.add(BorderLayout.SOUTH,createSouthPane());
		
		return panel;
	}

	public JPanel createCenterPane() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel label1 = new JLabel("输入新密码:");
		JLabel label2 = new JLabel("请再次输入:");
		label1.setSize(90,30);
		label1.setLocation(55, 50);
		label2.setSize(90,30);
		label2.setLocation(55,100);
		text3.setSize(150, 30);
		text4.setSize(150, 30);
		text3.setLocation(130, 50);
		text4.setLocation(130, 100);
		panel.add(label1);
		panel.add(label2);
		panel.add(text3);
		panel.add(text4);
		return panel;
	}
	
	public JPanel createSouthPane() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JButton b5 = new JButton("确认");
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String pwd1 = text3.getText();
				String pwd2 = text4.getText();
				if(pwd1.isEmpty() || pwd2.isEmpty()) {
					JOptionPane.showMessageDialog(null,"密码不能为空，请输入!");
				}
				else if(pwd1.equals(pwd2)) {
					service.update(pwd1,name2);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null,"两次输入不匹配，请重新输入！");
					text3.setText(null);
					text4.setText(null);
				}
			}
		});
		panel.add(b5);
		return panel;
	}
}


