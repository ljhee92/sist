package day0129;

import java.awt.event.KeyAdapter;
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
public class TestKeyboardEvent2 extends JFrame {
	
	// 3. 이벤트 처리와 관련 있는 컴포넌트를 인스턴스 변수로 선언
	private JTextField jtf;
	private JTextArea jta;
	
	public TestKeyboardEvent2() {
		
		super("키보드 이벤트");
		
		jtf = new JTextField();
		jta = new JTextArea();
		
		JScrollPane jsp = new JScrollPane(jta);	// 이벤트와 관련이 없으므로 지역변수로 선언 
		
		jtf.setBorder(new TitledBorder("아무 키나 누르세요"));
		jta.setBorder(new TitledBorder("눌린 키의 정보"));
		
		// jtf에서 이벤트가 발생하면 이벤트를 감지할 수 있도록 이벤트 객체에 등록 
		// 2. anonymous inner class로 이벤트 처리
		jtf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 눌린 키의 키코드와 키값을 얻어온다.
				char c = e.getKeyChar();
				int code = e.getKeyCode();
				
				// JTextArea에 추가
				jta.append("문자: " + c + ", 코드: " + code + "\n");
				
				// Esc가 눌렸을 때 프로그램을 종료해보세요.
				if(code == KeyEvent.VK_ESCAPE) {	// Esc의 Keycode는 27이지만, 어느 OS에서도 사용가능한 상수 사용 
					dispose();
				}	// end if
				
				// Enter가 눌렸을 때 jta에 문자열로 "엔터눌림"을 추가헤보세요.
				if(code == KeyEvent.VK_ENTER) {
					jta.append("엔터눌림\n");
				}	// end if
			}	// keyPressed
		});
		
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

	public static void main(String[] args) {
		new TestKeyboardEvent2();
	}	// main

}	// class