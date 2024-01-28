package day0115;

/**
 * 학생들의 점수를 처리하는 클래스
 */

public class UseArray2Work {
	
	public void printScore() {
		
		String[] namesArr = {"루피", "샹디", "쵸파", "나미", "로빈"};
		int[][] scoreArr = {
				{89, 91, 86},
				{91, 93, 90},
				{98, 100, 99},
				{74, 85, 83},
				{88, 90, 95}
		};
		
		System.out.printf("시험 응시 인원 [%d]명\n", namesArr.length);
		System.out.printf("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-------------------------------------------------------");
		
		for(int i = 0; i < scoreArr.length; i++) {
			System.out.printf("%d\t%s\t", i+1, namesArr[i]);
			for(int j = 0; j < scoreArr[i].length; j++) {
				System.out.printf("%d\t", scoreArr[i][j]);
			}	// end for
			System.out.printf("%d\t%.2f\n", totalScore(scoreArr[i]), avgScore(scoreArr[i]));
			// 이차원 배열의 한 행은 일차원 배열로 이루어져 있다.
		}	// end for
		System.out.println("-------------------------------------------------------");

		System.out.printf("\t총점");
		for(int i = 0; i < scoreArr[0].length; i++) {
			System.out.printf("\t%d", totalScore(scoreArr)[i]);		// 각 과목의 총점
		}	// end for
		System.out.printf("\t%d\t%.2f\n", totalAllScore(scoreArr), avgAllScore(scoreArr));	// 모든 과목의 총점과 평균
		
		System.out.printf("\t국어평균\t%.2f\n", avgKorScore(scoreArr));	// 국어만 평균
		System.out.printf("1등 학생의 번호[%d], 이름[%s]\n", topDigit(scoreArr), topName(scoreArr, namesArr));	// 1등 학생의 번호와 이름	
		
	}	// scoreProcess
	
	
	/**
	 * 일차원 배열(한 명)의 총점을 구하여 반환하는 일
	 * @param subjectScore 한 명의 과목별 점수
	 * @return 총점
	 */
	public int totalScore(int[] subjectScore) {
		int total = 0;
		
		for(int score : subjectScore) {
			total += score;
		}	// end for
		
		return total;
	}	// totalScore
		
	
	/**
	 * 일차원 배열(한 명)의 평균을 구하여 반환하는 일
	 * @param subjectScore 한 명의 과목별 점수
	 * @return 평균
	 */
	public double avgScore(int[] subjectScore) {
		double total = 0.0;
		
		for(int score : subjectScore) {
			total += score;
		}	// end for
		
		return total / subjectScore.length;
	}	// avgScore
	
	
	/**
	 * 각 과목의 총점을 구하여 반환하는 일
	 * @param scoreArr 점수 배열
	 * @return 각 과목의 총점
	 */
	public int[] totalScore(int[][] scoreArr) {
		int[] total = new int[scoreArr[0].length];
		
		for(int i = 0; i < scoreArr.length; i++) {
			for(int j = 0; j < scoreArr[i].length; j++) {				
				total[j] += scoreArr[i][j];
			}	// end for
		}	// end for
		
		return total;
	}	// totalScore
	
	
	/**
	 * 모든 사람의 국어 과목 평균을 구하여 반환하는 일
	 * @param scoreArr 점수 배열
	 * @return 모든 사람의 국어과목 평균
	 */
	public double avgKorScore(int[][] scoreArr) {
		double totalKor = 0;
		
		for(int i = 0; i < scoreArr.length; i++) {
			totalKor += scoreArr[i][0];
		}	// end for
		
		return totalKor / scoreArr.length;
	}	// avgKorScore
	
	
	/**
	 * 모든 과목의 총점을 구하여 반환하는 일
	 * @param scoreArr 점수 배열
	 * @return 모든 과목의 총점
	 */
	public int totalAllScore(int[][] scoreArr) {
		int totalAll = 0;

		for(int[] arr1 : scoreArr) {
			for(int score : arr1) {
				totalAll += score;
			}	// end for
		}	// end for
		
		return totalAll;
	}	// totalTotalScore
	
	
	/**
	 * 모든 과목의 평균을 구하여 반환하는 일
	 * @param scoreArr 점수 배열
	 * @return 모든 과목의 평균
	 */
	public double avgAllScore(int[][] scoreArr) {
		double totalAll = 0.0;
		
		for(int[] arr1 : scoreArr) {
			for(int score : arr1) {
				totalAll += score;
			}	// end for
		}	// end for
		
		return totalAll / scoreArr[0].length;
	}	// avgAllScore
	
	
	/**
	 * 1등 학생의 번호를 구하여 반환하는 일
	 * @param scoreArr 점수 배열
	 * @return 1등 학생의 번호
	 */
	public int topDigit(int[][] scoreArr) {
		int[] total = new int[scoreArr.length];
		int top = total[0];
		int topDigit = 0;
		
		for(int i = 0; i < scoreArr.length; i++) {
			for(int j = 0; j < scoreArr[i].length; j++) {
				total[i] += scoreArr[i][j];
				if(top < total[i]) {
					top = total[i];
					topDigit = i+1;
				}	// end if
			}	// end for
		}	// end for
		
		return topDigit;
	}	// topDigit;
	
	
	/**
	 * 1등 학생의 이름을 구하여 반환하는 일
	 * @param scoreArr 점수 배열
	 * @param namesArr 이름 배열
	 * @return 1등 학생의 이름
	 */
	public String topName(int[][] scoreArr, String[] namesArr) {
		int[] total = new int[scoreArr.length];
		int top = total[0];
		String topName = namesArr[0];
		
		for(int i = 0; i < scoreArr.length; i++) {
			for(int j = 0; j < scoreArr[i].length; j++) {
				total[i] += scoreArr[i][j];
				if(top < total[i]) {
					top = total[i];
					topName = namesArr[i];
				}	// end if
			}	// end for
		}	// end for
		
		return topName;
	}	// topName
	
	
	public static void main(String[] args) {
		
		UseArray2Work uaw = new UseArray2Work();
		uaw.printScore();

	}	// main

}	// class