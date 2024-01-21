package day0118;

import day0117.Clark;

public class UseAnonymous {
	
	public void testFly(Fly fly) {
		// 객체다형성: fly는 어느 때에는 FlyImpl이 되고, 어느 때에는 Clark이 될 수 있다.
		System.out.println("추력: " + fly.drivingForce());
		System.out.println("양력: " + fly.lift());
	}	// testFly

	public static void main(String[] args) {
		
		// testFly를 호출해보세요!
		UseAnonymous ua = new UseAnonymous();
//		ua.testFly(new Fly());	// Fly는 interface이므로 객체화할 수 없다. 
		ua.testFly(new FlyImpl());	// interface를 상속하는 class를 만들고, 객체화하여 arguments로 넣어준다. -> class 만들기 귀찮..
		ua.testFly(new Clark());
		
		// 클래스 파일(소스코드)를 별도로 만들지 않고 객체를 생성하여 arguments 값을 할당할 때
		// 보통 method가 딱 한 번만 불려질 때 사용. 한 번 이상 method를 부른다면 클래스를 만드는 것이 더 낫다.
		ua.testFly(new Fly() {		// 귀찮으니까 -> 이름이 없는 클래스(anonoymous inner class)를 부모클래스로 객체화하자.

			@Override
			public String drivingForce() {
				return "추진려어어억";
			}

			@Override
			public String lift() {
				return "양려어어어억";
			}});
		
		// method가 여러 번 불릴 때에는 클래스 만들어 호출
		Fly fly = new FlyImpl();
		ua.testFly(fly);

	}	// main

}	// class