package kr.co.sist.memo;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JavaMemo extends JFrame {
	
	private JMenuItem jmNew, jmOpen, jmSave, jmClose, jmFont, jmInfo;
	private JTextArea jta;
	
	public JavaMemo() {
		super("메모장");
		
		JMenuBar jmb = new JMenuBar();
		
		JMenu jmFile = new JMenu("파일");
		JMenu jmFormat = new JMenu("서식");
		JMenu jmHelp = new JMenu("도움말");
		
		jmNew = new JMenuItem("새글");
		jmOpen = new JMenuItem("열기");
		jmSave = new JMenuItem("저장");
		jmClose = new JMenuItem("종료");
		jmFont = new JMenuItem("글꼴");
		jmInfo = new JMenuItem("메모장 정보");
		
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		jta.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		jta.setLineWrap(true);
		
		jmFile.add(jmNew);
		jmFile.addSeparator();
		jmFile.add(jmOpen);
		jmFile.add(jmSave);
		jmFile.addSeparator();
		jmFile.add(jmClose);

		jmFormat.add(jmFont);
		
		jmHelp.add(jmInfo);
		
		jmb.add(jmFile);
		jmb.add(jmFormat);
		jmb.add(jmHelp);
		
		setJMenuBar(jmb);
		add(jsp);
		
		JavaMemoEvent jme = new JavaMemoEvent(this);
		addWindowListener(jme);
		jmNew.addActionListener(jme);
		jmOpen.addActionListener(jme);
		jmSave.addActionListener(jme);
		jmClose.addActionListener(jme);
		jmFont.addActionListener(jme);
		jmInfo.addActionListener(jme);
		
		setBounds(100, 100, 500, 500);
		setVisible(true);
		
	}	// JavaMemo

	public JMenuItem getJmNew() {
		return jmNew;
	}

	public JMenuItem getJmOpen() {
		return jmOpen;
	}

	public JMenuItem getJmSave() {
		return jmSave;
	}

	public JMenuItem getJmClose() {
		return jmClose;
	}

	public JMenuItem getJmFont() {
		return jmFont;
	}

	public JMenuItem getJmInfo() {
		return jmInfo;
	}

	public JTextArea getJta() {
		return jta;
	}

}	// class