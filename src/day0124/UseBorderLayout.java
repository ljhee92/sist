package day0124;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * 	1. 윈도우 컴포넌트 상속받는다.
 */

@SuppressWarnings("serial")
public class UseBorderLayout extends JFrame {
	
	public UseBorderLayout() {
		
		super("경계 레이아웃 연습");
		
		// 2. 컴포넌트를 생성
		JButton jbtnNorth = new JButton("북쪽");
		JButton jbtnWest = new JButton("서쪽");
		
		JLabel jlblEast = new JLabel("동쪽");		// 라벨은 클릭 불가
		JLabel jlblSouth = new JLabel("남쪽");
		
		JTextArea jtaCenter = new JTextArea("가운데");
		
		// 3. 배치관리자 생성하고 적용
		// Window component의 기본 배치관리자는 BorderLayout -> 굳이 생성하고 적용할 필요는 없다.
		// setLayout method는 JFrame에 있는 method, JFrame에서 BorderLayout을 받아서 사용. has a 관계
		setLayout(new BorderLayout());
		
		// 4. 생성된 컴포넌트를 배치관리자의 특성에 맞게 배치 수정
		add("North", jbtnNorth);			// 문자열 상수 사용하여 배치
		add(BorderLayout.WEST, jbtnWest);	// BorderLayout의 Constant 사용하여 배치
		add("Center", jtaCenter);
		add(jlblEast, "East");
		add(jlblSouth, BorderLayout.SOUTH);	// overloading 잘되어있음
		
		// 5. 윈도우의 크기 설정
		setSize(500, 500);
		
		// 6. 사용자에게 보여주기
		setVisible(true);
		
		// 7. 윈도우 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	// UseBorderLayout

	public static void main(String[] args) {
		new UseBorderLayout();
	}	// main

}	// class