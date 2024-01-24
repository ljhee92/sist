package day0123;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * 1. 입력데이터가 CSV형태(이름,자바점수,오라클점수)라면 WorkVO 객체를 생성하여 입력값을 할당하고 java.util.List에 추가
 * 2. CSV형태가 아닌 "출력"이 입력되면 java.util.List에 들어있는 값을 모두 다 Console에 출력
 * 출력 예) 번호 이름 자바 오라클 총점
 *         1  윤웅찬 100 100 200
 *         2  김병년  95  89 xxx
 * 3. CSV형태가 아닌 "Y"나 "y"가 입력되면 프로그램을 종료한다.
 */
public class HomeWork0123_2 {
		
	private List<WorkVO> list;
	public static final int CSV_DATA = 3;
	
	public HomeWork0123_2() {
		list = new ArrayList<WorkVO>();	// class가 실행될 때 list를 생성
	}	// HomeWork0123_2
	
	/**
	 *  메뉴를 입력받아서 CSV데이터인지, 출력, 종료인지를 판단하여 해당 method를 호출하는 일
	 */
	public void inputMenu() {
		boolean exitFlag = false;
		String inputData = "";			// 반복문 안에서 변수 선언X
		String[] inputDataArr = null;	// CSV 데이터를 저장할 배열
		do {							// 무한반복 시키지 않기
			inputData = JOptionPane.showInputDialog("\"이름,자바점수,오라클점수\" 입력\n"
					+ "\"출력\"을 입력하면 출력됩니다.\n "
					+ "종료하시려면 \"Y 또는 y\"를 입력해주세요.");
			if(inputData != null) {
				inputDataArr = inputData.split(",");
				switch(inputDataArr.length) {
				case CSV_DATA :
					inputData(inputDataArr);
				default :
					if("출력".equals(inputData)) {
						printData();
					}	// end if
					exitFlag = "Y".equalsIgnoreCase(inputData);	// 종료 메서드가 없어도 될듯 !!
				}	// end switch~case
			}	// end if
		} while (!exitFlag);	// 무한반복 시키지 않기
	}	// inputMenu
	
	
	public void inputData(String[] inputDataArr) {
		String name = inputDataArr[0];
		int javaScore = Integer.parseInt(inputDataArr[1]);
		int oralceScore = Integer.parseInt(inputDataArr[2]);
		
		WorkVO wVO = new WorkVO(name, javaScore, oralceScore);
		list.add(wVO);
	}	// inputData
	
	
	public void printData() {
		System.out.println("번호\t이름\t자바\t오라클\t총점");
		WorkVO wVO = null;
		
		for(int i = 0; i < list.size(); i++) {
			wVO = list.get(i);
			System.out.print((i+1) + "\t" + wVO.getName() + "\t" + wVO.getJavaScore() + "\t" + wVO.getOracleScore() 
							+ "\t" + (wVO.getJavaScore() + wVO.getOracleScore()) + "\n");
		}	// end for
	}	// printData
	

	public static void main(String[] args) {
		
		HomeWork0123_2 hw = new HomeWork0123_2();
		hw.inputMenu();		
		
	}	// main 

}	// class