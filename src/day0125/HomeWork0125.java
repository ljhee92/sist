package day0125;

import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *  프로그램이 실행되면 현재 월의 달력을 만들어서, JButton을 사용하여 보여주는 Window Application을 작성
 */

@SuppressWarnings("serial")
public class HomeWork0125 extends JFrame {
	
	private static final int START_DAY = 1;
	
	public HomeWork0125(int month) {
		super("달력 Applicaiton");
		setLayout(new GridLayout(5, 7));
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month-1);
		int day = 0;
		int dayOfWeek = 0;
		
		JButton jbtnGap = new JButton();
		for(int i = START_DAY; ; i++) {
			JButton jbtnDay = new JButton(Integer.toString(i));
			cal.set(Calendar.DAY_OF_MONTH, i);
			day = cal.get(Calendar.DAY_OF_MONTH);
			if(day != i) {
				break;
			}	// end if
			dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			switch(day) {
			case START_DAY :
				for(int j = 1; j < dayOfWeek; j++) {
					add(jbtnGap);
				}	// end for
			}	// end switch~case
			add(jbtnDay);
		}	// end for
		
		setBounds(100, 100, 500, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	// HomeWork0125
		
	public static void main(String[] args) {
		new HomeWork0125(1);
	}	// main 

}	// class