package day0124;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;

/**
 *  - InputDialog를 사용하여 아래와 같은 동작을 수행하는 프로그램 작성 <br>
 *  1. 입력, 검색, 종료 메뉴를 받을 수 있는 Dialog를 제공한다. <br>
 *  <br>
 *  2. 위의 Dialog에서 "1"이 입력되면 학생 번호,이름,자바 점수,오라클 점수를 입력받을 수 있는 InputDialog를 제공한다. <br>
 *     CSV형식의 데이터를 입력 받아 학생의 번호가 존재한다면 "이미 존재하는 번호입니다."를 MessageDialog에 보여주세요. <br>
 *     그렇지 않으면 VO에 입력. <br>
 *  <br>   
 *  3. 1번 메뉴에서 "2"가 입력되면 저장된 모든 값을 consol에 출력하는 코드 작성 <br>
 *     출력 예) <br>
 *     번호 이름 자바점수 오라클점수 합계 평균 <br>
 *      1  xxx  90     90   180	90.xx <br>
 *  <br>    
 *  4. 1번 메뉴에서 "3"이 입력되면 프로그램을 종료한다. <br>
 *  Hint: Map, Set, Iterator 사용
 */
@SuppressWarnings("serial")
public class HomeWork0124 extends JFrame {

	public static final int INPUT_DIALOG_LENGTH = 1;
	public static final int INPUT_DATA_LENGTH = 4;
	public static final String INPUT = "1";
	public static final String GET = "2";
	public static final String EXIT = "3";
	private static boolean exitFlag = false;
	private Map<Integer, StuInfoVO> map;
	private Set<Integer> set;
	
	public HomeWork0124() {
		map = new HashMap<Integer, StuInfoVO>();
		set = new HashSet<Integer>();
	}	// HomeWork0124
	
	public void inputDialog() {
		String inputDialog = "";
		do {
			inputDialog = JOptionPane.showInputDialog("메뉴\n1.입력 2.검색 3.종료");
			if(inputDialog.length() == INPUT_DIALOG_LENGTH) {
				switch(inputDialog) {
				case INPUT : inputData();
					break;
				case GET : getData();
					break;
				default : exitFlag = true;
				}	// end switch
			} else {
				inputDialog = JOptionPane.showInputDialog("잘못입력하셨습니다. 다시 입력하세요.\n메뉴\n1.입력 2.검색 3.종료");
				setDefaultCloseOperation(EXIT_ON_CLOSE);
			}	// end else
		} while(!exitFlag);
	}	// inputDialog
	
	public void inputData() {
		String inputData = "";
		String[] inputArr = null;
		inputData = JOptionPane.showInputDialog("학생의 정보를 아래와 같이 입력해주세요.\n예)학생번호,이름,자바점수,오라클점수");
		if(inputData != null) {
			inputArr = inputData.split(",");
			switch(inputArr.length) {
			case INPUT_DATA_LENGTH :
				pushData(inputArr);
				break;
			default : 
				inputData = JOptionPane.showInputDialog("잘못입력하셨습니다. 다시 입력하세요.\n학생의 정보를 아래와 같이 입력해주세요.\n예)학생번호,이름,자바점수,오라클점수");
			}	// end switch
		}	// end if
	}	// inputData
	
	public void pushData(String[] inputArr) {
		int number = parseInt(inputArr[0]);
		String name = inputArr[1];
		int javaScore = parseInt(inputArr[2]);
		int oracleScore = parseInt(inputArr[3]);
		StuInfoVO siVO = new StuInfoVO(number, name, javaScore, oracleScore);
		if(map.containsKey(number)) {
			JOptionPane.showMessageDialog(null, "이미 존재하는 번호입니다.", "메시지", JOptionPane.PLAIN_MESSAGE);
			inputData();
		} else {
			map.put(number, siVO);
			set = map.keySet();
		}	// end else
	}	// pushData
	
	public void getData() {
		System.out.print("번호\t이름\t자바점수\t오라클점수\t합계\t평균\n");
		Integer[] arr = new Integer[set.size()];	// set, map은 순서대로 정렬되지 않기 때문에 정렬을 위한 배열 생성
		set.toArray(arr);
		Arrays.sort(arr);
		StuInfoVO temp = null;
		int totalScore = 0;
		double avgScore = 0;
		for(int i : arr) {
			temp = map.get(i);
			totalScore = temp.getJavaScore() + temp.getOracleScore();
			avgScore = totalScore / 2.0;
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%.2f\n", temp.getNumber(), temp.getName(), temp.getJavaScore(), temp.getOracleScore(), totalScore, avgScore);
		}	// end for
	}	// getData				

	public static void main(String[] args) {
		HomeWork0124 hw = new HomeWork0124();
		hw.inputDialog();
	}	// main

}	// class