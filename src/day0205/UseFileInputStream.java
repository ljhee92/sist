package day0205;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UseFileInputStream {
	
	public UseFileInputStream() throws IOException {
		
		// 1. File 생성
		File file = new File("/Users/juhee/eclipse-workspace/sist/temp/java_read.rtf");
		
		if(!file.exists()) {
			JOptionPane.showMessageDialog(null, "파일명이나 경로를 확인해주세요.");
			return;
		}	// end if
		
		// 2. File을 읽기 위한 Stream을 연결
		FileInputStream fis = new FileInputStream(file);
		
		// 3. 반복문을 돌려서 값을 얻고 사용
		int readData = 0;
		while((readData = fis.read()) != -1) {	// 1byte 읽어 들여 값이 존재하면
			// 8bit Stream과 연결한 것으로 한글은 읽어 들일 수 없다.
			System.out.print((char)readData);
		}	// end while
		
		// 4. Stream 사용을 종료하면 연결을 끊는다.
		fis.close();
		
	}	// UseFileInputStream

	public static void main(String[] args) {
//		try {
//			new UseFileInputStream();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}	// end catch
		
		JTextArea jta = new JTextArea(10, 50);
		JScrollPane jsp = new JScrollPane(jta);
		jta.append("이름\t수정한날짜\t\t유형\t크기\n");
		jta.append("eclipse\tyyyy-MM-dd HH:mm\t폴더 \n");
		jta.append("env.bat\tyyyy-MM-dd HH:mm\t파일\t4byte \n");
		jta.setEditable(false);
		JOptionPane.showMessageDialog(null, jsp);
	}	// main

}	// class