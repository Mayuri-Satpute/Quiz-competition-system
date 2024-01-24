package com.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener {
	 String name;
	 JButton start,back;
	Rules(String name)
	 {
		 this.name=name;
		 getContentPane().setBackground(Color.white);
		 setLayout(null);
		 
		 JLabel heading=new JLabel("Welcome " +name + " to Simple Minds");
	   	  heading.setBounds(50,20,700,30);
	   	  heading.setFont(new Font("Viner Hand ITC",Font.BOLD,25));
	   	  heading.setForeground(new Color(30,144,254));
	   	  add(heading);
	   	  
	   	 JLabel rules=new JLabel();
	   	  rules.setBounds(30,90,700,350);
	   	 rules.setFont(new Font("Tohama",Font.PLAIN,18));
	   	 
	   	 rules.setText(
	   			 "<html>"+ 
	   	                "1. each question have 10 marks "+"<br><br>"+
	   	                "2. time for each question 20 second" + "<br><br>" +
	   	                "3. You have options for all the questions" + "<br><br>" +
	   	                "4.there is one 50-50 lifeline" + "<br><br>" +
	   	                "5. no negative marking (Be wise, not otherwise)" + "<br><br>" +
	   	                " best of luck" +
	   	               "<html>"
	   	);	 
	   	add(rules);
	   	
	   
	   	  
	   	  
	    back=new JButton("Back");//instance of jbutton
		back.setBounds(200, 430, 100, 30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		start=new JButton("start");//instance of jbutton
			start.setBounds(400, 430, 100, 25);
			start.setBackground(new Color(30,144,254));
			start.setForeground(Color.white);
			start.addActionListener(this);
			add(start);
		   	  
		
	   	  
		setSize(800,600);
		setLocation(200,100);
		setVisible(true);
		 
		 
		 
	 }

	 

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start)
		{
			 setVisible(false);
			new Quiz(name);
		}else
		{
			setVisible(false);
			new Login();
		}
		
	}
	public static void main (String args[])
	 {
		
		new Rules("user");
		
		 
		 
		 
	 }
	
	
	
	
}
