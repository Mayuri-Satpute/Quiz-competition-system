//package quiz_application;
package com.quiz;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 import java.awt.event.*;

import java.awt.*;

public class Login extends JFrame implements ActionListener {
	JButton rules,back;
	JTextField tfname;
  private static final LayoutManager Null = null;


Login()	
	 {
		
		 getContentPane().setBackground(Color.white);
		 setLayout(Null);
    /* ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("/quiz_application/Icons/picture/quiz.jpg"));
     JLabel image=new JLabel(i1);
     add(image);*/
		 
		 
	JLabel heading=new JLabel("Simple Minds");
   	  heading.setBounds(300,80,300,45);
   	  heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
   	  heading.setForeground(new Color(30,144,254));
   	  add(heading);
   	  
   	   JLabel name=new JLabel("Enter your name");
	  name.setBounds(350,140,300,45);
	  name.setFont(new Font("arial",Font.PLAIN,18));
	 // name.setForeground(new Color(30,144,254));
	  add(name);
	  
	   tfname=new JTextField();
   	  tfname.setBounds(320,190,300,25);
   	  tfname.setFont(new Font("Times New Roman",Font.PLAIN,25));
   	  add(tfname);
   	  
  rules=new JButton("rules");//instance of jbutton
	rules.setBounds(310, 240, 120, 25);
	rules.setBackground(new Color(30,144,254));
	rules.setForeground(Color.white);
	rules.addActionListener(this);
	add(rules);
	
	 back=new JButton("Back");//instance of jbutton
	back.setBounds(480, 240, 120, 25);
	back.setBackground(new Color(30,144,254));
	back.setForeground(Color.white);
	back.addActionListener(this);
	add(back);
	
	
		 
		 setSize(1000,500);//length,width
		 setLocation(200,150);//left,top
		 setVisible(true);
		 
	  
		 
	 }
 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rules)
		{
			String name= tfname.getText();
		setVisible(false);
		new Rules(name);
		    	
		    
		
		}else if(e.getSource()==back)
		{
			setVisible(false);
		}
	}
	
	 public static void main (String args[])
	    {
	     new Login();
	     
	    	
	    	
	    }
}
