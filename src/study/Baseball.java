package study;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Baseball {
	
	private boolean flag = true;
	public static final int PLAY = 1;
	public static final int EXIT = 2;
	
	public void playGame() {
		System.out.println("숫자 야구 게임을 시작합니다.");
		playerChoice();
	}	// playGame
	
	public void playerChoice() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("중복 없는 0~9 사이 숫자 세 개를 입력하세요(예: 1,2,3): ");
			do {
				String pl = sc.nextLine();
				String[] plInputStr = pl.split(",");
				int[] plInput = new int[3];
				for(int i = 0; i < plInputStr.length; i++) {
					plInput[i] = Integer.parseInt(plInputStr[i]);
				}	// end for
				if(checkValid(plInput)) {
					System.out.print("중복된 숫자가 있거나 0~9 사이의 숫자가 아닙니다. 다시 입력하세요: ");
					continue;	// 입력으로 돌아가기
				} else {
					compare(pcChoice(), plInput);
				}	// end else
			} while(flag);
		} catch(ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
			System.out.println("데이터에 문제가 있음: " + e.getMessage());
		} // end catch
	}	// playerChoice
	
	public boolean checkValid(int[] plInput) {
		for(int i = 0; i < plInput.length; i++) {
			if(plInput[i] < 0 || plInput[i] > 10) {
				return true;
			}	// end if
			for(int j = 0; j < i; j++) {
				if(plInput[i] == plInput[j]) {
					return true;
				} // end if
			}	// end for
		}	// end for
		return false;
	}	// checkdupl
	
	public int[] pcChoice() {
		Random r = new Random();
		int[] pc = new int[3];
		for(int i = 0; i < pc.length; i++) {
			pc[i] = r.nextInt(10);
			for(int j = 0; j < i; j++) {	// 중복제거
				if(pc[i] == pc[j]) {
					i--;
				}	// end if
			}	// end for
		}	// end for
		return pc;
	}	// pcChoice
	
	public void compare(int[] pcChoice, int[] playerChoice) {
		int strike = 0;
	    int ball = 0;

	    for(int i = 0; i < pcChoice.length; i++) {
	        if(pcChoice[i] == playerChoice[i]) {
	            strike++;
	        } else {
	            for(int j = 0; j < pcChoice.length; j++) {
	                if(j != i && pcChoice[j] == playerChoice[i]) {
	                    ball++;
	                    break;  // 중복된 값이 있으면 종료
	                }	// end if
	            }	// end for
	        }	// end else
	    }	// end for

	    System.out.println(Arrays.toString(pcChoice) + " " + Arrays.toString(playerChoice));

	    if(strike == 3) {
	        System.out.println("3스트라이크");
	    } else if(strike == 0 && ball == 3) {
	        System.out.println("3볼");
	    } else if(strike > 0 && ball > 0) {
	        System.out.println("1볼 1스트라이크");
	    } else {
	        System.out.println("아웃");
	    }	// end else 
	    replayOrExit();
	}	// compare
	
	public void replayOrExit() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("게임을 다시 시작하려면 1, 종료하려면 2를 입력하세요: ");
		int replayOrExit = sc2.nextInt();
		if(replayOrExit == PLAY) {
			playerChoice();
		} else if(replayOrExit == EXIT) {
			System.out.println("게임 종료");
			flag = false;
		} else {
			System.out.print("잘못된 숫자를 입력했습니다. ");
			replayOrExit();
		}	// end else
	}	// replayOrExit

	public static void main(String[] args) {
		Baseball bb = new Baseball();
		bb.playGame();
	}	// main

}	// class