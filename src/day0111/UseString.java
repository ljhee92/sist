package day0111;

/**
 *  문자열의 사용 <br>
 *  문자열 저장소에 저장된 시작주소를 저장하고, 사용하기 위한 데이터 형으로 <br>
 *  java.lang.String 클래스(참조형 데이터 형 - new를 사용)를 제공한다.
 */

public class UseString {

	public static void main(String[] args) {
		
		// 기본형 형식의 사용 (new를 사용하지 않고 사용)
		String str = "ABCDE";
		
		// 참조형 형식의 사용 (new를 사용하고 사용)
		String str1 = new String("ABCDE");
		
		System.out.println("기본형 형식: " + str + ", 참조형 형식: " + str1);
		
		
		// == 비교 : 기본형 형식과 참조형 형식이 다른 결과를 반환한다.
		System.out.println("기본형 형식: " + (str == "ABCDE"));
		// true, str은 stack영역에 저장된 리터럴 시작 주소, "ABCDE"는 문자열 저장소 시작 주소
		
		System.out.println("참조형 형식: " + (str1 == "ABCDE"));
		// false, str1은 stack영역에 저장된 heap영역의 시작 주소, "ABCDE"는 문자열 저장소 시작 주소
		
		
		// equals 비교 : 기본형 형식과 참조형 형식이 같은 결과를 반환한다. -> equals method 사용 이유
		// equals 비교는 stack영역에 저장된 heap영역이 가리키고 있는 리터럴의 시작 주소와 문자열 저장소 시작 주소를 비교하므로 항상 같은 결과
		System.out.println("기본형 형식: " + (str.equals("ABCDE")));
		System.out.println("참조형 형식: " + (str1.equals("ABCDE")));
		
		
		// 길이를 구하는 method : length()
		System.out.println(str + "는 " + str.length() + "자");
		str1 = "ljhee92.sist@gmail.com";
		int leng = str1.length();
		System.out.printf("%s는 %d자\n", str1, leng);
		
		
		// 대문자, 소문자를 얻는 method : toUpperCase(), toLowerCase()
		str = "abCedF";
		System.out.println(str + "을 대문자로: " + str.toUpperCase());
		System.out.println(str + "을 소문자로: " + str.toLowerCase());
		
		
		// 특정 인덱스의 '문자'를 얻는 method : charAt()
		System.out.println(str + "에서 세번째 인덱스의 문자: " + str.charAt(3));
		char c = str.charAt(1);
		System.out.println(str + "에서 첫번째 인덱스의 문자: " + c);
		
		// 자신의 메일 주소에서 @를 변수에 저장하여 출력
		char at = str1.charAt(12);
		System.out.println(str + "에서 열두번째 인덱스의 문자: " + at);
		
		
		// 문자열 안에서 특정 문자열의 '시작 인덱스'를 얻는 method : indexOf() (탐색순서 L->R)
		str = "Java Oracle JDBC";
		System.out.println(str + "에서 'r'의 인덱스: " + str.indexOf("r"));
		System.out.println(str + "에서 \"Ora\"의 인덱스: " + str.indexOf("Ora"));
		
		// 존재하지 않는 문자열은 첫번째 인덱스인 0보다 앞자리인 -1이 나온다.
		System.out.println(str + "에서 \"ora\"의 인덱스: " + str.indexOf("ora"));
		
		// 같은 문자열이 있다면 처음 문자열의 인덱스만 나온다.
		System.out.println(str + "에서 두번째 'a'의 인덱스: " + str.indexOf("a", str.indexOf("a")+1));	// indexOf(찾을 문자열, 시작할 위치)
		System.out.println(str + "에서 두번째 'J'의 인덱스: " + str.indexOf("J", str.indexOf("J")+1));
		
		
		// 문자열 안에서 특정 문자열의 시작 인덱스를 얻는 method : lastindexOf() (탐색순서 R->L)
		System.out.println(str + "에서 뒤에서부터 찾은 'a'의 인덱스: " + str.lastIndexOf("a"));
		
		
		// 문자열과 문자열을 합치는 method : concat()
		String str2 = str.concat(" HTML");
		System.out.println(str2);
		
		
		// 자식문자열(substring)을 얻는 method : substring(int beginindex, int endindex)
		// 자바에서 String은 끝문자의 위치를 알려주기 위해 인덱스 한 자리를 더 둔다.
		// 따라서 endindex에 출력을 원하는 문자열의 인덱스+1을 넣는다.
		String str3 = str2.substring(5, 11);
		System.out.println(str3);
		
		
		// str1="ljhee92.sist@gmail.com";
		// 메일주소는 로컬파트@도메인파트로 구성, 도메인파트의 com은 GTLD(General Top Level Domain)
		// str1에서 메일주소(로컬파트)를 잘라내어 출력
		// str1에서 도메인파트(TLD)를 잘라내어 출력
		System.out.println("메일주소1: " + str1.substring(0, 12));
		System.out.println("메일주소2: " + str1.substring(0, str1.indexOf("@")));
		System.out.println("도메인주소1: " + str1.substring(13, 22));
		System.out.println("도메인주소2: " + str1.substring(str1.indexOf("@")+1, 22));
		System.out.println("도메인주소3: " + str1.substring(str1.indexOf("@")+1, str1.length()));

		// 시작 인덱스만 설정하면 알아서 끝까지 잘라낸다.
		System.out.println("메일주소: " + str1.substring(0, str1.indexOf("@")));
		System.out.println("도메인주소: " + str1.substring(str1.indexOf("@")+1));
		
		
		// 특정 문자열로 시작했는지 여부를 확인하는 method : startWith()
		// 글자수 상관 없음! '서울시'로 시작한 주소를 찾아라!도 가능
		boolean flag = str2.startsWith("Java");
		System.out.println(str2 + "는 Java로 시작했는가? " + flag);
		
		String name = "홍길동";
		if (name.startsWith("김")) {
			System.out.println(name + "님은 김씨입니다.");
		} else {
			System.out.println(name + "님은 김씨가 아닙니다.");
		}	// end else
		
		
		// 특정 문자열로 끝나는지 여부를 확인하는 method : endWith()
		String addr = "서울시 강남구 역삼동";
		if (addr.endsWith("동")) {
			System.out.println("도시");
		} else {
			System.out.println("시골");
		}	// end else
		
		
		// 특정 문자열을 포함하는지 여부를 확인하는 method : contains()
//		str3 = "오늘은 Java를 공부하였다.";
//		str3 = "Java는 WORA가 특징인 완벽한 OOP 언어이다.";
		str3 = "오늘도 긴 시간 함께 공부하시느라 고생 많으셨Java";
		
		if (str3.contains("Java")) {
			System.out.println(str3 + " 안에는 \"Java\"가 포함되어 있다.");
		} else {
			System.out.println(str3 + " 안에는 \"Java\"가 없다.");
		}	// end else
		
		
		// 아래의 method를 호출하여 mail1~3을 넣고 유효한지를 출력

		String mail1 = "test@test.com";
		String mail2 = "testtest.com";
		String mail3 = "test@testcom";
		
		UseString us = new UseString();
		us.validEmail(mail1);
		us.validEmail(mail2);
		us.validEmail(mail3);
		
	}	// main
	
	// mail주소를 입력받아 유효한 메일인지 무효한 메일인지를 판단하는 method 작성
	// 유효한 메일은 전체 글자수가 7자 이상이면서 @과 . 포함되어야 한다.
	// 그러면 유효 메일을 출력, 그렇지 않으면 무효메일을 출력
	
	public void validEmail(String Email) {
		
		if(Email.length() > 6 && Email.contains("@") && Email.contains(".")) {
			System.out.println("유효 메일");
		} else {
			System.out.println("무효 메일");
		}	// end else
		
		// 아래 코드도 가능 ~
		String result = "무효 메일";
		if(Email.length() > 6 && Email.indexOf("@") > -1 && Email.indexOf(".") > -1) {
			result = "유효 메일";
		}	// end if
		System.out.println(result);
		
	}	// validEmail

}	// class
