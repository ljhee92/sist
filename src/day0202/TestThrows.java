package day0202;

import java.util.Random;

public class TestThrows {
	
	/**
	 *  method에서 throws로 예외를 던지면, 호출한 곳에서 예외를 잡아 처리를 하게 된다. <br>
	 *  예외 발생 예상 코드를 가진 method 안에서는 try~catch로 처리할 필요가 없다.
	 */
	public void loadClass() throws ClassNotFoundException {
		
		String clsName = "java.lang.String";
		if(new Random().nextBoolean()) {
			clsName = "Java.lang.String2";
		}	// end if
		Class cls = Class.forName(clsName);
		
		// 정상일 때의 코드
		System.out.println(cls + " 클래스를 로딩하였습니다.");
		
	}	// TestThrows

	public static void main(String[] args) {
		TestThrows tt = new TestThrows();
		try {
			tt.loadClass();
		} catch (ClassNotFoundException cnfe) {
			// 비 정상적일 때의 코드
			cnfe.printStackTrace();
		}	// end catch
		
	}	// main

}	// class