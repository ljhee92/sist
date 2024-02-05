package day0205;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File 클래스를 사용한 파일 접근
 */
public class UseFile {

	public static void main(String[] args) {
		
		// 1. 생성
		File file = new File("/Users/juhee/eclipse-workspace/sist/temp/java_read.rtf");
		System.out.println(file);
	
		if(!file.exists()) {
			System.out.println("파일이 ㅇㅅㅇ");
			return;
		}	// end if
		
		System.out.println(file.isFile() ? "파일" : "디렉토리");
		System.out.println(file.isDirectory() ? "디렉토리" : "파일");
		System.out.println(file.canRead() ? "읽을 수 있음" : "읽을 수 없음");
		System.out.println(file.canWrite() ? "쓸 수 있음" : "쓸 수 없음");
		System.out.println(file.canExecute() ? "실행 가능" : "실행 불가능");
		System.out.println(file.isHidden() ? "숨김 파일" : "일반 파일");
		System.out.println("파일의 크기: " + file.length() + "byte");
		System.out.println("파일의 절대 경로: " + file.getAbsolutePath());
		try {
			System.out.println("파일의 규범 경로: " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}	// end catch
		System.out.println("경로만: " + file.getParent());
		System.out.println("파일명만: " + file.getName());
		long lastModified = file.lastModified();
		System.out.println("마지막 수정 날짜: " + lastModified);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("마지막 수정 날짜: " + sdf.format(new Date(lastModified)));
		
	}	// main

}	// class