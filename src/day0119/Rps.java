package day0119;

import java.util.Random;
import java.util.Scanner;

public class Rps {
	
	public static final int SCISSOR = 0, ROCK = 1, PAPER = 2;
	public static final int TIE = 0;
	public static final int VICTORY1 = -1, VICTORY2 = 2;
	
	Scanner sc = new Scanner(System.in);
	Random random = new Random();

	// 가위: 0, 바위: 1, 보:2
	int pcChoice = 0, playerChoice = 0, result = 0, cntGame = 1;
	boolean flag1 = true, flag2 = true;
	String playerInput = "", endGame = "";
	

	public Rps() {
		while(flag1) {
			playGame();
			endOrPlayGame();
		}	// end while
	}	// Rps
	
	public void playGame() {
		while(cntGame < 4) {
			System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");
			playerInput = sc.nextLine();

			returnException(playerInput);

			pcChoice = random.nextInt(3);
			returnPlayerChoice(playerInput);
			
			result = playerChoice - pcChoice;
			printResult(result);
			
			cntGame++;
		}	// end while
	}	// playGame
	
	public void returnException(String playerInput) {
		if(!(playerInput.equals("가위") || playerInput.equals("바위") || playerInput.equals("보"))){
			throw new IllegalArgumentException("잘못 입력하셨습니다.");
		}	// end if
	}	// returnException
	
	public int returnPlayerChoice(String playerInput) {
		if(playerInput.equals("가위")) {
			playerChoice = SCISSOR;
		} else if(playerInput.equals("바위")) {
			playerChoice = ROCK;
		} else if(playerInput.equals("보")){
			playerChoice = PAPER;
		}	// end else
		return playerChoice;
	}	// returnPlayerChoice
	
	public void printResult(int result) {
		if(result == TIE) {
			System.out.println(cntGame + "번째 게임 무승부");
		} else if(result == VICTORY1 || result == VICTORY2) {
			System.out.println(cntGame + "번째 게임 플레이어 패");
		} else {
			System.out.println(cntGame + "번째 게임 플레이어 승");
		}	// end else
	}	// printResult
	
	public void endOrPlayGame() {
		while(flag2) {
			System.out.print("게임을 계속하려면 \"계속\"을, 종료하려면 \"종료\"를 입력하세요: ");
			endGame = sc.nextLine();
			if(endGame.equals("계속") || endGame.equals("종료")) {
				if(endGame.equals("계속")) {
					cntGame = 1;
					break;
				} else {
					flag1 = false;
					break;
				}	// end else
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}	// end else
		}	// end while
	}	// endOrPlayGame

	public static void main(String[] args) {
		new Rps();
	}	// main

}	// class