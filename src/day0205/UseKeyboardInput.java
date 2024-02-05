package day0205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 키보드의 입력 값 받기
 */
public class UseKeyboardInput {
	
	public UseKeyboardInput() throws IOException {
		
		System.out.println("아무 키나 누르고 엔터");
//		int readData = System.in.read();
//		System.out.println("입력 값: " + readData);
		
//		int readData = 0;
//		while((readData = System.in.read()) != 10) {	// 13(윈도우에만 존재): \n, 10: \r
//			System.out.println("입력 값:" + readData);
//		}	// end while

		// 입력한 모든 문자열이 그대로 출력되는 코드 작성 (단점: 한글을 출력할 수 없다.)
//		int readData = 0;
//		while((readData = System.in.read()) != 10) {	// 13(윈도우에만 존재): \n, 10: \r
//			System.out.print((char)readData);
//		}	// end while
		
		// 한글을 줄 단위로 읽어서 보여줄 수 있는 16bit stream의 사용.
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String readData = br.readLine();
			System.out.println("입력 값: " + readData);
		} finally {	// try 블럭 안에서 예외가 터져도, 안 터져도 실행되는 코드 블럭 
			if(br != null) {	// br 객체가 만들어졌을 때만 stream 연결을 끊도록 조건 지정 
				br.close();		// 연결이 끊어지지 않으면 메모리 누수가 발생한다.
			}	// end if
		}	// end finally
		
	}	// UseKeyboardInput
	
	public static void main(String[] args) {
		try {
			new UseKeyboardInput();
		} catch (IOException e) {	// UseKeyboardInput() 생성자 안에서 발생하는 여러 개의 예외(IOException)를 묶어서 처리할 수 있다.
			e.printStackTrace();
		}	// end catch
	}	// main

}	// class