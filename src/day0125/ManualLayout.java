package day0125;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class ManualLayout extends JFrame {
	
	public ManualLayout() {
	
		super("수동 배치");
		
		// 컴포넌트 생성
		JButton jbtn = new JButton("버튼");
		
		String[] dataArr = {"짜장면", "김밥", "김밥", "뼈해장국", "순대국밥", "돈까스", "을밀대 냉면", "맛있지"};
		JList<String> jl = new JList<String>(dataArr);
		
		JPasswordField jpf = new JPasswordField();
		
		// 배치관리자 해제
		setLayout(null);

		// 컴포넌트의 크기와 위치 설정
		jbtn.setSize(80, 30);
		jbtn.setLocation(50, 130);
		
		jl.setSize(150, 100);
		jl.setLocation(160, 160);
		
		// 컴포넌트의 크기와 위치를 한 번에 설정하는 method : setBounds(x, y, w, h)
		jpf.setBounds(360, 40, 120, 40);
		
		// 배치
		add(jbtn);
		add(jl);
		add(jpf);
		setSize(600, 600);		// java.awt.Window 클래스에서 Override
		setLocation(100, 200); 	// 윈도우(JFrame의 부모)클래스는 시작 좌표가 Frame 안쪽이 아닌 모니터 좌상단
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}	// ManualLayout
	

	public static void main(String[] args) {
		new ManualLayout();
	}	// main

}	// class