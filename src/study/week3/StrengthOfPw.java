package study.week3;

public enum StrengthOfPw {
	
	DANGER("위험"),
	GENERAL("보통"),
	STRONG("강함");
	
	private String degree;

	private StrengthOfPw(String degree) {
		this.degree = degree;
	}	// StrengthOfPw	

	public String getDegree() {
		return degree;
	}

}	// StringthOfPw