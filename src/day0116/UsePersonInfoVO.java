package day0116;

public class UsePersonInfoVO {
	
	private void printPersonInfoVO() {
		
		PersonInfoVO[] piVOArr = new PersonInfoVO[7];
		
		piVOArr[0] = new PersonInfoVO("고한별", "서울시 강남구 역삼동", 25);
		piVOArr[1] = new PersonInfoVO("김동수", "경기도 수원시 영통구", 20);
		piVOArr[2] = new PersonInfoVO("김동섭", "서울시 강남구 서초동", 28);
		piVOArr[3] = new PersonInfoVO("정명호", "마계서울시 부평구 부평동", 26);
		piVOArr[4] = new PersonInfoVO("양수민", "경기도 부천시 부천동", 25);
		piVOArr[5] = new PersonInfoVO("진수현", "서울시 동대문구 동대문동", 27);
		piVOArr[6] = new PersonInfoVO("수연", "서울시 구로구 구로동", 26);
		
		// 이름, 주소, 나이 값을 출력
		for(PersonInfoVO piVO : piVOArr) {
			System.out.printf("%s, %s, %d\n", piVO.getName(), piVO.getAddress(), piVO.getAge());
		}	// end for
		
		System.out.println("-------------------------------");		
		System.out.println("이름에 수가 들어가는 사람의 수: " + nameSu(piVOArr) + "명");
		System.out.println("-------------------------------");
		System.out.println("서울시에 살고 있는 사람의 수: " + addressSeoul(piVOArr) + "명");
		System.out.println("-------------------------------");
		System.out.println("나이의 합산: " + totalAge(piVOArr) + "살");
		
	}	// printPersonInfoVO
	
	public void printInfo() {
		
	}	// printInfo
	
	/**
	 * 이름에 수가 들어가는 사람의 수를 연산하여 반환하는 일
	 * @param piVOArr 데이터 배열
	 * @return 이름에 수가 들어가는 사람의 수
	 */
	public int nameSu(PersonInfoVO[] piVOArr) {
		int cntSu = 0;
		for(PersonInfoVO piVO : piVOArr) {
			if(piVO.getName().contains("수")) {
				cntSu++;
			}	// end if
		}	// end for
		return cntSu;
	}	// nameSu
	
	/**
	 * 서울시에 살고 있는 사람의 수를 연산하여 반환하는 일
	 * @param piVOArr 데이터 배열
	 * @return 서울시에 살고 있는 사람의 수
	 */
	public int addressSeoul(PersonInfoVO[] piVOArr) {
		int cntSeoul = 0;
		for(PersonInfoVO piVO : piVOArr) {
			if(piVO.getAddress().startsWith("서울시")) {
				cntSeoul++;
			}	// end if
		}	// end for
		return cntSeoul;
	}	// addressSeoul
	
	/**
	 * 나이의 합산을 연산하여 반환하는 일
	 * @param piVOArr 데이터 배열
	 * @return 나이의 합
	 */
	public int totalAge(PersonInfoVO[] piVOArr) {
		int sum = 0;
		for(PersonInfoVO piVO : piVOArr) {
			sum += piVO.getAge();
		}	// end for
		return sum;
	}	// totalAge

	public static void main(String[] args) {
		
		UsePersonInfoVO upiVO = new UsePersonInfoVO();
		upiVO.printPersonInfoVO();
		
	}	// main
	
}	// class