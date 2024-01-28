package day0122;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimePackage2 {
	
	public void useDate() {
		LocalDate ld = LocalDate.now();
		System.out.println(ld.getYear() + "-" + ld.getMonthValue() + "(" + ld.getMonth() + ")-" + ld.getDayOfMonth()
		+ "\n오늘이 이번년도의 몇 번째 날: " + ld.getDayOfYear() + "번째 날"
		+ "\n요일: " + ld.getDayOfWeek()
		+ "\n" + ld.getDayOfWeek().getValue() + "요일");	
	}	// useDate
	
	
	public void useTime() {
		LocalTime lt = LocalTime.now();
		System.out.println(lt.getHour() + ":" + lt.getMinute() + ":" + lt.getSecond());
	}	// useTime
	
	
	public void useDateTime() {
		// 1. 날짜 관련 클래스 생성
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt.getYear() + "-" + ldt.getMonthValue() + "-" + ldt.getDayOfMonth()
		+ " " + ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond());
		
		// 2. formatter 클래스 생성
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss EEEE", Locale.KOREA);
		
		// 3. 날짜 관련 클래스의 format method 호출하여 fomatter 할당
		// ldt와 dtf는 has a 관계
		String dateFormat = ldt.format(dtf);
		System.out.println(dateFormat);
	}	// useDateTime
	

	public static void main(String[] args) {
		
		TimePackage2 tp2 = new TimePackage2();
		
		System.out.println("--------------------LocalDate--------------------");
		tp2.useDate();
		System.out.println("--------------------LocalTime--------------------");
		tp2.useTime();
		System.out.println("--------------------LocalDateTime--------------------");
		tp2.useDateTime();

	}	// main

}	// class