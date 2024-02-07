package day0206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTryWithResources {

	public static void main(String[] args) {
		
		// 키보드의 입력값을 줄 단위로 읽기
		// 개발자가 close하지 않아도 JVM에서 모든 스트림을 close()해준다.
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("아무 키나 누르고 엔터");
			String readData = br.readLine();
			System.out.println("입력 값: " + readData);
		} catch(IOException ie) {
			ie.printStackTrace();
		}	// end if
		
		// try ~ with ~ resources는 static인 stream(in, out, err)을 사용하지 않는다.
		// 다 끊어버리기 때문에..
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("아무 키나 누르고 엔터2");
			String readData = br.readLine();
			System.out.println("입력 값: " + readData);
		} catch(IOException ie) {
			ie.printStackTrace();
		}	// end if
		
	}	// main

}	// class