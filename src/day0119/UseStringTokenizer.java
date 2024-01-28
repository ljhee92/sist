package day0119;

import java.util.StringTokenizer;

/**
 *  문자열을 짧은 한 마디(token)로 분리할 때 사용하는 클래스
 */

public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		// 공백으로 구분하는 생성자
		String data = "월요일 화요일 수요일 목요일 금요일 퇼";
		
		// 데이터를 자르기 위해 StringTokenizer에 할당
		StringTokenizer stk = new StringTokenizer(data);		// 공백으로 자른다.
		while(stk.hasMoreTokens()) {	// 토큰이 존재하는 동안 반복
			// 토큰이 존재하는지 모르지만 존재한다면 현재 토큰을 얻고 포인터를 다음으로 옮긴다.
			System.out.println(stk.nextToken());	// 한 번 진행하면 포인터는 뒤로 가지 않는다.
			System.out.println("토큰의 수: " + stk.countTokens());
		}	// end while
		
		System.out.println("-------------------------------------");
		
		// 특정 문자열로 구분하는 생성자 StringTokenizer(데이터, "기준문자열", 토큰보호여부);
		String data2 = "Java,Oracle~JDBC,HTML.CSS.JavaScript,JavaScript Library";
		
		StringTokenizer stk2 = new StringTokenizer(data2, ",~. ", true);
		while(stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken());
		}	// end while	
	}	// UseStringTokenizer
	
	public TokenDataVO csvData() {		
		String data = "오늘은,불금.입니다.주말엔 역시 자바공부죠! 그쵸? 아닌가? 데헷";
		
		// 위의 문자열을 , 공백 . ! 로 구분하여 배열과 총 토큰수를 반환하고 출력해보세요.
		
		StringTokenizer stk = new StringTokenizer(data, ", .!");
		int tokenCnt = stk.countTokens();
		String[] temp = new String[tokenCnt];
		
		int i = 0;
		while(stk.hasMoreTokens()) {
			temp[i] = stk.nextToken();
			i++;
		}	// end while
		
		// 반환값이 여러 개라면 VO를 만든다.
		TokenDataVO tdVO = new TokenDataVO(temp, tokenCnt);
		
		return tdVO;
	}	// csvData
	
	public void useCsvData() {
		TokenDataVO tdVO = csvData();
		String[] temp = tdVO.getData();
		int tokenCnt = tdVO.getCountToken();
		
		System.out.println("얻어낸 토큰 수: " + tokenCnt);
		for(String value : temp) {
			System.out.println(value);
		}	// end for
	}	// useCsvData
	

	public static void main(String[] args) {
		
		UseStringTokenizer ust = new UseStringTokenizer();
		
		ust.useCsvData();

	}	// main

}	// class