package day0117;

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

	@Override
	public String eat() {
		return getName() + "이 집에서 밥을 먹는다.";
	}
	
	/**
	 * 식당에서 화폐단위가 원인 일에서 주막에서 화폐단위가 푼인 일로 Override
	 */
	@Override
	public String eat(String menu, int price) {
		return getName() + "이 주막에서 " + menu + "을 " + price + "푼 주고 사먹는다.";
	}	// eat

	/**
	 * 최상위 부모클래스인 Object의 toString() method를 Override
	 */
	@Override
	public String toString() {
		return "나는 홍길동이다";
	}	// toString

}	// class