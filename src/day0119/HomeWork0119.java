package day0119;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class HomeWork0119 {
	
	public static final int KOREA = 0;
	public static final int US = 1;
	public static final int JAPAN = 2;
	public static final int CANADA = 3;
	
	public HomeWork0119() {
	}	// HomeWork0119
	
	/**
	 * 파일명을 매개변수로 받아 확장자가 있다면 확장자 앞에 _bak를, 확장자가 없다면 파일명 뒤에 _bak를 붙이는 일
	 * @param fileName 파일명
	 * @return 백업파일명
	 */
	public String returnBakName(String fileName) {
		StringBuffer bakName = new StringBuffer();
		bakName.append(fileName);
		
		if(bakName.lastIndexOf(".")!=-1) {
			bakName.insert(bakName.lastIndexOf("."), "_bak");
		} else {
			bakName.insert(bakName.length(), "_bak");
		}	// end else
		return bakName.toString();
	}	//returnBakName
	
	
	/**
	 * csvData를 입력받아 배열로 반환하는 일 <br>
	 * *김씨는 성을 제외하고 반환
	 * @param csvData
	 */
	public String[] returnName(String csvData) {
		StringTokenizer fullName = new StringTokenizer(csvData, ",.~ ");
		int tokenCnt = fullName.countTokens();
		String[] nameArr = new String[tokenCnt];
		int index = 0;
		
		while(fullName.hasMoreTokens()) {
			nameArr[index] = fullName.nextToken();
			index++;
		}	// end while
		
		for(int i = 0; i < nameArr.length; i++) {
			if(nameArr[i].startsWith("김")) {
				nameArr[i] = nameArr[i].substring(1);
			} else {
				nameArr[i] = nameArr[i];
			}	// end else
		}	// end for
		
		return nameArr;
	}	//returnName
	
	
	/**
	 * 0-한국, 1-미국, 2-일본, 3-캐나다를 입력받아 현재시간을 국가별 "년-월-일 시:분:초 요일" 형식으로 반환하는 일
	 * @param nationNum 국가코드
	 * @return 국가별 현재시간 
	 */
	public String returnDate(int nationNum) {
		Date date = new Date();
		
		Locale result = Locale.KOREA;
		if(nationNum == KOREA) {
			result = Locale.KOREA;
		} else if(nationNum == US) {
			result = Locale.US;
		} else if(nationNum == JAPAN) {
			result = Locale.JAPAN;
		} else if(nationNum == CANADA) {
			result = Locale.CANADA;
		}	// end if
		
		SimpleDateFormat toDay = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss EEEE", result);
		
		return toDay.format(date);
	}	// returnDate
	

	public static void main(String[] args) {
		
		HomeWork0119 hw = new HomeWork0119();
		String csvData = "고한별,김도원,김동섭.김무영~김현종 박시현,손지민,김병년.김일신";
		System.out.println(hw.returnBakName("test.last.jpg"));
		System.out.println(Arrays.toString(hw.returnName(csvData)));
		System.out.println(hw.returnDate(4));

	}	// main

}	// class