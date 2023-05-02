package frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import common.CommonUtil;

public class CalculatorFrame extends CommonUtil{

	private int gridColumnNum = 4;
	private int gridRowNum = 5;
	
	private JPanel pnButtons = new JPanel(new GridLayout(gridRowNum,gridColumnNum,5,5));
	private JPanel pnCalculate = new JPanel();
	
	private String[] btnsName = "C,<=,%,÷,7,8,9,×,4,5,6,-,1,2,3,+,±,0,.,=".split(",");
	private JButton[] btns = new JButton[btnsName.length];
	
	public CalculatorFrame() {
		setFrame(this, "계산기");// 기본 JFrame 세팅
		
		pnCalculate.setBackground(Color.white);
		pnCalculate.setBorder(new LineBorder(Color.black,3));
		
		setButtons(btns,btnsName);// 버튼 세팅
		
		pnCalculate.setBounds(5,5,320, 130);
		pnButtons.setBounds(5, 140, 320, 320);
		
		this.add(pnCalculate);
		this.add(pnButtons);
	}

	public void setButtons(JButton[] btns, String[] btnsName) {
		for ( int i = 0; i < btns.length; i++ ) {
			btns[i] = new JButton(btnsName[i]);
			if ( i == 0 ) {
				btns[i].setBackground(Color.red);
				btns[i].setForeground(Color.white);
			}
			else if ( i >= 4 && i <= 6 ||
					i >= 8 && i <= 10 ||
					i >= 12 && i <= 14) {
				btns[i].setBackground(Color.WHITE);
				btns[i].setForeground(Color.black);
			}
			else {
				btns[i].setBackground(Color.LIGHT_GRAY);
				btns[i].setForeground(Color.white);
			}
			btns[i].setSize(40, 25);
			btns[i].setBorderPainted(false);
			btns[i].setFont(new Font("Arial", Font.BOLD, 20));
			pnButtons.add(btns[i]);
		}
	}
	
	public static void main(String[] args) {
		CalculatorFrame c = new CalculatorFrame();
		c.setVisible(true);
	}
}
