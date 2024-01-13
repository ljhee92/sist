package day0112;

/**
 *  문자열 클래스의 사용
 */

public class UseString2 {

	public static void main(String[] args) {
		
		String fileName = "Test.txt.bat";		// 파일명에 .이 더 있을 수 있으므로 lastIndexOf() method 사용
		System.out.println("파일명: " + fileName.substring(0, fileName.indexOf(".")));
		System.out.println("확장자: " + fileName.substring(fileName.lastIndexOf(".")+1));
		
		
		// 문자열이 비었는지 확인하는 method : isEmpty()
		String str = "";
		// ""(empty)로 초기화 -> String 클래스에서 제공하는 instance method를 사용할 수 있다.
		String str1 = null;
		// null로 초기화 -> String 클래스에서 제공하는 insance method는 사용할 수 없다.
		// null은 관계연산자로 비교
		
		System.out.println(fileName + "은 비었니? " + fileName.isEmpty());
		System.out.println("'" + str + "'은 비었니? " + str.isEmpty());
//		System.out.println("'" + str1 + "'은 비었니? " + str1.isEmpty());
		// null로 초기화된 객체의 method를 호출하면 error가 발생
		
		// 문자열의 앞 뒤 공백을 제공하는 method : trim()
		str = "     A BC   ";
		String temp = str.trim();
		System.out.printf("[%s][%s]\n", str, temp);
		
		
		// 문자열을 치환하는 method : replace(), replaceAll() -> 둘 다 결과는 같다.
		str = "Java Oracle JDBC JSON";
//		temp = str.replace("J", "j");
		temp = str.replaceAll("J", "j");
		System.out.println(str + ", 변경된 문자열: " + temp);
		
		String msg = "나 지금 피씨방인데, 넌 어디니 씨 방새야";
		String filter = msg.replaceAll("씨", "*").replaceAll("방", "*");
		System.out.println(filter);
		
		// method chain : method의 반환형이 '참조형'이라면 반환 값을 받아서 클래스가 제공하는 method를 연결하여 호출할 수 있다.
		// method를 연속하여 호출하는 chain 문법은 반환형을 확인한 후 사용한다.
		msg = "나 지금 피씨방인데, 넌 어디니 ㅆㅣ 방새야";
		filter = msg.replaceAll("씨", "*").replaceAll("방", "*").replaceAll("ㅆ", "*");
		System.out.println(filter);
		
		// 같은 종류의 method가 아니더라도 연결하여 호출할 수 있다.
		// 가독성은 떨어지지만 코드를 줄일 수 있다.
		msg = "    나 지금 피씨방인데, 넌 어디니 씨방새야 ";
		temp = msg.concat("데헷").replaceAll("씨방", "**").trim().toUpperCase();
		System.out.println(temp);
		
		
		// 정규표현식(regex) - java.util.regex 패키지 내 Macher, Pattern 클래스 활용
		// 숫자(0~9) : \\d
		msg = "내 현재 전화번호는 010-1234-5678, 내 친구 전화번호는 010-2222-3333, 내 나이는 20살";
		temp = msg.replaceAll("\\d", "*");
		System.out.println(temp);
		
		// 대체하고 싶은 영역(자릿수)을 설정하여 그룹을 묶을 때: () - 그룹, \\형식{글자수}
		msg = "내 현재 전화번호는 010-1234-5678, 내 친구 전화번호는 010-2222-3333, \n"
				+ "내 나이는 20살, 이전 전화번호는 011-123-4567, 태어난 해는 1995년, \n"
				+ "집 전화번호는 02-123-4567, 아! 듀얼번호는 010-3333-7788";
		temp = msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})", "***-****-****");
		System.out.println(temp);

		// replaceAll()에서만 제공하는 기능으로 그룹의 값을 참조할 때 : $1 - 그룹 1을 참조, $3 - 그룹 3을 참조
		msg = "내 현재 전화번호는 010-1234-5678, 내 친구 전화번호는 010-2222-3333, \n"
				+ "내 나이는 20살, 이전 전화번호는 011-123-4567, 태어난 해는 1995년, \n"
				+ "집 전화번호는 02-123-4567, 아! 듀얼번호는 010-3333-7788";
		temp = msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})", "$1-****-$3");
		System.out.println(temp);
		
		msg = "전화번호는 010-1234-5678";	// 010-x234-5678
		temp = msg.replaceAll("(\\d{3})-\\d{1}(\\d{3})-(\\d{4})","$1-x$2-$3");	// 네 그룹으로
		temp = msg.replaceAll("(\\d{3}-)\\d{1}(\\d{3}-\\d{4})","$1x$2");	// 두 그룹으로
		System.out.println(temp);
		
		
		// 문자 : [] - 클래스(정의되는 문자는 각각을 비교, 범위가 아님), + - 하나 이상, {2,} - 두 자 이상
		msg = "내 메일주소는 test@daum.net입니다. Hello12 Java test@sist.com test@sist.co.kr";
//		temp = msg.replaceAll("[a-z]", "*");	// 소문자 치환
//		temp = msg.replaceAll("[A-Z]", "*");	// 대문자 치환
//		temp = msg.replaceAll("[0-9]", "*");	// 숫자 치환
//		temp = msg.replaceAll("[ㄱ-힣]", "*");	// 한글 치환
//		temp = msg.replaceAll("[da]", "*");		// d, a 치환, 범위(-)가 아니면 각각의 문자가 치환된다.
		temp = msg.replaceAll("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9a.-]+\\.[a-zA-Z]{2,}", "****@****.***");
		System.out.println(temp);
		
		
		// 기본형 데이터 형을 String으로 저장할 때 : valueOf() -> static method이므로 class명(String).valueOf()의 형태로 사용
		int i = 12;
		temp = String.valueOf(i);
		System.out.println(temp);
		temp = i+"";	// 눈에 보이지 않는 객체가 생성 -> 데이터 사용 남발 -> 권장X
		System.out.println(temp);
		
		double d = 2024.01;
		temp = String.valueOf(d);
		System.out.println(temp);
		
	}	// main

}	// UseString2
