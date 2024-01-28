package day0125;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class UseImageIcon extends JFrame {
	
	public UseImageIcon() {
		
		super("이미지연습");
		
		ImageIcon ii = new ImageIcon("/Users/juhee/eclipse-workspace/sist/src/day0125/images/img1.png");
		ImageIcon ii2 = new ImageIcon("/Users/juhee/eclipse-workspace/sist/src/day0125/images/img4.png");
		ImageIcon ii3 = new ImageIcon("/Users/juhee/eclipse-workspace/sist/src/day0125/images/img2.png");
		ImageIcon ii4 = new ImageIcon("/Users/juhee/eclipse-workspace/sist/src/day0125/images/img3.png");
		
		JLabel jl = new JLabel(ii);
		JButton jbtn = new JButton("지리는 이미지", ii2);
		JButton jbtnClick = new JButton("클릭");
		JButton jbtn3 = new JButton("차차", ii3);
		
		setLayout(null);		// 수동배치
		
		jl.setBounds(100, 100, 300, 200);
		jbtn.setBounds(420, 100, 400, 250);
		jbtnClick.setBounds(205, 195, 80, 30);
		jbtn3.setBounds(840, 100, 320, 200);
		
		// 버튼 제어(풍선 도움말)
		jbtn.setToolTipText("지림");
		jbtn3.setToolTipText("손흔드는 차차");
		
		// 텍스트를 특정 위치로 보내기
		jbtn.setVerticalTextPosition(JButton.TOP);
		jbtn.setHorizontalTextPosition(JButton.CENTER);
		jbtn3.setVerticalTextPosition(JButton.TOP);
		jbtn3.setHorizontalTextPosition(JButton.CENTER);
		
		// RollOver
		jbtn3.setRolloverIcon(ii4);
		
		// Frame에 컴포넌트 배치
		add(jbtnClick);
		add(jl);
		add(jbtn);
		add(jbtn3);

		setBounds(100, 100, 1200, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}	// UseImageIcon

	public static void main(String[] args) {
		new UseImageIcon();
	}	// main

}	// class