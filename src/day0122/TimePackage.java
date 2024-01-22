package day0122;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *  JDK1.8에서 지원하는 날짜 관련 클래스
 */

public class TimePackage {
	
	public TimePackage() {
		
		// 현재 날짜 정보만
//		LocalDate ld = new LocalDate();	// 생성자가 없으므로 직접 객체화 불가능
		LocalDate ld = LocalDate.now();
		
		// 현재 시간 정보만
		LocalTime lt = LocalTime.now();
		
		// 현재 날짜+시간 정보
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println("날짜: " + ld);
		System.out.println("시간: " + lt);
		System.out.println("날짜와 시간: " + ldt);
		System.out.println("----------------------------------------");
		
		// 특정 날짜 정보: of()
		LocalDate ld2 = LocalDate.of(2025, 2, 12);
		LocalTime lt2 = LocalTime.of(17, 50, 10);
		LocalDateTime ldt2 = LocalDateTime.of(2024, 3, 1, 14, 25);
		LocalDateTime ldt3 = LocalDateTime.of(ld2, lt2);
		
		System.out.println("날짜: " + ld2);
		System.out.println("시간: " + lt2);
		System.out.println("날짜와 시간1: " + ldt2);
		System.out.println("날짜와 시간2: " + ldt3);
		
	}	// TimePackage

	
	public static void main(String[] args) {
		
		new TimePackage();

	}	// main 

}	// class