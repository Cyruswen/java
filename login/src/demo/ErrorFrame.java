package demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ErrorFrame extends JFrame{
	public ErrorFrame(){
		init();
	}
	public void init(){
		this.setTitle("ע��ʧ��");
		this.setContentPane(createContenPane());
		this.setLocation(600,120);
		this.setSize(300,200);
		this.setVisible(true);
	}
	public JPanel createContenPane(){
		JPanel panel = new JPanel();
		panel.setLayout(null);
		Font font = new Font("����",Font.BOLD,20);
		JLabel label = new JLabel("ERROR������",JLabel.CENTER);
		label.setForeground(Color.red);
		label.setFont(font);
		label.setSize(90,50);
		label.setLocation(100, 50);
		panel.add(label);
		
		
		return panel;
		
	}
}
