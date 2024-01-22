package day0122;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *  Calendar class : <br>
 *  단편적인 날짜 정보를 얻을 때 사용하는 클래스
 */

public class UseCalendar {
	
	public UseCalendar() {
		
		// 1. 객체 생성: 추상클래스이므로 직접 객체화되지 않는다.
//		Calendar cal = new Calendar();
		
		// - static method인 getInstance()를 사용 
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " + cal);
		
		// - 자식클래스인 GregorianCalendar를 사용(is a 관계의 객체화)
		Calendar cal2 = new GregorianCalendar();
		System.out.println("cal2 : " + cal2);
		
		// constant를 사용하여 얻기
		StringBuilder sb = new StringBuilder();
		
		int year = cal.get(Calendar.YEAR);	// 년도 얻기
		int month = cal.get(Calendar.MONTH);	// 월 얻기: 0~11월까지 12개월 사용
		int day = cal.get(Calendar.DAY_OF_MONTH);	// 일 얻기
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);	// 오늘이 이번년도의 몇 번째 날인지
		
		sb.append(year).append("년 ").append(month+1).append("월 ").append(day).append("일 \n");
		sb.append("오늘은 이번년도의 ").append(dayOfYear).append("번째 날\n");
		
		// 요일을 문자열로 출력 1-일요일, 2-월요일, 3-화요일, ,,, 7-일요일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);	// 요일 얻기: 요일의 index가 1부터 반환
		sb.append("일,월,화,수,목,금,토".split(",")[dayOfWeek-1]).append("요일\n");
		
		// 오전, 오후 얻기: 0~1로 반환
		int amPm = cal.get(Calendar.AM_PM);
		sb.append("오전,오후".split(",")[amPm] + " ");
		
		// 시간, 분, 초 얻기
		int hour = cal.get(Calendar.HOUR);	// 12시간제
		int hour2 = cal.get(Calendar.HOUR_OF_DAY);	// 24시간제
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		sb.append(hour).append("(").append(hour2).append("):").append(minute).append(":").append(second).append("\n");
		
		System.out.println(sb);
		
		// 특정 날짜로 변경: set(필드, 변경할값);
		cal.set(Calendar.YEAR, 2023);	// 년 변경
		cal.set(Calendar.MONTH, 3);		// 월 변경
//		cal.set(Calendar.DAY_OF_MONTH, 2);	// 일 변경
		cal.set(Calendar.DAY_OF_MONTH, 31);	// 현재 월에 존재하지 않는 일로 설정하면 자바에서 자동으로 다음달 1일로 변경
		
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}	// UseCalendar

	
	public static void main(String[] args) {
		
		new UseCalendar();

	}	// main

}	// class