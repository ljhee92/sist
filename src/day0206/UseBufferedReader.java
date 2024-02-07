package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferedReader를 사용한 줄단위 읽기
 */
public class UseBufferedReader {
	
	public UseBufferedReader() throws FileNotFoundException, IOException {
		
		// 1. 파일 생성
		File readFile = new File("/Users/juhee/eclipse-workspace/sist/temp/java_read.txt");

		if(!readFile.exists()) {
			System.out.println(readFile.getAbsolutePath() + "는 존재하지 않습니다.");
			return;
		}	// end if
		
		// 2. 스트림 생성 -> 파일과 연결
//		FileInputStream fis = new FileInputStream(readFile);
		
		// 3. InputStreamReader 생성 -> 8bit stream과 16bit stream을 연결
//		InputStreamReader isr = new InputStreamReader(fis);
		
		// 4. BufferedReader 생성 -> 연결된 파일에서 줄 단위로 읽어 들이는 일
//		BufferedReader br = new BufferedReader(isr);
		
		// 1~4. 결합 (Stream과 InputStreamReader 객체로 무언갈 하지 않을 때)
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(readFile)));
			// 5. 스트림에 연결된 파일의 내용 읽기
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}	// end while
		} finally {	// 메모리 누수가 발생하지 않도록 연결은 무조건 끊어주기
			// 6. 스트림의 연결 끊기
			if(br != null) {	// NullPointerException을 막기 위해
				br.close();
			}	// end if
		}	// end finally
		
	}	// UseBufferedReader

	public static void main(String[] args) {
		try {
			new UseBufferedReader();
		} catch (IOException e) {
			System.err.println("파일을 읽어들이는 동안 문제가 발생했습니다.");
			e.printStackTrace();
		}	// end catch
	}	// main

}	// class