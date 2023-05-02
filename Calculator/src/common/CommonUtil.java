package common;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CommonUtil extends JFrame{
	
	public void setFrame(JFrame frame, String className) {
		frame.setTitle(className);
		frame.setSize(345,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(null);
	}
}
