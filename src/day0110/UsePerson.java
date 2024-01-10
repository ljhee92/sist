package day0110;

/**
 * Person 클래스를 사용하기 위해(Person에서 제공하는 일을 하기 위해) 만든 클래스
 */

public class UsePerson {
	
	/**
	 *  Person 클래스를 사용하기 위한 method
	 */
	private void usePerson() {
		
		// 객체화: 사람이 태어난 것! -> 기본적으로 가지고 있어야 할 값을 가지지 않았다.
		// 객체가 생성될 때 기본적으로 가지고 있어야 할 값을 설정하는 코드를 어디에선가 작성 -> 생성자가 필요한 이유
		Person ogong = new Person();
		ogong.setName("손오공");
		
		// 명사적 특징 설정, 생성자를 통한 기본 값(눈, 코, 입의 개수)는 설정됨
		System.out.printf("%s은 눈 %d개, 코 %d개, 입 %d개인 사람이다.\n", ogong.getName(), ogong.getEye(), ogong.getNose(), ogong.getMouth());
		
		// 동사적 특징: Overloading
		System.out.println(ogong.eat());
		System.out.println(ogong.eat("돈까스", 10000));
		
		
		/////////////////////////////////////// 자신을 객체화하여 사용하는 코드 작성 ///////////////////////////////////////

		Person juhee = new Person();
		juhee.setName("이주희");
		
		System.out.printf("%s는 눈 %d개, 코 %d개, 입 %d개인 사람이다.\n", juhee.getName(), juhee.getEye(), juhee.getNose(), juhee.getMouth());
		System.out.println(juhee.eat());
		System.out.println(juhee.eat("두부조림", 8000));
		
		
		// 천진반 객체를 생성
		Person jinban = new Person(3, 1, 1);	// 생성자 overloading
		jinban.setName("천진반");
		System.out.printf("%s은 눈 %d개, 코 %d개, 입 %d개인 사람이다.\n", jinban.getName(), jinban.getEye(), jinban.getNose(), jinban.getMouth());
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("선두", 0));
		
	}	// usePerson

	public static void main(String[] args) {
		
		// usePerson method와 연결하기 위해 객체화
		UsePerson up = new UsePerson();
		up.usePerson();

	}	// main

}	// class
