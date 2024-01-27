package day0126;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class UseJMenuBar extends JFrame {
	
	public UseJMenuBar() {
		
		super("메뉴바 연습");
		
		// 1. 메뉴바 생성
		JMenuBar jmb = new JMenuBar();
		
		// 2. 메뉴 생성
		JMenu jm1 = new JMenu("1번 메뉴");
		JMenu jm1_1 = new JMenu("1번 메뉴의 하위 메뉴");
		JMenu jm2 = new JMenu("2번 메뉴");
		
		// 3. 메뉴 아이템 생성
		JMenuItem jmi1 = new JMenuItem("1번의 메뉴 아이템");
		JMenuItem jmi1_1 = new JMenuItem("1번의 두 번째 메뉴 아이템");
		JMenuItem jmi1_2 = new JMenuItem("1번의 세 번째 메뉴 아이템");
		
		JMenuItem jmi2 = new JMenuItem("2번의 메뉴 아이템");
		JMenuItem jmi2_1 = new JMenuItem("2번의 두 번째 메뉴 아이템");
		JMenuItem jmi2_2 = new JMenuItem("2번의 세 번째 메뉴 아이템");
		
		jm1_1.add("하위메뉴1");
		jm1_1.add("하위메뉴2");
		jm1_1.add("하위메뉴3");
		jm1_1.add("하위메뉴4");
		
		// 4. 메뉴 아이템들을 메뉴에 배치
		jm1.add(jmi1);
		jm1.addSeparator();	// 메뉴 아이템끼리의 구분
		jm1.add(jm1_1);		// 메뉴에 메뉴를 배치하면 하위 메뉴를 선택할 수 있다.
		jm1.add(jmi1_1);
		jm1.add(jmi1_2);
		
		jm2.add(jmi2);
		jm2.addSeparator();
		jm2.add(jmi2_1);
		jm2.add(jmi2_2);
		
		// 5. 메뉴를 메뉴바에 배치
		jmb.add(jm1);
		jmb.add(jm2);
		
		// 6. 메뉴바를 프레임에 배치
		setJMenuBar(jmb);
		
		setBounds(100, 100, 800, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	// UseJMenuBar

	
	public static void main(String[] args) {
		new UseJMenuBar();
	}	// main

}	// class