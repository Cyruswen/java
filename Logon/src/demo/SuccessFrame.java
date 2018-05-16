package demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SuccessFrame extends JFrame{
	public SuccessFrame(){
		init();
	}
	public void init(){
		this.setTitle("³É¹¦");
		this.setContentPane(createContenPane());
		this.setLocation(600,120);
		this.setSize(300,200);
		this.setVisible(true);
	}
	public JPanel createContenPane(){
		JPanel panel = new JPanel();
		panel.setLayout(null);
		Font font = new Font("ºÚÌå",Font.BOLD,12);
	JLabel label = new JLabel("Successful£¡",JLabel.CENTER);
		label.setFont(font);
		label.setSize(90,50);
		label.setLocation(100, 50);
		panel.add(label);
		
		
		return panel;
		
	}
}
