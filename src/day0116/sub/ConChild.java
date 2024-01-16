package day0116.sub;

public class ConChild extends ConParent {
	
	// 부모의 인자 생성자 2024 > 부모의 기본생성자 > 자식의 기본생성자 > 자식의 인자생성자 10
	public ConChild() {
		System.out.println("자식의 기본생성자");
	}	// ConChild
	
	public ConChild(int i) {
		this();
		System.out.println("자식의 인자 생성자 " + i);
	}	// ConChild
	
//	부모의 기본생성자 > 부모의 인자 생성자 100 > 자식의 인자 생성자 100 >  자식의 기본생성자
//	public ConChild() {
//		this(100);
//		System.out.println("자식의 기본생성자");
//	}	// ConChild
//	
//	public ConChild(int i) {
//		super(100);
//		System.out.println("자식의 인자 생성자 " + i);
//	}	// ConChild

	public static void main(String[] args) {
		
		ConChild c = new ConChild(10);

	}	// main

}	// class