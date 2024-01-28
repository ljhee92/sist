package day1227;

/**
 *  숙제 2
 */

public class Exam1227_2 {
	
	public static final int ONE_MONTH_POCKET_MONEY = 300000;
	public static final int ONE_MONTH_DAY = 20;

	public static void main(String[] args) {
		
		/*
		1. 한 달 용돈은 xxxx원 하루 용돈은 20일 기준으로 xxxx원입니다.
		하루 지출은 편도 교통비 xxx원 왕복 교통비 xxxx원 점심 식대 xxxx원으로
		총 xxxx원이 지출됩니다.
		
		한 달이 지나면 잔액은 xxx원입니다.
		
		한 달 용돈, 20일 - 상수 / 편도 교통비, 점심 식대 - 변수 / 하루 용돈, 왕복 교통비, 지출액, 잔액 - 연산
		 */
		
		int oneDayPocketMoney = ONE_MONTH_POCKET_MONEY / ONE_MONTH_DAY;
		int oneWayFee = 1500;
		int totalFee = oneWayFee * 2;
		int lunchCost = 10000;
		int totalExpense = lunchCost + totalFee;
		int balance = ONE_MONTH_POCKET_MONEY - (totalExpense * ONE_MONTH_DAY);
		
		System.out.println("한 달 용돈은 " + ONE_MONTH_POCKET_MONEY + "원 하루 용돈은 " + ONE_MONTH_DAY + "일 기준으로 " + oneDayPocketMoney + "원입니다.");
		System.out.println("하루 지출은 편도 교통비 " + oneWayFee + "원 왕복교통비 " + totalFee + "원 점심 식대 " + lunchCost + "원으로");
		System.out.println("총 " + totalExpense + "원이 지출됩니다.");
		System.out.println();
		System.out.println("한 달이 지나면 잔액은 " + balance + "원입니다.");
		
		System.out.println();

		/*
		2. API에서 wrapper class를 찾아보고, 최대값과 최소값을 가지고 있는 Constant가 존재하는지 확인한 후,
		Constant가 존재한다면 아래와 같이 출력
		
		출력 예)
		byte 최소값 -128 최대값 127
		... 존재하는 모든 wrapper class를 확인하여 출력
		 */
		
		System.out.println("byte 최소값 " + Byte.MIN_VALUE + " 최대값 " + Byte.MAX_VALUE);
		System.out.println("character 최소값 " + (int)Character.MIN_VALUE + " 최대값 " + (int)Character.MAX_VALUE);
		System.out.println("double 최소값 " + Double.MIN_VALUE + " 최대값 " + Double.MAX_VALUE);
		System.out.println("float 최소값 " + Float.MIN_VALUE + " 최대값 " + Float.MAX_VALUE);
		System.out.println("integer 최소값 " + Integer.MIN_VALUE + " 최대값 " + Integer.MAX_VALUE);
		System.out.println("long 최소값 " + Long.MIN_VALUE + " 최대값 " + Long.MAX_VALUE);
		System.out.println("short 최소값 " + Short.MIN_VALUE + " 최대값 " + Short.MAX_VALUE);

	}	// main

}	// class
