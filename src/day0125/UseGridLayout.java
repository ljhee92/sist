package day0125;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *  1. 윈도우 컴포넌트 상속
 */

@SuppressWarnings("serial")
public class UseGridLayout extends JFrame {
	
	public UseGridLayout() {
		
		super("격자 레이아웃");
		
		// 2. 컴포넌트 생성
		JRadioButton jrbPublic = new JRadioButton("public");
		JRadioButton jrbProtected = new JRadioButton("protected");
		JRadioButton jrbPackage = new JRadioButton("package");
		JRadioButton jrbPrivate = new JRadioButton("private", true);	// 선택된 상태로 나오도록 -> true
		
		JCheckBox jcbNone = new JCheckBox("none");
		JCheckBox jcbSealed = new JCheckBox("sealed");
		JCheckBox jcbNoneSealed = new JCheckBox("none-sealed");
		JCheckBox jcbFinal = new JCheckBox("final");
		
		// 버튼 그룹으로 라디오 버튼을 묶어야 여러 개 중 하나만 선택 가능
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbPublic);
		bg.add(jrbProtected);
		bg.add(jrbPackage);
		bg.add(jrbPrivate);
		
		// 체크박스는 여러 개가 선택되어야 하기 때문에 그룹으로 묶지 않는다.
//		ButtonGroup bg2 = new ButtonGroup();
//		bg2.add(jcbNone);
//		bg2.add(jcbNoneSealed);
//		bg2.add(jcbSealed);
//		bg2.add(jcbFinal);

		// 3. 배치관리자 설정
		setLayout(new GridLayout(2, 4));
		
		// 4. 컴포넌트 배치
		add(jrbPublic);
		add(jrbProtected);
		add(jrbPackage);
		add(jrbPrivate);
		add(jcbNone);
		add(jcbNoneSealed);
		add(jcbSealed);
		add(jcbFinal);
		
		// 5. 윈도우 크기 설정 
		setBounds(100, 100, 400, 200);
		
		// 6. 가시화
		setVisible(true);
		
		// 7. 윈도우 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	// UseGridLayout
	

	public static void main(String[] args) {
		new UseGridLayout();
	}	// main

}	// class