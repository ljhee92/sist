package day0129;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *  1. KeyListener 구현 
 */
@SuppressWarnings("serial")
public class TestKeyboardEvent extends JFrame implements KeyListener {
	
	// 3. 이벤트 처리와 관련 있는 컴포넌트를 인스턴스 변수로 선언
	private JTextField jtf;
	private JTextArea jta;
	
	public TestKeyboardEvent() {
		
		super("키보드 이벤트");
		
		jtf = new JTextField();
		jta = new JTextArea();
		
		JScrollPane jsp = new JScrollPane(jta);	// 이벤트와 관련이 없으므로 지역변수로 선언 
		
		jtf.setBorder(new TitledBorder("아무 키나 누르세요"));
		jta.setBorder(new TitledBorder("눌린 키의 정보"));
		
		// jtf에서 이벤트가 발생하면 이벤트를 감지할 수 있도록 이벤트 객체에 등록 
		jtf.addKeyListener(this);
		
		add("North", jtf);
		add("Center", jta);
		
		setSize(400, 400);
		setVisible(true);
		
		// 윈도우 종료 이벤트 처리
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}	// windowClosing
		});
		
	}	// TestKeyboardEvent

	// 2. abstract method override 
	@Override
	public void keyTyped(KeyEvent e) {	// 유니코드 키를 눌렀을 때
		// KeyTyped는 KeyCode가 없으므로 주의!
		System.out.println("keyTyped: " + e.getKeyCode() + " / " + e.getKeyChar());
	}	// keyTyped

	@Override
	public void keyPressed(KeyEvent e) {	// 키를 누른 순간 
		System.out.println("keyPressed: " + e.getKeyCode() + " / " + e.getKeyChar());
	}	// keyPressed
	
	@Override
	public void keyReleased(KeyEvent e) {	// 누른 키를 떼는 순간 
		System.out.println("keyReleased: " + e.getKeyCode() + " / " + e.getKeyChar());
	}	// keyPressed

	public static void main(String[] args) {
		new TestKeyboardEvent();
	}	// main

}	// class