package day0129;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import day1226.Test;

@SuppressWarnings("serial")
public class TestWindowEvent extends Frame implements WindowListener {
	
	public TestWindowEvent() {
		
		super("윈도우 이벤트 연습");
		
		// Window Component를 이벤트에 등록
		addWindowListener(this);
		
		setSize(400, 400);
		setVisible(true);
		
	}	// TestWindowEvent

	// Override 해야 할 method가 너무 많다.
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}	// windowOpened

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		dispose();		// dispose() > windowClosed 호출 
	}	// windowClosing

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}	// windowClosed

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}	// windowIconified

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}	// windowDeiconified

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}	// windowActivated

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}	// windowDeactivated

	public static void main(String[] args) {
		new TestWindowEvent();
	}	// main

}	// class