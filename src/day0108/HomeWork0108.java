package day0108;

/**
 *  숙제 <br>
 *   - 클래스 하나를 정의하고, 아래의 일을 할 수 있는 instance method를 구현하고 호출해보세요. <br>
 *   1. 자신의 이름을 출력하는 method <br>
 *   2. 자신의 이름 중에 "성"을 반환하는 method <br>
 *   3. 점수를 입력 받아 점수의 판정을 출력하는 method <br>
 *      점수는 0~100점 사이일 때만 판정을 하고, 그렇지 않으면 "잘못된 점수"를 출력 <br>
 *      0~39: 과락 출력, 40~59: 다른 과목을 참조, 60~100: 합격 <br>
 *   4. 문자를 입력 받아 해당 문자가 "대문자", "소문자", "숫자" 인지를 판단하여 출력하는 method <br>
 *      그 이외에는 "대문자, 소문자, 숫자가 아닙니다"를 출력 <br>
 *      출력예) A -> 대문자, $ -> 대문자, 소문자, 숫자가 아닙니다 <br>
 *   5. 태어난 해를 입력 받아 나이를 반환하는 method <br>
 *   	나이 = 올해 - 태어난해 + 1 <br>
 *   6. 3개의 수를 입력 받아 가장 "작은 수"를 반환하는 일을 하는 method <br>
 */

public class HomeWork0108 {
	
	// 1. 고정 일
	public void printMyName() {
		String myName = "이주희";
		System.out.println(myName);
	}	// printMyName
	
	
	// 2. 고정 값
	public char returnLastName() {
		String myName = "이주희";
		char lastName = myName.charAt(0);
		return lastName;
	}	// returnLastName
	
	
	// 3. 가변 일 
	public void scoreJudge(int score) {
		if (score > -1 && score < 101) {
			if (score > -1 && score < 40) {
				System.out.println("과락");
			} else if (score > 39 && score < 60) {
				System.out.println("다른 과목을 참조");
			} else if (score > 59 && score < 101) {
				System.out.println("합격");
			}	// end if
		} else {
			System.out.println("잘못된 점수");
		}	// end else
	}	// scoreJudge
	
	
	// 4. 가변 일
	public void charJudge(char c) {
		if (c > 47 && c < 58) {
			System.out.println("숫자");
		} else if (c > 64 && c < 92) {
			System.out.println("대문자");
		} else if (c > 96 && c < 123) {
			System.out.println("소문자");
		} else {
			System.out.println("대문자, 소문자, 숫자가 아닙니다.");
		}	// end else
	}	// charJudge
	
	
	// 5. 가변 값
	public int returnAge(int birthYear) {
		int age = 0;
		age = 2024 - birthYear + 1;
		return age;
	}	// returnAge
	
	
	// 6. 가변 값
	public int returnMin(int num, int num2, int num3) {
		int min = 0;
		if (num < num2) {
			if (num < num3) {
				min = num;
			} else {
				min = num3;
			}	// end else
		}	// end if
		if (num2 < num) {
			if (num2 < num3) {
				min = num2;
			} else {
				min = num3;
			}	// end else
		}	// end if
		return min;
	}	// returnMin
	
	
	public static void main(String[] args) {
		
		// instance method 호출을 위한 객체화
		HomeWork0108 hw = new HomeWork0108();
		
		
		// 1. 고정 일 method 호출
		hw.printMyName();
		
		
		// 2. 고정 값 method 호출
		char lastName = hw.returnLastName();
		System.out.println(lastName);
		
		
		// 3. 가변 일 method 호출
		hw.scoreJudge(101);
		
		
		// 4. 가변 일 method 호출
		hw.charJudge('$');
		
		
		// 5. 가변 값 method 호출
		int age = hw.returnAge(1992);
		System.out.println(age);
		
		
		// 6. 가변 값 method 호출
		int min = hw.returnMin(3, 1, 2);
		System.out.println(min);

	}	// main

}	// class
