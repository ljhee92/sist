package day0205;

import java.io.File;

public class UseFile3 {

	public static void main(String[] args) {
		
		// 1. 삭제할 파일명을 가진 File 객체를 생성
//		File file = new File("/Users/juhee/eclipse-workspace/sist/temp/java_read2.rtf");
		
		// 2. 삭제
//		System.out.println(file.delete());
		
		// 1. 이전 이름을 가진 파일 객체를 생성
		File file = new File("/Users/juhee/eclipse-workspace/sist/temp/java_read2.rtf");
		
		// 2. 변경할 파일 명을 저장한 객체 생성
		File file2 = new File("/Users/juhee/eclipse-workspace/sist/temp/jh.rtf");
		
		// 3. 변경
		System.out.println(file.renameTo(file2));

	}	// main

}	// class