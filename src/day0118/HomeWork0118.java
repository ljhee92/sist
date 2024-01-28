package day0118;

//import java.util.Arrays;

public class HomeWork0118 {
	
	public static final int PASSWORDLENGTH = 8;
	public static final int DECIMAL = 0;
	public static final int UPPERCASE = 1;
	public static final int LOWERCASE = 2;
	public static final int LOTTOLENGTH = 6;
	
	
	public HomeWork0118() {		
	}	// HomeWork0118
	
	/**
	 *  데이터 배열에서 임의의 값 하나를 출력하는 일
	 */
	public void printMzArr() {
		String[] mzArr = "어쩔티비,저쩔티비,뇌절티비,안물티비,안궁티비,때리고싶쥬~,못때리쥬~,개킹받쥬~".split(",");
		System.out.println(mzArr[(int)(Math.random()*mzArr.length)]);
	}	// printArrVal
	
	
	/**
	 *  8자리의 숫자, 소문자, 대문자로 구성된 임의의 비밀번호를 생성하고 반환하는 일
	 * @return 생성된 비밀번호
	 */
	public char[] createPw() {
		char[] pwArr = new char[PASSWORDLENGTH];
		
		for(int i = 0; i < pwArr.length; i++) {
			int range = (int)(Math.random()*3);
			switch (range) {
			case DECIMAL: pwArr[i] = (char)((int)(Math.random()*10)+'0');		// (char)((Math.random()*10)+48);
				break;
			case UPPERCASE: pwArr[i] = (char)((Math.random()*26)+65);
				break;
			case LOWERCASE: pwArr[i] = (char)((Math.random()*26)+97);
				break;	// break 생략 가능
			}	// end switch~case
		}	// end for
		
//		int num = 0;
//		for(int i = 0; i < pwArr.length; i++) {
//			num = (int)(Math.random()*122+1);
//			if((num > 47 && num < 58) || (num > 64 && num < 91) || (num > 96 && num < 123)) {
//				pwArr[i] = (char)num;
//			} else {
//				i--;
//			}	// end else
//		}	// end for
		
//		String password = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=,./<>?~`";
//		for(int i = 0; i < pwArr.length; i++) {
//			pwArr[i] = password.charAt((int)(Math.random()*password.length()));
//		}	// end for
		
		return pwArr;
	}	// printPw
	
	
	/**
	 *  1~45 숫자 중 6자리 로또번호를 구하고 반환하는 일(중복제거, 오름차순)
	 * @return 로또번호
	 */
	public String lotto() {
		String result = "";
	
		int[] lotto = new int[LOTTOLENGTH];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			for(int j = 0; j < i; j++) {	// 발생된 난수가 이전 방에 존재하는지? 중복체크용 반복
				if(lotto[i] == lotto[j]) {	// 현재의 방과 이전의 방 값이 같다면
					i--;					// 현재 방의 값을 다시 설정하기 위해 외부 for 인덱스 줄이고,	
//					break;					// 안쪽 for 빠져나간다.
				}	// end if
			}	// end for
		}	// end for
		
		int temp = 0;
		for(int i = 0; i < lotto.length; i++) {	// 오름차순 정렬
			for(int j = 0; j < lotto.length; j++) {
				if(lotto[i] < lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				} // end if
			}	// end for
		}	// end for
		
		for(int i = 0; i < lotto.length; i++) {
			result += lotto[i] + " ";
		}
		
//		result = Arrays.toString(lotto);
		return result;
	}	// lotto

	
	public static void main(String[] args) {
		
		HomeWork0118 hw = new HomeWork0118();
		
		hw.printMzArr();
		System.out.println(hw.createPw());
		System.out.println(hw.lotto());
		
	}	// main

}	// class