package day0125;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *  1. Window Component 상속 -> JFrame <br>
 *    (Container Component 상속은 JPanel)
 */

@SuppressWarnings("serial")
public class UseLayoutManager extends JFrame {
	
	public UseLayoutManager() {
		
		super("여러 레이아웃 매니저 사용");
		
		// 2. 컴포넌트 생성
		JLabel jlName = new JLabel("이름");
		JTextField jtfName = new JTextField(10);
		
		JComboBox<String> jcbGender = new JComboBox<String>();
		jcbGender.addItem("남자");
		jcbGender.addItem("여자");
		
		JButton jbtnInput = new JButton("입력");
		
		JTextArea jtaList = new JTextArea();
		JScrollPane jsp = new JScrollPane(jtaList);
		
		// 글꼴 적용
		// - Font 클래스 생성
		Font font = new Font("궁서", Font.BOLD, 20);
		jlName.setFont(font);
		jtfName.setFont(font);
		jcbGender.setFont(font);
		jbtnInput.setFont(font);
		
		jtaList.setFont(new Font("맑은 고딕", Font.ITALIC | Font.BOLD, 20));
		
		// 글꼴 색상 적용
		// - Constant 사용
		jlName.setForeground(Color.white);
		Color color = new Color(0x03CD5C);
		jtfName.setForeground(color);
		jcbGender.setForeground(color);
		jbtnInput.setForeground(color);
		jtaList.setForeground(new Color(0xF0F0F0));
		jtaList.setBackground(Color.gray);
		
		// 바닥이 투명한 컴포넌트는 투명도를 설정해야 한다. 
		jlName.setOpaque(true);		// 투명도 설정
		jlName.setBackground(new Color(0x5662F6));
		
		// 3. 배치
		// BorderLayout은 하나의 영역에 하나의 컴포넌트만 배치된다.
		// Container Component 필요
//		add("North", jlName);
//		add("North", jtfName);
//		add("North", jcbGender);
//		add("North", jbtnInput);
		
		// 여러 개의 컴포넌트를 관리하기 위해서 Container Component를 사용
		JPanel jpNorth = new JPanel();		// FlowLayout
		jpNorth.add(jlName);	// JPanel에 컴포넌트를 배치
		jpNorth.add(jtfName);
		jpNorth.add(jcbGender);
		jpNorth.add(jbtnInput);
		
		// 윈도우 컴포넌트(사용자에게 보여주는 일)에 배치
		add("North", jpNorth);
		add("Center", jsp);
		
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	// UseLayoutManager
	

	public static void main(String[] args) {
		new UseLayoutManager();
	}	// main

}	// class