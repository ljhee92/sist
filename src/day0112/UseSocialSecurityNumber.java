package day0112;

public class UseSocialSecurityNumber {

	public static void main(String[] args) {

		String ssn = "950101-1234567";
		SocialSecurityNumber ssn1 = new SocialSecurityNumber(ssn);
		
		if(ssn1.validSsn()) {
			if(ssn1.checkDash()) {
				System.out.println(ssn1.birthDate());
				System.out.println(ssn1.age() + "살");
				System.out.println(ssn1.gender());
				System.out.println(ssn1.zodiac());
			} else {
				System.out.println("-의 위치가 올바르지 않음.");
			}	// end else
		} else {
			System.out.println("주민번호의 자릿수가 잘못되었음.");
		}	// end else
		
	}	// main

}	// class
