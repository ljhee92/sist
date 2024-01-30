package day0129;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import kr.co.sist.memo.StudentInfo;

/**
 *  1. Window Component를 상속, 이벤트 처리 Listener를 구현
 */
@SuppressWarnings("serial")
public class TestEvent extends JFrame implements ActionListener {
	
	public TestEvent() {
		
		super("이벤트 연습");
		JButton jbtn = new JButton("버튼");
		JPanel jp = new JPanel();
		
		// 3. 컴포넌트를 이벤트에 등록
		jbtn.addActionListener(this);
		
		jp.add(jbtn);
		
		add("Center", jp);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	// TestEvent

	// 2. Listener의 abstract method를 Override한다.
	// 이벤트가 발생했을 때 제공할 코드를 작성
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);	// 생성된 ActionEvent 객체
//		JOptionPane.showMessageDialog(this, "버튼을 눌렀습니다");
		new StudentInfo();
	}	// actionPerformed

	public static void main(String[] args) {
		new TestEvent();
	}	// main
	
}	// class