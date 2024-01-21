package day0119;

public class UseStringBuilder {
	
	public void useStringBuffer() {
		// 1. 객체화
		StringBuffer sb = new StringBuffer();
		
		// 2. 객체가 제공하는 method 사용
		
		// 값을 객체가 참조하는 공간에 추가
		sb.append("안녕");
		sb.append(true);
		sb.append(2024);
		
		// 특정 위치에 값 추가
		sb.insert(6, "수원시의 자랑 윤웅찬");
		
		// 특정 범위의 값 삭제: delete(시작인덱스, 끝인덱스+1)
		sb.delete(10, 13);
		sb.delete(0, sb.length());
		sb.append("hello");
		
		// sb가 참조하는 메모리에 hello가 들어있는지 비교하는 코드 작성. hello와 같으면 true
		System.out.println(sb.toString().equals("hello"));
		
		// sb에는 소문자가 들어있다. 대문자로 출력
		System.out.println(sb.toString().toUpperCase());
	}	// useStringBuffer
	
	public void useStringBuilder() {
		// 1. 객체화
		StringBuilder sb = new StringBuilder();
		
		// 2. 객체가 제공하는 method 사용
		
		// 값을 객체가 참조하는 공간에 추가
		sb.append("안녕");
		sb.append(true);
		sb.append(2024);
		
		// 특정 위치에 값 추가
		sb.insert(6, "수원시의 자랑 윤웅찬");
		
		// 특정 범위의 값 삭제: delete(시작인덱스, 끝인덱스+1)
		sb.delete(10, 13);
		sb.delete(0, sb.length());
		sb.append("hello");
		
		// sb가 참조하는 메모리에 hello가 들어있는지 비교하는 코드 작성. hello와 같으면 true
		System.out.println(sb.toString().equals("hello"));
		
		// sb에는 소문자가 들어있다. 대문차로 출력
		System.out.println(sb.toString().toUpperCase());
	}	// useStringBuilder

	public static void main(String[] args) {
		
		UseStringBuilder usb = new UseStringBuilder();
		System.out.println("----------------StringBuffer----------------");
		usb.useStringBuffer();
		System.out.println("----------------StringBuilder----------------");
		usb.useStringBuilder();

	}	// main

}	// class