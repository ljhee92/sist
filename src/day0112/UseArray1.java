package day0112;

/**
 *  일차원 배열) 열로만 구성된 배열 <br>
 *  1. 선언)
 * 	데이터형[] 배열명 = null; <br>
 *  2. 생성) <br>
 *  배열명 = new 데이터형[방의크기]; <br>
 *  1+2) 데이터형[] 배열명 = new 데이터형[방의크기]; <br>
 *  3. 값 할당) <br>
 *  배열명[방의번호] = 값; <br>
 *  4. 값 사용) <br>
 *  배열명[방의번호] <br>
 *  * 일괄 처리: 데이터를 모아 한 번에 처리 <br>
 *   - 방의 수: 배열명.length <br>
 *     for(int i = 0; i < 배열명.length; i++){ <br>
 *      배열명[i]; <br>
 *     }
 */

public class UseArray1 {
	
	public UseArray1() {	// 생성자 만들고 
		
		// 1. 선언
		int[] arr = null;
		
		// 2. 생성) - heap에 생성되고, 모든 방의 값은 0으로 자동 초기화
		arr = new int[5];
		
		// 3. 값 할당)
		arr[0] = 2024;
		arr[1] = 1;
		arr[2] = 12;
		arr[3] = 14;
		arr[4] = 44;
//		arr[5] = 1;		// 존재하지 않는 index를 사용하면 error
		
		System.out.println(arr + " 방의 수: " + arr.length + "개");
		System.out.println("처음 방: " + arr[0] + ", 두 번째 방: " + arr[1]);
		
		// 4. 값 사용)
		System.out.println(arr[0] + " ~ " + arr[4]);
		
		// 5. 일괄처리) - 한 번에 처리
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr배열의 [%d] = %d\n", i, arr[i]);
			sum += arr[i];
		}	// end for
		System.out.println("arr배열의 모든 값의 합: " + sum);
		
	}	// UseArray1
	
	
	public void scoreProcess() {
		
		System.out.println("---------------------------------------");
		
		String[] nameArr = {"루피", "샹크스", "나미", "조로", "쵸파"};
		String[] addressArr = {"서울시 강남구 역삼동", "서울시 동대문구 동대문동", "인천시 미추홀구", "서울특별시 구로구 구로동", "수원시 영통구 영통동"};
		int[] scoreArr = {94, 96, 75, 83, 100};
		
		int totalScore = 0;
		int cnt = 0;
		System.out.printf("번호\t이름\t거주지\n");
		for(int i = 0; i < nameArr.length; i++) {
			System.out.printf("%d\t%s\t%s\n", i+1, nameArr[i], addressArr[i], scoreArr[i]);
			totalScore += scoreArr[i];
			cnt++;
		}	// end for
		
		double avgScore = (double) totalScore / cnt;
		System.out.println("---------------------------------------");
		System.out.printf("총점: [%d]점, 평균: [%.2f]점\n", totalScore, avgScore);
	
		System.out.println("---------------------------------------");
		// score의 마지막 방부터 출력하는 코드 작성
		for(int i = scoreArr.length-1; i > -1; i--) {
			System.out.print(scoreArr[i] + " ");
		}	// end for 
		
		
		System.out.println("\n---------------------------------------");
		// flowchart를 코드로 옮겨 보세요.
		int top = scoreArr[0];
		for(int i = 0; i < scoreArr.length; i++) {
			if (top < scoreArr[i]) {
				top = scoreArr[i];
			}	// end if
		}	// end for
		System.out.println("scoreArr의 최대값: " + top);
		
		int bottom = scoreArr[0];
		for(int i = 0; i < scoreArr.length; i++) {
			if (bottom > scoreArr[i]) {
				bottom = scoreArr[i];
			}	// end if
		}	// end for
		System.out.println("scoreArr의 최소값: " + bottom);
		
		
		System.out.println("\n---------------------------------------");
		// flowchart2를 코드로 옮겨 보세요. -> 내림차순 정렬, 선택 정렬
		int temp = 0;
		for(int i = 0; i < scoreArr.length-1; i++) {
			for(int j = i+1; j < scoreArr.length; j++) {
				if (scoreArr[i] < scoreArr[j]) {
					temp = scoreArr[i];
					scoreArr[i] = scoreArr[j];
					scoreArr[j] = temp;
				}	// end if
			}	// end for
		}	// end for
		
		for(int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}	// end for
		
		System.out.println("");
		// 오름차순 정렬
		for(int i = 0; i < scoreArr.length-1; i++) {
			for(int j = i+1; j < scoreArr.length; j++) {
				if (scoreArr[i] > scoreArr[j]) {
					temp = scoreArr[i];
					scoreArr[i] = scoreArr[j];
					scoreArr[j] = temp;
				}	// end if
			}	// end for
		}	// end for
		
		for(int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}	// end for
		
	}	// scorePrecess

	
	public static void main(String[] args) {
		
		new UseArray1().scoreProcess();	// 객체명으로 변수나 method를 사용하지 않는 instance화

	}	// main

}	// class
