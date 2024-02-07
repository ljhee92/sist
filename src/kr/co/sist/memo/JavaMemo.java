package kr.co.sist.memo;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JavaMemo extends JFrame implements Serializable {
	
	private JMenuItem jmNew, jmOpen, jmSave, jmNewSave, jmClose, jmFont, jmInfo;
	private JTextArea jta;
	private File fontFile;
	private Font font;
	
	public JavaMemo() {
		super("메모장");
		
		JMenuBar jmb = new JMenuBar();
		
		JMenu jmFile = new JMenu("파일");
		JMenu jmFormat = new JMenu("서식");
		JMenu jmHelp = new JMenu("도움말");
		
		jmNew = new JMenuItem("새글");
		jmOpen = new JMenuItem("열기");
		jmSave = new JMenuItem("저장");
		jmNewSave = new JMenuItem("새이름 저장");
		jmClose = new JMenuItem("종료");
		jmFont = new JMenuItem("글꼴");
		jmInfo = new JMenuItem("메모장 정보");
		
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		fontFile = new File("C:/dev/workspace/java_se/font.txt");
		if(fontFile.exists()) {
			try {
				font = bringFont();
				jta.setFont(font);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}	catch (IOException e) {
				e.printStackTrace();
			}	// end catch
		} else {
			jta.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		}	// end else
		jta.setLineWrap(true);
		
		jmFile.add(jmNew);
		jmFile.addSeparator();
		jmFile.add(jmOpen);
		jmFile.add(jmSave);
		jmFile.add(jmNewSave);
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
		jmNewSave.addActionListener(jme);
		jmClose.addActionListener(jme);
		jmFont.addActionListener(jme);
		jmInfo.addActionListener(jme);
		
		setBounds(100, 100, 500, 500);
		setVisible(true);
		
	}	// JavaMemo
	
	public Font bringFont() throws IOException, ClassNotFoundException {
		Font font = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("C:/dev/workspace/java_se/font.txt"));
			font = (Font)ois.readObject();
		} finally {
			if(ois != null) {
				ois.close();
			}	// end if
		}	// end finally
		return font;
//		String font;
//		String[] fontArr;
//		String fontName = "";
//		int fontStyle = 0;
//		int fontSize = 0;
//		try(BufferedReader br = new BufferedReader(new FileReader(fontFile))) {
//			while((font = br.readLine()) != null) {
//				fontArr = font.split(",");
//				fontName = fontArr[0];
//				fontStyle = Integer.parseInt(fontArr[1]);
//				fontSize = Integer.parseInt(fontArr[2]);
//			}	// end while
//		} catch(IOException ie) {
//			ie.printStackTrace();
//		}	// end catch
//		jta.setFont(new Font(fontName, fontStyle, fontSize));
	}	// setFont

	public JMenuItem getJmNew() {
		return jmNew;
	}

	public JMenuItem getJmOpen() {
		return jmOpen;
	}

	public JMenuItem getJmSave() {
		return jmSave;
	}
	
	public JMenuItem getJmNewSave() {
		return jmNewSave;
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

	public void setFont(Font font) {
		this.font = font;
	}

}	// class