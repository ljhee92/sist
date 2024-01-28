package day0125;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HomeWork0125_2 extends JFrame {
	
	LocalDate ld = LocalDate.now();

	public HomeWork0125_2() {
		super("달력");		

		setLayout(new GridLayout(0, Calendar.SATURDAY));	// 그리드의 행이 해당 월의 마지막날의 주로 설정
		setBounds(100,100,500,400);
		
		if(lastMonth().length != 7) {
			addButtons(lastMonth());
		}	// end if
		addButtons(thisMonth());
		
		if(nextMonth().length != 7) {
			addButtons(nextMonth());
		}	// end if
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	// HomeWork0125_2
	
	public void addButtons(String[] daysArr) {		// 버튼 생성
		JButton[] jbtnArr = new JButton[daysArr.length];
			for(int i = 0; i < daysArr.length; i++) {
				jbtnArr[i] = new JButton(daysArr[i]);
				jbtnArr[i].setBackground(new Color(0x2F2F2F));	// 맥에서는 적용이 안된다?
				jbtnArr[i].setFont(new Font("맑은 고딕", Font.BOLD, 20));
				if(daysArr.length < 7) {
					jbtnArr[i].setForeground(Color.gray);
				} else {
					jbtnArr[i].setForeground(Color.black);
				}	// end else
				add(jbtnArr[i]);
			}	// end for
	}	//addButtons

	public String[] lastMonth() {
		Calendar cLast = Calendar.getInstance();
		LocalDate ld = LocalDate.now();
		LocalDate ldLast;
		if(ld.getMonthValue()==1) {		// 현재 월이 1월이라면
			ldLast = ld.minusYears(1);	// 연도를 1년 줄여주고,
			ldLast = ld.minusMonths(1);	// 월은 1개월 줄여준다(캘린더의 12월이 0~11이므로)
		} else {						// 현재 월이 1월이 아니라면
			ldLast = ld.minusMonths(1);	// 월만 1개월 줄여준다.
		}	// end else
		cLast.set(Calendar.YEAR, ldLast.getYear()); 	// 줄여준 연도와
		cLast.set(Calendar.MONTH, ldLast.getMonthValue()-1);	// 월로 캘린더를 설정한다.
		int lastDay = ldLast.lengthOfMonth();	// 지난 월의 마지막 날
		cLast.set(Calendar.DAY_OF_MONTH, lastDay);
		int dayOfWeek = cLast.get(Calendar.DAY_OF_WEEK);
		
		String[] lastDaysArr = new String[dayOfWeek];
		for(int i = dayOfWeek; i > 0; i--) {
			lastDaysArr[i-1] = Integer.toString(lastDay);
			lastDay--;
		}	// end for
		return lastDaysArr;
	}	// lastMonth
	
	public String[] thisMonth() {
		Calendar cNow = Calendar.getInstance();
		int lastDay = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);		// 현재 월의 마지막 날
		
		String[] daysArr = new String[lastDay];
		for(int i = 0; i < lastDay; i++) {
			daysArr[i] = Integer.toString(i+1);
		}	// end for
		return daysArr;
	}	// thisMonth
	
	public String[] nextMonth() {
		Calendar cNext = Calendar.getInstance();
		LocalDate ld = LocalDate.now();
		LocalDate ldNext;
		if(ld.getMonthValue() == 12) {
			ldNext = ld.plusYears(1);
			ldNext = ld.plusMonths(1);
		} else {
			ldNext = ld.plusMonths(1);
		}	// end else
		cNext.set(Calendar.YEAR, ldNext.getYear()); 
		cNext.set(Calendar.MONTH, ldNext.getMonthValue()-1);
		
		int firstDay = cNext.getActualMinimum(Calendar.DAY_OF_MONTH);	// 다음 월의 1일
		cNext.set(Calendar.DAY_OF_MONTH, firstDay);
		int dayOfWeek = cNext.get(Calendar.DAY_OF_WEEK);
		
		String[] nextDaysArr = new String[Calendar.SATURDAY - dayOfWeek + 1];
		for(int i = 0; i < nextDaysArr.length; i++) {
			nextDaysArr[i] = Integer.toString(firstDay);
			firstDay++;
		}	// end for
		return nextDaysArr;
	}	// nextMonth
	
	public static void main(String[] args) {
		new HomeWork0125_2();
	}	// main

}	// class