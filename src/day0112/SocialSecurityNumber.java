package day0112;

public class SocialSecurityNumber {
	
	private String ssn;	// instance 변수 
	
	/**
	 * 주민번호를 입력받아 instance 변수에 저장하는 생성자
	 * @param ssn 입력한 주민번호 
	 */
	public SocialSecurityNumber(String ssn) {
		setSsn(ssn);
	}	// SocialSecurityNumber
	
	/**
	 * 생성된 객체의 주민번호를 설정하는 일
	 * @param ssn 설정할 주민번호
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}	// setSsn
	
	/**
	 * 객체의 주민번호를 반환하는 일
	 * @return 객체의 주민번호
	 */
	public String getSsn() {
		return ssn;
	}	// getSsn
	
	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민번호(member변수, instance변수)의 글자수가 14자리인지 체크하는 일
	 * @return 주민번호의 글자수가 14자리인지 결과
	 */
	public boolean validSsn() {
		return ssn.length() == 14;		// ssn.length()==14의 결과 자체가 true이므로 바로 boolean으로 return 가능
	}	// digitCheck
	
	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민번호(member변수, instance변수)의 7번째 인덱스에 -가 있는지 체크하는 일
	 * @return 주민번호의 7번째 인덱스에 -가 있는지 결과
	 */
	public boolean checkDash() {
		return ssn.indexOf("-") == 6;	// index는 0부터 시작
	}	// dashCheck
	
	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민번호(member변수, instance변수)에서 생년월일을 연산하여 반환하는 일
	 * @return 연산된 생년월일 
	 */
	public String birthDate() {
		String year = ssn.substring(0, 2);
		String month = ssn.substring(2, 4);
		String day = ssn.substring(4, 6);
		
		switch (Integer.parseInt(ssn.substring(7, 8))) {		// 변수는 여러 번 사용될 때만 선언하여 할당=
		case 9 :
		case 0 : return "18" + year + "년 " + month + "월 " + day + "일";
		case 1 :
		case 2 :
		case 5 :
		case 6 : return "19" + year + "년 " + month + "월 " + day + "일";
		default : return "20" + year + "년 " + month + "월 " + day + "일";
		}	// end switch~case
	}	// birthDate
	
	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민번호(member변수, instance변수)에서 나이를 구하여 반환하는 일
	 * @return 연산된 나이
	 */
	public int age() {
		int year = Integer.parseInt(ssn.substring(0, 2));
		
		switch (Integer.parseInt(ssn.substring(7, 8))) {
		case 9 :
		case 0 : year += 1800; break;
		case 1 :
		case 2 :
		case 5 :
		case 6 : year += 1900; break;
		default : year += 2000;
		}	// end switch~case
		
		return 2024 - year;
	}	// age
	
	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민번호(member변수, instance변수)에서 성별을 구하여 반환하는 일
	 * @return	연산된 성별
	 */
	public String gender() {
		int genderFlag = Integer.parseInt(ssn.substring(7, 8));
		return (genderFlag == 1 || genderFlag == 3 || genderFlag == 5 || genderFlag == 7 || genderFlag == 9) ? "남자" : "여자";
	
//		아래처럼 배열로도 가능!
//		int genderFlag = ssn.charAt(7) - '0';
//		String[] genderText = {"여자", "남자"};
//		return genderText[genderFlag%2];
	}	// sex
	

	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민번호(member변수, instance변수)에서 띠를 구하여 반환하는 일
	 * @return 띠
	 */
	public String zodiac() {
		int year = Integer.parseInt(ssn.substring(0, 2));
		int genderFlag = Integer.parseInt(ssn.substring(7, 8));
		if (genderFlag == 9 || genderFlag == 0) {
			year += 1800;
		} else if (genderFlag == 1 || genderFlag == 2 || genderFlag == 5 || genderFlag == 6) {
			year += 1900;
		} else {
			year += 2000;
		}	// end else;

		switch (year % 12) {
		case day0103.Zodiac.MONKEY : return "원숭이띠";
		case day0103.Zodiac.ROOSTER : return "닭띠";
		case day0103.Zodiac.DOG : return "개띠";
		case day0103.Zodiac.PIG : return "돼지띠";
		case day0103.Zodiac.RAT	: return "쥐띠";
		case day0103.Zodiac.OX : return "소띠";
		case day0103.Zodiac.TIGER : return "호랑이띠";
		case day0103.Zodiac.RABBIT : return "토끼띠";
		case day0103.Zodiac.DRAGON : return "용띠";
		case day0103.Zodiac.SNAKE : return "뱀띠";
		case day0103.Zodiac.HORSE : return "말띠";
		default : return "양띠";
		}	// end switch~case
	}	// zodiac

}	// class