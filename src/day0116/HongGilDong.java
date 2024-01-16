package day0116;

/**
 * 사람의 공통 특징은 부모클래스인 Person에 저장되어 있고 <br>
 * 자식클래스인 HongGilDong은 자신의 특별한 기능만 정의 <br>
 * 싸움 레벨은 1~10까지 존재
 */

public class HongGilDong extends Person {
	
	private int level;
	
	/**
	 * 홍길동의 기본 생성자. 눈 2개, 코 1개, 입 1개인 사람이 태어남 <br>
	 * 홍길동은 싸움을 평민보다 잘한다.
	 */
	public HongGilDong() {
		super();	// 자식클래스의 기본 생성자 호출 시 부모클래스의 기본 생성자는 자동으로 호출, 숨어있음.
		level = 6;
	}	// HongGilDong
	
	public String fight(int yourLevel) {
		String result = "";
		
		if(level < yourLevel) {	// 싸움에서 지는 경우
			result = "싸움에서 졌음 o(>.<)o";
			level--;
			if(level < 1) {
				level = 1;
			}	// end if
		} else if(level > yourLevel) {	// 싸움에서 이기는 경우
			result = "싸움에서 이겼음! s('.^)v";
			level++;
			if(level > 10) {
				level = 10;
			}	// end if
		} else {	// 비기는 경우 
			result = "비겼음 ㅡ.,ㅡ;;";
		}	// end else
		
		return result;
	}	// fight

	public int getLevel() {
		return level;
	}	// getLevel
	
}	// class