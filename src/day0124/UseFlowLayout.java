package day0124;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *  1. 윈도우 컴포넌트 상속
 */

@SuppressWarnings("serial")
public class UseFlowLayout extends JFrame {
	
	public UseFlowLayout() {
		
		super("FlowLayout 연습");
		
		// 2. 컴포넌트 생성
		JLabel jlblName = new JLabel("이름");		// 자료형+저장할값 으로 네이밍하는 것: 헝가리안 네이밍
		JTextField jtfName = new JTextField(10);
		JCheckBox jcbSave = new JCheckBox("저장");
		JButton jbtnInput = new JButton("입력");
		
		// 3. 배치관리자 생성(Non-Visual Component) 후 적용
		setLayout(new FlowLayout());
		
		// 4. 컴포넌트 배치
		add(jlblName);
		add(jtfName);
		add(jcbSave);
		add(jbtnInput);
		
		// 5. 윈도우 크기 설정
		setSize(500, 400);
		
		// 6. 사용자에게 윈도우 보여주기
		setVisible(true);
		
		// 7. 윈도우 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	// UseFlowLayout

	public static void main(String[] args) {
		new UseFlowLayout();
	}	// main

}	// class