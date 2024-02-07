package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 16bit stream을 사용한 텍스트 파일의 내용 읽기
 */
public class UseFileReader {
	
	public UseFileReader() throws IOException {
		
		// 1. 파일 생성
		File readFile = new File("/Users/juhee/eclipse-workspace/sist/temp/java_read.txt");
		
		if(!readFile.exists()) {
			System.out.println(readFile.getAbsolutePath() + "는 존재하지 않습니다.");
			return;
		}	// end if
		
		// 2. 스트림 생성 -> 파일과 연결
//		FileReader fr = new FileReader(readFile);
		
		// 3. BufferedReader 생성 -> 줄 단위로 읽기 위한 일
//		BufferedReader br = new BufferedReader(fr);
		
		// 2~3. 결합
		BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader(readFile));
			// 4. 스트림에 연결되어있는 파일을 읽어 들인다.
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}	// end while
		} finally {
			// 5. 스트림 연결 끊기
			if(br != null) {
				br.close();
			}	// end if
		}	// end finally
		
	}	// UseFileReader

	public static void main(String[] args) {
		try {
			new UseFileReader();
		} catch (IOException e) {
			e.printStackTrace();
		}	// end catch
	}	// main

}	// class