package day0124;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *  1. Window Component를 상속 받는다. 
 */

@SuppressWarnings("serial")
public class HelloSwing extends JFrame {
	
	public HelloSwing() {
		
		super("스윙연습");
		
		// 2. 사용자에게 제공할 컴포넌트 생성
		JButton jbtn = new JButton("안녕 Swing!!");
		
		// 3. 배치 => 부모의 method 사용, 배치관리자를 사용할 수 있다.
		add(jbtn);
		
		// 4. 윈도우의 크기 설정
		setSize(400,150);
		
		// 5. 사용자에게 윈도우 컴포턴트 보여주기
		setVisible(true);
		
		// 6. 윈도우 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	// HelloSwing

	public static void main(String[] args) {
		new HelloSwing();
	}	// main

}	// class