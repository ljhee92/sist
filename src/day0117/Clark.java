package day0117;

/**
 *  사람의 공통 특징은 부모클래스 Person에 정의되어 있고, <br>
 *  자식클래스인 클락은 자신의 특별한 기능만 정의 <br>
 *  힘 레벨은 1~10까지 존재
 */

public class Clark extends Person {
	
	public int power;
	
	/**
	 * 클락의 기본생성자. 눈 2개, 코 1개, 입 1개인 사람이 태어남 <br>
	 * 클락의 힘이 쎄다.
	 */
	public Clark() {
		super();
		power = 10;
	}	// Clark

	public String power(String stone) {
		String result = "";
		
		if(stone.equals("다이아몬드")) {
			result = "감삽니다! (^^)(__)";
			power = 10;
		} else if(stone.equals("크립토나이트")) {
			result = "힘빠짐...~(_-_)~";
			power = 0;
		} else {
			result = "열받음 ㅡㅡ+";
			power = 12;
		}	// end else
		
		return result;
	}	// power

	/**
	 * 집에서 밥을 먹는 일에서 빵을 먹는 일로 Override
	 */
	@Override
	public String eat() {
		return getName() + "가 집에서 빵을 먹는다.";
	}	// eat 

	/**
	 * 식당에서 화폐단위가 원인 일에서 레스토랑에서 화폐단위가 $인 일로 Override 
	 */
	@Override
	public String eat(String menu, int price) {
		return getName() + "이 레스토랑에서 " + menu + "을 " + price + "$ 주고 사먹는다.";
	}
	
}	// class