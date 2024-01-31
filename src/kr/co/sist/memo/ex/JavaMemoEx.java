package kr.co.sist.memo.ex;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JavaMemoEx extends JFrame {
	
	public JavaMemoEx() {
		super("메모장");
		
		setJMenuBar();
		addTextArea();
		
		setBounds(100, 100, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	// JavaMemo
	
	/**
	 *  JMenuBar 프레임 배치
	 */
	public void setJMenuBar() {
		JMenuBar jmb = new JMenuBar();
		jmb.add(addMenu1());
		jmb.add(addMenu2());
		setJMenuBar(jmb);
	}	// setJMenuBar
	
	/**
	 * 첫 번째 메뉴 추가
	 * @return 파일 메뉴
	 */
	public JMenu addMenu1() {
		JMenu jmFile = new JMenu("파일");
		String[] menuItem = {"새글", "열기", "저장", "종료"};
		JMenuItem[] jmiArr = new JMenuItem[menuItem.length];
		for(int i = 0; i < menuItem.length; i++) {
			if(i == 1 || i == 3) {
				jmFile.addSeparator();
			}	// end if 
			jmiArr[i] = jmFile.add(menuItem[i]);
		}	// end for
		return jmFile;
	}	// addMenu1
	
	/**
	 * 두 번째 메뉴 추가
	 * @return 도움말 메뉴
	 */
	public JMenu addMenu2() {
		JMenu jmHelp = new JMenu("도움말");
		JMenuItem jmInfo = new JMenuItem("메모장 정보");
		jmHelp.add(jmInfo);
		return jmHelp;
	}	// addMenu2
	
	/**
	 *  TextArea 추가
	 */
	public void addTextArea() {
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);	// 스크롤바 추가 
		jta.setLineWrap(true);	// 라인 보호
		add(jsp);
	}	// addTextArea
	
}	// class