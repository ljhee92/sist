package kr.co.sist.memo;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaMemoEvent extends WindowAdapter implements ActionListener {
	
	private JavaMemo jm;
	
	public JavaMemoEvent(JavaMemo jm) {
		this.jm = jm;
	}	// JavaMemoEvent

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jm.getJmNew()) {
			newMemo();
		}	// end if
		
		if(ae.getSource() == jm.getJmOpen()) {
			openMemo();
		}	// end if
		
		if(ae.getSource() == jm.getJmSave()) {
			saveMemo();
		}	// end if
		
		if(ae.getSource() == jm.getJmClose()) {
			closeMemo();
		}	// end if
		if(ae.getSource() == jm.getJmFont()) {
			openFont();
		} 	// end if
		
		if(ae.getSource() == jm.getJmInfo()) {
			openInfo();
		}	// end if
		
	}	// actionPerformed
	
	private void newMemo() {
		jm.getJta().setText("");
		jm.getJta().setFont(new Font("맑은 고딕", Font.PLAIN, 14));
	}	// newJta
	
	private void openMemo() {
		FileDialog fdOpen = new FileDialog(jm, "파일 열기", FileDialog.LOAD);
		fdOpen.setVisible(true);
		String path = fdOpen.getDirectory();
		String fName = fdOpen.getFile();
		
		if(path != null) {
			jm.setTitle("열기 " + path + "/" + fName);
		}	// end if
	}	// openFile
	
	private void saveMemo() {
		FileDialog fdSave = new FileDialog(jm, "파일 저장", FileDialog.SAVE);
		fdSave.setVisible(true);
		String path = fdSave.getDirectory();
		String fName = fdSave.getFile();
		
		if(path != null) {
			jm.setTitle("저장 " + path + "/" + fName);
		}	// end if
	}	// saveFile
	
	private void closeMemo() {
		jm.dispose();
	}	// closeWin
	
	private void openFont() {
		new MemoFontDesign(jm);
	}	// openFont
	
	private void openInfo() {
		new MemoInfoDesign(jm);
	}	// openInfo

	@Override
	public void windowClosing(WindowEvent e) {
		jm.dispose();
	}	// windowClosing

}	// class