package day0122;

import java.time.LocalDate;
import java.util.Calendar;

public class HomeWork0122 {
	
	public static final int START_DAY = 1;
	
	/**
	 * 1. Calendar 클래스를 사용하여 1월의 달력을 출력
	 */
	public void printJAN() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 0);
		int month = cal.get(Calendar.MONTH);
		
		System.out.println("\t\t\t" + (month+1) + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int day = 0;
		int dayOfWeek = 0;	// 요일을 저장하기 위한 변수
		StringBuilder sb = new StringBuilder();	// 반복문 안에서 출력을 한 번만 하도록 설정
		
		for(int tempDay = 1; ; tempDay++) {		// 끝나는 날을 몰라
			cal.set(Calendar.DAY_OF_MONTH, tempDay);	// 증가하는 일을 달력 객체에 설정
			day = cal.get(Calendar.DAY_OF_MONTH);
			if(day != tempDay) {	// 설정된 일자와 임시 일자가 같지 않으면 월이 끝났기 때문에 반복문 종료
				break;
			}	// end if
			dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			switch(day) {
			case START_DAY : 
				for(int i = 1; i < dayOfWeek; i++) {	// i가 day의 요일에 해당하는 숫자가 되기 전까지 공백 출력
					sb.append("\t");					// 1일 출력 전 공백 출력
				}	// end for
			}	// end switch~case
			sb.append(day).append("\t");	// 일자 출력
			switch(dayOfWeek) {				// 요일에 해당하는 숫자가
			case Calendar.SATURDAY :		// 토요일이면 
				sb.append("\n");			// 줄바꿈
			}	// end switch~cse
		}	// end for
		System.out.println(sb);
	}	// printJAN
	
	
	/**
	 * 2. 매개변수로 년,월을 입력받아 해당 년,월에 대한 마지막 일까지를 일차원 배열에 할당하여 반환하는 일을 하는 method
	 *  (마지막 일을 하는 method를 찾아볼 것 -  LocalDate클래스를 사용해볼 것)
	 * @param year 년 
	 * @param month 월
	 * @return 해당 년, 월의 첫날~마지막 날 일자
	 */
	public int[] returnAllDay(int year, int month) {
		LocalDate ld = LocalDate.of(year, month, 1);
		int dayFirst = ld.getDayOfMonth();
		int dayEnd = ld.lengthOfMonth();
		int[] result = new int[dayEnd];
		
		for(int i = 0; i < dayEnd; i++) {
			result[i] = dayFirst;
			dayFirst++;
		}	// end for
		
		return result;
	}	// returnAllDay
	
	public void printAllDay(int[] returnAllDay) {
		for(int allDay :returnAllDay) {
			System.out.print(allDay + " ");
		}	// end for
	}	// end printAllDay

	public static void main(String[] args) {
		
		HomeWork0122 hw = new HomeWork0122();
		hw.printJAN();
		System.out.println("-----------------------------------------------------");
		hw.printAllDay(hw.returnAllDay(2024, 2));
	}	// main

}	// class