package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class TestStream {
	
	public TestStream() {
		
		// C:/dev/temp/java_write4.txt 파일을 생성한 후
		// C:/dev/temp/java_read.txt에서 읽어 들여 java_write4.txt에 쓰는 코드를 작성해보세요.
		// 단, C:/dev/temp/java_write4.txt 파일이 존재하지 않으면 파일을 생성하고,
		// 존재한다면 덮어쓸 것인지를 물어본 후 파일에 덮어쓴다.
		
		File file = new File("/Users/juhee/eclipse-workspace/sist/temp/java_write4.txt");
		
		if(file.exists()) {
			int option = JOptionPane.showConfirmDialog(null, file.getName() + " 파일이 이미 존재합니다. 덮어 쓸까요?");
			if(option != JOptionPane.OK_OPTION) {
				return;
			}	// end if
		}	// end if
			
		String readData = "";
		StringBuilder sb = new StringBuilder();
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File("C:/dev/temp/java_read.txt")))){
			while((readData = br.readLine()) != null) {
				sb.append(readData).append("\n");
			}	// end while
		} catch(IOException ie) {
			ie.printStackTrace();
		}	// end catch
			
		try(FileWriter fw = new FileWriter(file)){
			fw.write(sb.toString());
			fw.flush();
		} catch(IOException ie) {
			ie.printStackTrace();
		}	// end catch

	}	// TestStream

	public static void main(String[] args) {
		new TestStream();
	}	// main 

}	// class