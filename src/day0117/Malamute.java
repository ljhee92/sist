package day0117;

/**
 *  Dog 클래스를 상속받는 자식 클래스(말라뮤트)
 */

public class Malamute extends Dog {
	
	public Malamute() {
		System.out.println("말라뮤트는 순해!");
	}	// Malamute

	
	/**
	 * 개가 주인을 보면 짖는 동사적 특징 중 말라뮤트는 웃으면서 짖는 일을 Override 
	 */
	@Override
	public String bark(int count) {
		return getName() + "은 주인을 보면 " + count + "번 웃으면서 왕왕 짖는다! ૮ ˶ ˆ ᴥ ˆ ˶ ა";
	}	// bark

}	// class