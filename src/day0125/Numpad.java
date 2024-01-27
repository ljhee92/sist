package day0125;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Numpad extends JFrame {
	
	public Numpad() {
		
		super("번호");
		
		String[] numArr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
		
		JButton[] jbtnArr = new JButton[numArr.length];		// 배열은 모든 데이터로 만들 수 있다.
		
		setLayout(new GridLayout(4, 3));
		
		for(int i = 0; i < numArr.length; i++) {
			jbtnArr[i] = new JButton(numArr[i]);
			add(jbtnArr[i]);
		}	// end for
		
		setSize(250, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	// Numpad
	

	public static void main(String[] args) {
		new Numpad();
	}	// main

}	// class