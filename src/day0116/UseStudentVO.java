package day0116;

/**
 * 사용자 정의 자료형으로 배열을 만들면 방 하나에 여러 개의 값이 들어갈 수 있다.
 */

public class UseStudentVO {

	public static void main(String[] args) {
		
		// 1. 배열 선언) 데이터형[] 배열명 = null;
		StudentVO[] sVOArr = null;
		
		// 2. 생성) 배열명 = new 데이터형[방의 수]; - heap에 만들어지고 모든 방은 null이 된다.
		sVOArr = new StudentVO[3];
		sVOArr[0] = new StudentVO(1, "루피", 60, 76);
		sVOArr[1] = new StudentVO(2, "쵸파", 100, 100);
		sVOArr[2] = new StudentVO();
		
		// 3. 기본 생성자를 사용하여 생성한 후 > 값 할당 > 배열명[방의번호].setter()를 사용
		sVOArr[2].setNum(3);
		sVOArr[2].setName("샹디");
		sVOArr[2].setKorScore(94);
		sVOArr[2].setEngScore(98);
		
		for(StudentVO sVO : sVOArr) {
			System.out.printf("%d번\t%s\t%d점\t%d점\n", sVO.getNum(), sVO.getName(), sVO.getKorScore(), sVO.getEngScore());
		}	// end for

	}	// main

}	// class
