package day0205;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HomeWork0205 {
	
	private JTextArea jta;
	private File[] fileArr; 
	
	public HomeWork0205() {
		String path = JOptionPane.showInputDialog("경로를 입력하세요.", "c:/dev");
		File file = new File(path);
		
		if(!file.exists()) {
			JOptionPane.showMessageDialog(null, file + "은 존재하지 않습니다. 파일 경로나 파일명을 확인해주세요.");
			return;
		}	// end if
		
		fileArr = file.listFiles();
		
		showFiles();
	}	// HomeWork0205
	
	private void showFiles() {
		jta = new JTextArea(10, 50);
		JScrollPane jsp = new JScrollPane(jta);
		jta.setEditable(false);
		printFiles();
		JOptionPane.showMessageDialog(null, jsp);
	}	// createTextArea
	
	private void printFiles() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		jta.append("이름\t\t\t수정한날짜\t\t\t유형\t크기\n");
		for(File file : fileArr) {
			jta.append(file.getName() + "\t\t\t");
			jta.append(sdf.format(new Date(file.lastModified())) + "\t\t");
			jta.append(file.isDirectory()? "폴더\t" : "파일\t");
			jta.append(file.isDirectory()? "\n" : String.valueOf(file.length())+"byte\n");
		}	// end else
	}	// printFiles

	public static void main(String[] args) {
		new HomeWork0205();
	}	// main

}	// class