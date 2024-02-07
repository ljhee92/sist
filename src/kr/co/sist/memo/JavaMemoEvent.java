package kr.co.sist.memo;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

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
		if(ae.getSource() == jm.getJmNewSave()) {
			saveNewMemo();
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
		if(jm.getTitle().startsWith("열기")) {
			if(compareChange() == false) {				
				int option = JOptionPane.showConfirmDialog(jm, "저장하시겠습니까?");
				switch(option) {
				case JOptionPane.OK_OPTION :
					saveExistMemo();
					break;
				case JOptionPane.NO_OPTION :
					break;
				case JOptionPane.CANCEL_OPTION :
					return;
				}	// end case
			} else {
				saveExistMemo();
			}	// end else
			resetMemo();
			return;
		}	// end if
		
		if(!jm.getJta().getText().isEmpty()) { 
			int option = JOptionPane.showConfirmDialog(jm, "저장하시겠습니까?");
			switch(option) {
			case JOptionPane.OK_OPTION :
				saveNewMemo();
				break;
			case JOptionPane.NO_OPTION :
				break;
			case JOptionPane.CANCEL_OPTION :
				return;
			}	// end case
		}	// end if
		
		resetMemo();
	}	// newJta
	
	private boolean compareChange() {
		String title = jm.getTitle();
		String path = title.substring(3, title.indexOf("/"));
		String fName = title.substring(title.indexOf("/"));
		File openedFile = new File(path + "/" + fName);
		String openedContents = "";
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(openedFile))) {
			while((openedContents = br.readLine()) != null) {
				sb.append(openedContents).append("\n");
			}	// end while
			openedContents = sb.toString();
			if(jm.getJta().getText().equals(openedContents)) {
				return true;
			}	// end if
		} catch(IOException ie) {
			ie.printStackTrace();
		}	// end catch
		return false;
	}	// compareChange
	
	private void resetMemo() {
		jm.setTitle("메모장-새글");
		jm.getJta().setText("");
	}	// resetMemo
	
	private void openMemo() {
		if(jm.getTitle().startsWith("열기")) {
			int option = JOptionPane.showConfirmDialog(jm, "변경된 내용이 있습니까?");
			switch(option) {
			case JOptionPane.OK_OPTION :
				int optionSave = JOptionPane.showConfirmDialog(jm, "저장하시겠습니까?");
				switch(optionSave) {
				case JOptionPane.OK_OPTION :
					saveExistMemo();
					break;
				case JOptionPane.NO_OPTION :
					break;
				case JOptionPane.CANCEL_OPTION :
					return;
				}	// end case
			case JOptionPane.NO_OPTION :
				break;
			case JOptionPane.CANCEL_OPTION :
				return;
			}	// end case
			executeOpen();
			return;
		}	// end if
		
		if(!jm.getJta().getText().isEmpty()) {
			int option = JOptionPane.showConfirmDialog(jm, "저장하시겠습니까?");
			switch(option) {
			case JOptionPane.OK_OPTION :
				saveNewMemo();
				break;
			case JOptionPane.NO_OPTION :
				break;
			case JOptionPane.CANCEL_OPTION :
				return;
			}	// end case
		}	// end if
		
		executeOpen();
	}	// openFile
	
	private void executeOpen() {
		FileDialog fdOpen = new FileDialog(jm, "파일 열기", FileDialog.LOAD);
		fdOpen.setVisible(true);
		String path = fdOpen.getDirectory();
		String fName = fdOpen.getFile();
		
		if(path != null) {	// 다이얼로그 오픈 시 취소가 아닐 때만 실행
			jm.setTitle("열기 " + path + "/" + fName);
			File openFile = new File(path + "/" + fName);
			String openContents = "";
			StringBuilder sb = new StringBuilder();
			try(BufferedReader br = new BufferedReader(new FileReader(openFile))) {
				while((openContents = br.readLine()) != null) {
					sb.append(openContents).append("\n");
				}	// end while
				openContents = sb.toString();
				jm.getJta().setText(openContents);
			} catch(IOException ie) {
				ie.printStackTrace();
			}	// end catch
		}	// end if
	}	// executeOpen
	
	private void saveMemo() {
		if(jm.getTitle().startsWith("열기") || jm.getTitle().startsWith("저장")) {
			saveExistMemo();
			return;
		}	// end case
		saveNewMemo();
	}	// saveMemo
	
	private void saveNewMemo() {
		FileDialog fdSave = new FileDialog(jm, "다른 이름으로 저장", FileDialog.SAVE);
		fdSave.setVisible(true);
		String path = fdSave.getDirectory();
		String fName = fdSave.getFile();
		
		if(path != null) {
			jm.setTitle("저장 " + path + "/" + fName);
			File saveNewFile = new File(path + "/" + fName + ".txt");
			if(fName.endsWith(".txt")) {
				saveNewFile = new File(path + "/" + fName);
			}	// end if
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(saveNewFile))){
				String saveContents = jm.getJta().getText();
				bw.write(saveContents);
				bw.flush();
			} catch(IOException ie) {
				ie.printStackTrace();
			}	// end catch
		}	// end if
	}	// saveNewMemo
	
	private void saveExistMemo() {		
		String title = jm.getTitle();
		String path = title.substring(3, title.indexOf("/"));
		String fName = title.substring(title.indexOf("/"));
		File saveExistFile = new File(path + fName);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(saveExistFile))) {
			String saveExistContents = jm.getJta().getText();
			bw.write(saveExistContents);
			bw.flush();
		} catch(IOException ie) {
			ie.printStackTrace();
		}	// end catch
	}	// end saveExistMemo
	
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
		closeMemo();
	}	// windowClosing

}	// class