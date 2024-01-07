package day0103;

public class HomeWork0103 {
	
	// 기본 요금 상수로 정의
	/**
	 * 마을버스 기본요금 
	 */
	public static final int VILLAGE_BUS = 1200;
	/**
	 * 버스 기본요금
	 */
	public static final int BUS = 1500;
	/**
	 * 지하철 기본요금 
	 */
	public static final int SUBWAY = 1400;

	public static void main(String[] args) {
		
		// * 숙제
		// 제시된 요금표를 사용하여 아래 출력 코드를 작성.
		// - 대중교통수단과 이동거리를 입력받아 처리하는 프로그램을 제작.
		// - 입력한 대중교통수단이 "마을버스", "버스", "지하철"인 경우에만 아래의 출력형식으로 출력하고,
		//   그렇지 않다면 "대중교통수단이 아닙니다."를 출력한다.
		// - 편도요금은 이동거리가 10Km까지는 기본요금으로 처리되지만, 10Km를 초과하면 5Km마다 100원이 가산된다.
	
		// 출력형식)
		// 입력하신 교통수단은 [XX]이고, 이동거리는 [XX]Km입니다.
		// 교통수단의 기본 요금: [XX]원
		// 편도 요금: [XX]원
		// 왕복 요금: [XX]원
		// 한달 20일 기준 총 교통 요금은 [XX]원입니다.
		
		// 요금표)
		// 교통수단: 마을버스, 버스, 지하철
		// 기본요금: 1200, 1500, 1400
		
		// 코딩이 완료되면 flow chart를 그려보세요.
		
		// 입력값 할당
		String Transport = args[0];
		int distance = Integer.parseInt(args[1]);
		
		// 입력한 교통수단이 마을버스, 버스, 지하철 중 하나일 때 출력
		if (Transport.equals("마을버스") || Transport.equals("버스") || Transport.equals("지하철")) {		
			// 기본요금, 편도요금 선언
			int basicFee = 0;
			int oneWayFee = 0;
			
			// 추가요금 선언 및 할당
			int overFee = (distance-10)/5*100;
			
			// 기본요금 할당 및 출력
			if (Transport.equals("마을버스")) {
				basicFee = VILLAGE_BUS;
			} else if (Transport.equals("버스")) {
				basicFee = BUS;
			} else if (Transport.equals("지하철")) {
				basicFee = SUBWAY;
			}	// end else if
			
			System.out.println("입력하신 교통수단은 " + Transport + "이고, 이동거리는 " + distance + "Km입니다.");
			System.out.println("교통수단의 기본요금: " + basicFee + "원");
			
			// 이동거리에 따른 편도요금 연산 및 출력
			if (distance < 11) {
				oneWayFee = basicFee;
			} else {
				oneWayFee = basicFee +  overFee;
			}	// end else
			
			System.out.println("편도요금: " + oneWayFee + "원");
			
			// 왕복요금 연산 및 출력
			int roundFee = oneWayFee * 2;
			System.out.println("왕복요금: " + roundFee + "원");
			
			// 한달요금 연산 및 출력
			int monthFee = roundFee * 20;
			System.out.println("한달 20일 기준 총 교통 요금은 " + monthFee + "입니다.");
		}	
		
		// 입력한 교통수단이 마을버스, 버스, 지하철이 아닐 때 출력
		else {
			System.out.println("대중교통수단이 아닙니다.");
		}	// end else

	}	// main

}	// class
