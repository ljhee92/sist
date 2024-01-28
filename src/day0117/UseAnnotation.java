package day0117;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UseAnnotation {
	
	@Deprecated	// 비추천 method
	public void test() {
		System.out.println("오늘은 수요일입니다.");
		Date date = new Date();
		System.out.println(date.getYear()+1900);
	}	// test

	
	@SuppressWarnings({ "unused", "rawtypes" })
	public void test2() {
//		@SuppressWarnings("unused")	// 변수 위에 걸면 변수마다 걸어줘야 함. 
		int day;
		int j;
		int k;
		
		List list = new ArrayList();
	}	// test2
	
	
	// Override는 부모 클래스가 가지고 있는 method를 자식 클래스에서 그대로 정의하는 것.
	@Override
	public String toString() {	// Object 클래스에 있는 toString method를 Override한 method
		return "생성된 객체의 주소가 아닌 메세지";
	}	// toString 
	
	public static void main(String[] args) {
		
		UseAnnotation ua = new UseAnnotation();
		ua.test();
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		System.out.println(ua);		// 내 객체: 주소 -> 내 클래스에서 toString을 Override하면 내가 원하는 메세지 출력!
		System.out.println(d);		// 자바제공 객체: 메세지 -> Data 클래스에서 toString을 Override함
		System.out.println(sdf);	// 자바제공 객체: 주소 

	}	// main

}	// class