package day0116;

/**
 * 사람을 추상화하여 구현하는 클래스 <br>
 *  - 명사적 특징: 눈, 코, 입 <br>
 *  - 동사적 특징: 먹는 일 <br>
 *  <br>
 *  객체 생성을 하여 사용하는 일반 클래스 <br>
 *  사용법) <br>
 *  Person 객체명 = new Person(); <br>
 *  객체명.method()를 호출하여 사용
 */

public class Person {
	
	/**
	 * 눈 2개, 코 1개, 입 1개인 사람 객체를 생성할 때 사용하는 기본 생성자(Default Constructor)
	 */
	public Person() {
//		this.eye = 2;
//		this.nose = 1;
//		this.mouth = 1;
		this(2, 1, 1);
	}	// Person
	
	
	/**
	 * 눈 n개, 코 n개, 입 n개인 사람 객체를 생성할 때 사용하는 overloading된 생성자
	 * @param eye 눈의 개수 
	 * @param nose 코의 개수
	 * @param mouth 입의 개수 
	 */
	public Person(int eye, int nose, int mouth) {
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
	}	// Person
	
	private int eye, nose, mouth;
	private String name;
	public String nick;
	
	/**
	 * 생성된 사람 객체의 눈 개수를 설정하는 일
	 * @param eye 설정할 눈의 개수
	 */
	public void setEye(int eye) {
		this.eye = eye;
	}	// setEye
	
	
	/**
	 * 생성된 사람 객체의 코 개수를 설정하는 일
	 * @param nose 설정할 코의 개수
	 */
	public void setNose(int nose) {
		this.nose = nose;
	}	// setNose
	
	
	/**
	 * 생성된 사람 객체의 입 개수를 설정하는 일
	 * @param mouth 설정할 입의 개수
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}	// setMouth
	
	
	/**
	 * 생성된 사람 객체의 이름을 설정하는 일
	 * @param name 설정할 이름
	 */
	public void setName(String name) {
		this.name = name;
	}	// setName
	
	
	/**
	 * 사람 객체의 설정된 눈의 개수를 반환하는 일
	 * @return 설정된 눈의 개수
	 */
	public int getEye() {
		return eye;
	}	// getEye
	
	
	/**
	 * 사람 객체의 설정된 코의 개수를 반환하는 일
	 * @return 설정된 코의 개수
	 */
	public int getNose() {
		return nose;
	}	// getNose
	
	
	/**
	 * 사람 객체의 설정된 입의 개수를 반환하는 일
	 * @return 설정된 입의 개수
	 */
	public int getMouth() {
		return mouth;
	}	// getMouth
	
	
	/**
	 * 사람 객체의 설정된 이름을 반환하는 일
	 * @return 설정된 이름
	 */
	public String getName() {
		return name;
	}	// getName
	
	
	/**
	 * 사람 객체의 동사적 특징인 먹는 일을 구현하는 method
	 * @return 밥을 먹는 행동
	 */
	public String eat() {
		return name + "이/가 집에서 밥을 먹는다.";
	}	// eat
	
	
	/**
	 * 사람 객체의 동사적 특징 중 식당에서 밥을 사먹는 일을 구현하는 method
	 * @param menu 음식 메뉴 
	 * @param price 음식 가격
	 * @return 밥을 먹는 행동
	 */
	public String eat(String menu, int price) {
		return name + "이/가 식당에서 " + menu + "을/를 " + price + "원 주고 사먹는다.";
	}	// eat

}	// class
