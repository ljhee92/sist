package day0206;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class TestStreamKim {
	
	public TestStreamKim() throws IOException {
		File newFile = new File("C:/dev/temp/java_write4.txt");
		if(newFile.exists()) {
			switch(JOptionPane.showConfirmDialog(null, newFile.getAbsolutePath() + "이 존재합니다.\n덮어쓰시겠습니까?")) {
			case JOptionPane.NO_OPTION:
			case JOptionPane.CANCEL_OPTION:
				return;
			} // end switch
		} // end if
		
//		StringBuilder sb = new StringBuilder(); 
//		File prevFile = new File("C:/dev/temp/java_read.txt");
//		try (BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(prevFile)))) {
//			String str = "";
//			while( (str = bf.readLine()) != null) {
//				sb.append(str).append("\n");
//			} // end while
//		} catch (IOException ie) {
//			ie.printStackTrace();
//		} // end catch
//		
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
//			bw.write(sb.toString());
//		} catch (IOException ie) {
//			ie.printStackTrace();
//		} // end catch
		
		// 읽기와 쓰기를 동시에
		BufferedReader br = null;
		BufferedWriter bw = null;
		File readFile = new File("C:/dev/temp/java_read.txt");
		try{
			br = new BufferedReader(new FileReader(readFile));
			bw = new BufferedWriter(new FileWriter(newFile));
			
			String lineData="";
			while((lineData=br.readLine()) != null) {
				bw.write(lineData + "\n");
			}	// end while
			
			bw.flush();
			
		} finally {
			if(br != null) {br.close();}
			if(bw != null) {br.close();}
		}	// end finally
		
	} // TestStream
	
	public static void main(String[] args) {
		try {
			new TestStreamKim();
		} catch (IOException e) {
			e.printStackTrace();
		}	// end catch
	} // main

} // class