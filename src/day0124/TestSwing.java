package day0124;

import java.awt.Frame;
import java.awt.Window;

/**
 *  1. 윈도우 컴포넌트(JWindow, JFrame)을 상속받는다.
 */

@SuppressWarnings("serial")
public class TestSwing extends Window {

	public TestSwing(Frame f) {
		super(f);
		f.setSize(300, 300);
		f.setVisible(true);
	}	// TestSwing

	public static void main(String[] args) {
		new TestSwing(new Frame());
	}	// main
	
}	// class