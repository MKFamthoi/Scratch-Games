package com.ryisnow.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class BWButton extends JButton{
	
	Font font1 = new Font("Book Antiqua",Font.BOLD,18);

	public BWButton() {
		
		setBackground(Color.black);
		setForeground(Color.white);
		setFocusPainted(false);
		setFont(font1);
	}
}
