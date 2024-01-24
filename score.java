package com.quiz;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener {
   Score(String name,int score)
   {
	   setBounds(300,150,700,550);
		 getContentPane().setBackground(Color.white);
		 setLayout(null);
			    			
		
		JLabel heading=new JLabel("thank you "+ name+ " for playing simple minds");
		 heading.setBounds(70,50,500,30);
		 heading.setFont(new Font("Tahoma",Font.PLAIN,28));
		 add(heading);

			JLabel lscore=new JLabel("Your Score is " +score);
			lscore.setBounds(100,150,500,30);
			 lscore.setFont(new Font("Tahoma",Font.PLAIN,28));
			 add(lscore);
			 
			 
			 JButton submit=new JButton("play again");
				submit.setBounds(200,300,150,40);
				submit.setFont(new Font("tahoma",Font.PLAIN,22));
				submit.setBackground(Color.blue);
				submit.setForeground(Color.white);
				submit.addActionListener(this);
		          add(submit);
		  setVisible(true);
   }
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		 
		setVisible(false);
		new Login();
		
	}
	public static void main (String args[])
	{
		new Score("user",0);
	}
}
