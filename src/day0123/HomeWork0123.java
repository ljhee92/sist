package day0123;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 * 1. 입력데이터가 CSV형태(이름,자바점수,오라클점수)라면 WorkVO 객체를 생성하여 입력값을 할당하고 java.util.List에 추가
 * 2. CSV형태가 아닌 "출력"이 입력되면 java.util.List에 들어있는 값을 모두 다 Console에 출력
 * 출력 예) 번호 이름 자바 오라클 총점
 *         1  윤웅찬 100 100 200
 *         2  김병년  95  89 xxx
 * 3. CSV형태가 아닌 "Y"나 "y"가 입력되면 프로그램을 종료한다.
 */
public class HomeWork0123 {
	
	public static boolean EXIT_FLAG = true;
	public static final int NAME = 0;
	public static final int JAVA_SCORE = 1;
	public static final int ORACLE_SCORE = 2;
	public static final int INPUT_DATA = 3;
	
	private List<WorkVO> stuInfo = new ArrayList<WorkVO>();
	
	public void inputMenu() {
		String inputData = "";
		StringTokenizer stk;
		String[] inputDataArr = null;
		
		while(EXIT_FLAG) {
			inputData = JOptionPane.showInputDialog("\"이름,자바점수,오라클점수\" 입력\n"
					+ "\"출력\"을 입력하면 출력됩니다.\n "
					+ "종료하시려면 \"Y 또는 y\"를 입력해주세요.");
			
			if(inputData.length() == INPUT_DATA) {
				stk = new StringTokenizer(inputData, ",");
				inputDataArr = new String[stk.countTokens()];
				int i = 0;
				while(stk.hasMoreTokens()) {
					inputDataArr[i] = stk.nextToken();
					i++;
				}	// end while
				inputData(inputDataArr);
			} else if("출력".equals(inputData)) {
				printData();
			} else if("Y".equalsIgnoreCase(inputData)) {
				EXIT_FLAG = exitProgram(inputData.charAt(0));
			} else {
				inputData = JOptionPane.showInputDialog("잘못입력하셨습니다. \n \"이름,자바점수,오라클점수\" 입력\n"
						+ "\"출력\"을 입력하면 출력됩니다.\n "
						+ "종료하시려면 \"Y 또는 y\"를 입력해주세요.");
			}	// end else
		}	// while
	}	// inputMenu
	
	public void inputData(String[] inputDataArr) {
		String name = inputDataArr[NAME];
		int javaScore = Integer.parseInt(inputDataArr[JAVA_SCORE]);
		int oracleScore = Integer.parseInt(inputDataArr[ORACLE_SCORE]);
		
		WorkVO wVO = new WorkVO(name, javaScore, oracleScore);
		stuInfo.add(wVO);
		
	}	// inputData
	
	public void printData() {
		WorkVO temp = null;
		System.out.print("번호\t이름\t자바\t오라클\t총점\n");
		for(int i = 0; i < stuInfo.size(); i++) {
			temp = stuInfo.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\n", i+1, temp.getName(), temp.getJavaScore(), temp.getOracleScore(), 
					temp.getJavaScore()+temp.getOracleScore());
		}	// end for
	}	// printData
	
	public boolean exitProgram(char exit) {
		return false;
	}	// exitProgram

	public static void main(String[] args) {
		
		HomeWork0123 hw = new HomeWork0123();
		hw.inputMenu();		
		
	}	// main 

}	// class