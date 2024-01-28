package day0117;

/**
 *  Dog 클래스에서 제공하는 일을 사용하기 위한 클래스
 */

public class UseDog {
	
	private void useDog() {
		
		Chihuahua chh = new Chihuahua();
		chh.setName("와와헴");
		System.out.println(chh.angry(0) + "\n" + chh.angry(1) +  "\n" + chh.angry(2));
		System.out.println(chh.bark());
		System.out.println(chh.bark(10));
		
		System.out.println("--------------------------------------------");

		Malamute mm = new Malamute();
		mm.setName("말뮤");
		System.out.println(mm.bark());
		System.out.println(mm.bark(1));
		
	}	// useDog

	public static void main(String[] args) {
		
		UseDog us = new UseDog();
		us.useDog();

	}	// main

}	// class