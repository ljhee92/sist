package day0118;

import java.util.Arrays;

public class HomeWork0118 {
	
	public HomeWork0118() {		
	}	// HomeWork0118
	
	/**
	 *  데이터 배열에서 임의의 값 하나를 출력하는 일
	 */
	public void printMzArr() {
		String[] mzArr = {"어쩔티비", "저쩔티비", "뇌절티비", "안물티비", "안궁티비", "때리고싶쥬~", "못때리쥬~", "개킹받쥬~"};
		System.out.println(mzArr[(int)(Math.random()*mzArr.length)]);
	}	// printArrVal
	
	
	/**
	 *  8자리의 숫자, 소문자, 대문자로 구성된 임의의 비밀번호를 생성하고 반환하는 일
	 * @return 생성된 비밀번호
	 */
	public char[] createPw() {
		char[] pwArr = new char[8];
		
		for(int i = 0; i < pwArr.length; i++) {
			int range = (int)(Math.random()*3);
			switch (range) {
			case 0: pwArr[i] = (char)((int)(Math.random()*10)+'0');		// (char)((Math.random()*10)+48);
				break;
			case 1: pwArr[i] = (char)((Math.random()*26)+65);
				break;
			case 2: pwArr[i] = (char)((Math.random()*26)+97);
				break;
			}	// end switch~case
		}	// end for
		
		return pwArr;
	}	// printPw
	
	
	/**
	 *  1~45 숫자 중 6자리 로또번호를 구하고 반환하는 일(중복제거, 오름차순)
	 * @return 로또번호
	 */
	public String lotto() {
		String result = "";
	
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {	// 중복 제거
					i--;
				}	// end if
			}	// end for
		}	// end for
		
		int max = 0;
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				if(lotto[i] < lotto[j]) {
					max = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = max;
				} // end if
			}	// end for
		}	// end for
		
		result = Arrays.toString(lotto);
		return result;
	}	// lotto

	
	public static void main(String[] args) {
		
		HomeWork0118 hw = new HomeWork0118();
		
		hw.printMzArr();
		System.out.println(hw.createPw());
		System.out.println(hw.lotto());
		
	}	// main

}	// class