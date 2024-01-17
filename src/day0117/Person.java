package day0117;

/**
 * 사람을 추상화하여 구현하는 클래스 -> 사람의 공통적인 특징만 정의 <br>
 * -> 추상클래스로 변환 (추상클래스: 상속관계에서 부모클래스를 만들 때 사용) <br> 
 *  - 명사적 특징: 눈, 코, 입 <br>
 *  - 동사적 특징: 먹는 일 -> 자식클래스가 부모가 정의한 먹는 일을 사용하지 않지만, <br>
 *  					사람은 먹는 일을 반드시 해야한다. -> 추상 method로 변환 <br>
 *  <br>
 *  객체 생성을 하여 사용하는 일반 클래스 <br>
 *  사용법) <br>
 *  Person 객체명 = new Person(); <br>
 *  객체명.method()를 호출하여 사용
 */

public abstract class Person {
	
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
	 * 사람 객체의 동사적 특징인 먹는 일을 정의한 method <br>
	 * 집에서 먹는 일은 자식 클래스에서 자신에 맞게 구현한다.
	 * @return 집에서 무언가를 먹는 행동
	 */
	public abstract String eat();
	
	
	/**
	 * 사람 객체의 동사적 특징 중 외부에서 사먹는 일을 정의한 method <br>
	 * 밖에서 사먹는 일은 자식 클래스에서 자신의 상황에 맞게 구현한다.
	 * @param menu 음식 메뉴 
	 * @param price 음식 가격
	 * @return 밥을 먹는 행동
	 */
	public abstract String eat(String menu, int price);


	/**
	 * UsePerson class에서 toString() method로 어느 사람을 찍어도 닝겐이 나오도록 Override <br>
	 * 홍길동처럼 자식클래스에 또 toString() method가 Override 되어있다면 자식클래스의 method 호출
	 */
	@Override
	public String toString() {
		return "닝겐입니다.";
	}	// toString

}	// class
