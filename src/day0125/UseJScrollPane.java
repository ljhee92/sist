package day0125;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class UseJScrollPane extends JFrame {
	
	public UseJScrollPane() {
		
		super("스크롤바 연습");
		
		JTextArea jta = new JTextArea("아무말 대잔치");
		JTextArea jta2 = new JTextArea("");
		
		// 줄 단위의 보호
		jta2.setLineWrap(true);
		
		// 단어 단위의 보호(한글은 불가)
		jta2.setWrapStyleWord(true);
		
		String[] dataArr = "자바,오라클,JDBC,HTML,CSS,JavaScript,JavaScript Library,Servlet/JSP,JSON,XML,AJAX".split(",");
		JList<String> jl = new JList<String>(dataArr);
		
		// BorderLayout -> GridLayout
		setLayout(new GridLayout(1, 3));
		
		// 스크롤바가 필요한 컴포넌트를 위해 JScrollPane을 생성
		JScrollPane jsp = new JScrollPane(jta);
		JScrollPane jsp2 = new JScrollPane(jl);
		
		Font font = new Font("Malgun Gothic", Font.BOLD, 12);
		jta.setFont(font);
		jta2.setFont(font);
		
		// 컴포넌트가 아니라 컴포넌트를 가진 스크롤바 객체를 추가해주어야 함.
		add(jsp);
		add(jsp2);
		add(jta2);
		
		setBounds(100, 100, 400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	// JScrollPane

	public static void main(String[] args) {
		new UseJScrollPane();
	}	// 

}	// class